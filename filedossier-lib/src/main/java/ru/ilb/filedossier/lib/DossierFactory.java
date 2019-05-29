/*
 * Copyright 2019 slavb.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.ilb.filedossier.lib;

import java.net.URI;
import ru.ilb.filedossier.context.DossierContext;
import ru.ilb.filedossier.context.DossierContextBuilder;
import java.util.List;
import java.util.stream.Collectors;
import ru.ilb.filedossier.model.DossierModel;
import ru.ilb.filedossier.model.DossierFileModel;
import ru.ilb.filedossier.model.DossierModelRepository;
import ru.ilb.filedossier.model.RepresentationModel;
import ru.ilb.filedossier.representation.Representation;
import ru.ilb.filedossier.representation.RepresentationFactory;
import ru.ilb.filedossier.scripting.TemplateEvaluator;
import ru.ilb.filedossier.store.Store;
import ru.ilb.filedossier.store.StoreFactory;

/**
 *
 * @author slavb
 */
public class DossierFactory {

    /**
     * Репозиторий моделей досье
     */
    private final DossierModelRepository dossierModelRepository;

    /**
     * Файловое хранилище
     * TODO возможно реализацию нужно иметь возможность настраивать в досье
     */
    private final StoreFactory storeFactory;

    /**
     * Построитель контекста досье
     * TODO возможно реализацию нужно иметь возможность настраивать в досье
     */
    private final DossierContextBuilder dossierContextBuilder;

    /**
     * Движок вычисления выражений по-умолчанию
     * TODO возможно реализацию нужно иметь возможность настраивать в досье
     */
    private final TemplateEvaluator templateEvaluator;

    /**
     * Фабрика представлений
     */
    private final RepresentationFactory representationFactory = new RepresentationFactory();

    public DossierFactory(DossierModelRepository dossierModelRepository, StoreFactory storeFactory, DossierContextBuilder dossierContextBuilder, TemplateEvaluator templateEvaluator) {
        this.dossierModelRepository = dossierModelRepository;
        this.storeFactory = storeFactory;
        this.dossierContextBuilder = dossierContextBuilder;
        this.templateEvaluator = templateEvaluator;
    }

    public Dossier getDossier(String dossierKey, String dossierCode) {
        DossierModel dossierModel = dossierModelRepository.getDossierModel(dossierCode);
        URI dossierModelUri = dossierModelRepository.getDossierModelUri(dossierCode);
        Store store = storeFactory.getFileStorage(dossierKey);
        DossierContext dossierContext = dossierContextBuilder.createDossierContext(dossierKey, dossierCode);
        return getDossier(dossierModelUri, dossierModel, store, dossierContext);
    }

    private Dossier getDossier(URI dossierModelUri, DossierModel dossierModel, Store store, DossierContext dossierContext) {
        String code = dossierModel.getCode();
        String name = dossierModel.getName();

        List<DossierFile> dossierFiles = dossierModel.getDossierFiles().stream()
                .map(modelFile -> createDossierFile(dossierModelUri, modelFile, store, dossierContext))
                .collect(Collectors.toList());

        return new DossierImpl(code, name, dossierFiles);
    }

    private DossierFile createDossierFile(URI dossierModelUri, DossierFileModel modelFile, Store store, DossierContext dossierContext) {

        List<Representation> representations = modelFile.getRepresentations().stream()
                .map(representationModel -> createRepresentation(dossierModelUri, representationModel))
                .collect(Collectors.toList());

        DossierFileImpl df = new DossierFileImpl(
                store,
                templateEvaluator.evaluateStringExpression(modelFile.getCode(), dossierContext),
                templateEvaluator.evaluateStringExpression(modelFile.getName(), dossierContext),
                Boolean.FALSE.equals(templateEvaluator.evaluateBooleanExpression(modelFile.getRequired(), dossierContext)),
                Boolean.FALSE.equals(templateEvaluator.evaluateBooleanExpression(modelFile.getReadonly(), dossierContext)),
                Boolean.TRUE.equals(templateEvaluator.evaluateBooleanExpression(modelFile.getVisible(), dossierContext)),
                store.isExist(modelFile.getCode()),
                modelFile.getMediaType(),
                representations);
        return df;
    }

    private Representation createRepresentation(URI dossierModelUri, RepresentationModel representationModel) {
        return representationFactory.createRepresentation(representationModel.getMediaType(), dossierModelUri.resolve(representationModel.getStylesheet()), dossierModelUri.resolve(representationModel.getTemplate()));
    }

}

import React, { Suspense, useState, useEffect, useRef } from 'react';
import { Table, Button, Message, Loader } from 'semantic-ui-react';
import {dossierApi} from './Config';
import DossierResource from './DossierResource';
import {useResource} from './ReactHelper';

function Dossier( { dossierKey, dossierPackage, dossierCode }) {
    const dossierResource = new DossierResource(dossierApi, {dossierKey, dossierPackage, dossierCode});

    const [dossier, getDossier] = useResource(function () {
        console.log('Dossier.useResource');
        return dossierResource.getDossier();
    });

    useEffect(function () {
        console.log('Dossier.useEffect');
        getDossier();
    }, [dossierKey, dossierPackage, dossierCode]);

    return (
            <div className="fileDosser">
                {dossier.loading && <Loader active /> }
                {dossier.error && <Message error visible content={dossier.error}/> }
                {dossier.value && <div>
                    Name: {dossier.value.name}
                    {dossier.value.dossierFile &&
                                    <Table celled>
                                        <Table.Header>
                                            <Table.Row>
                                                <Table.HeaderCell>Файл</Table.HeaderCell>
                                                <Table.HeaderCell>Действие</Table.HeaderCell>
                                            </Table.Row>
                                        </Table.Header>

                                        <Table.Body>
                                            {dossier.value.dossierFile.map((file) => <DossierFile file={file} key={file.code} />)}
                                        </Table.Body>
                                    </Table>
                    }

                </div>}
            </div>
            );
}

function DossierFile( { file: { code, name }, resource }) {

    const inputFileEl = useRef(null)

    const remove = () => {
        console.log('code', code);
        resource.getDossier();
    };

    const upload = () => {
        console.log('code', code, inputFileEl.current.files);
        const files = inputFileEl.current.files;

        const formData = new FormData();

        for (var i = 0; i < files.length; i++) {
            formData.append(i, files.item(i));
        }

        resource.setContents(code, formData);
        resource.getDossier();
    };


    return <Table.Row>
    <Table.Cell>{name}</Table.Cell>
    <Table.Cell><Button content="Удалить" onClick={remove}/>
        <input ref={inputFileEl} type='file' onChange={upload}  />
    </Table.Cell>
</Table.Row>;
}

export default Dossier;
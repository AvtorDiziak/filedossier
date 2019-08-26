/**
 * Created by Apache CXF WadlToJava code generator
**/
package ru.ilb.filedossier.api;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import org.apache.cxf.jaxrs.json.basic.JsonMapObject;

public interface DossierContextResource {

    /**
     * get dossier context
     */
    @GET
    @Produces("application/json")
    @Valid
    JsonMapObject getContext();

    /**
     * store dossier cotnext
     * @param jsonmapobject processInstances data
     */
    @PUT
    @Consumes("application/json")
    void setContext(@Valid JsonMapObject jsonmapobject);

}
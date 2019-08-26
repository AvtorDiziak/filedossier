/**
 * Created by Apache CXF WadlToJava code generator
**/
package ru.ilb.filedossier.api;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import ru.ilb.filedossier.view.DossierView;

/**
 * 
 */
public interface DossierResource {

    /**
     * get dossier instance
     */
    @GET
    @Produces({"application/xml", "application/json", "application/xhtml+xml" })
    @Valid
    DossierView getDossier();

    /**
     * @param fileCode file code
     */
    @Path("/dossierfiles/{fileCode}")
    DossierFileResource getDossierFileResource(@PathParam("fileCode") String fileCode);

}
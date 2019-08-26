/**
 * Created by Apache CXF WadlToJava code generator
**/
package ru.ilb.filedossier.api;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

public interface DossierFileResource {

    /**
     * get dossier file contents
     */
    @GET
    @Produces({"application/vnd.oasis.opendocument.spreadsheet", "application/pdf" })
    @Valid
    Response getContents();

    /**
     * store dossier file contents
     * @param inputstream file data
     */
    @PUT
    @Consumes("*/*")
    void setContents(InputStream inputstream);

    /**
     * store dossier file contents
     */
    @POST
    @Consumes("multipart/form-data")
    void uploadContents(@Multipart("file") File file);

    @Path("/context")
    DossierContextResource getDossierContextResource();

}
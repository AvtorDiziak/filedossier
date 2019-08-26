/**
 * Created by Apache CXF WadlToJava code generator
**/
package ru.ilb.filedossier.api;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("dossiers")
public interface DossiersResource {

    /**
     * @param dossierKey dossier key
     * @param dossierPackage dossier package
     * @param dossierCode dossier code
     */
    @Path("/{dossierKey}/{dossierPackage}/{dossierCode}")
    DossierResource getDossierResource(@PathParam("dossierKey") String dossierKey, @PathParam("dossierPackage") String dossierPackage, @PathParam("dossierCode") String dossierCode);

}
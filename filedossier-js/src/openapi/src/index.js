/**
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from './ApiClient';
import Dossier from './model/Dossier';
import DossierFile from './model/DossierFile';
import DefaultApi from './api/DefaultApi';


/**
* Client library of openapi-js-client.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var OpenapiJsClient = require('index'); // See note below*.
* var xxxSvc = new OpenapiJsClient.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new OpenapiJsClient.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new OpenapiJsClient.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new OpenapiJsClient.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 1.0.0
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The Dossier model constructor.
     * @property {module:model/Dossier}
     */
    Dossier,

    /**
     * The DossierFile model constructor.
     * @property {module:model/DossierFile}
     */
    DossierFile,

    /**
    * The DefaultApi service constructor.
    * @property {module:api/DefaultApi}
    */
    DefaultApi
};

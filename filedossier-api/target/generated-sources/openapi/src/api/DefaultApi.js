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


import ApiClient from "../ApiClient";
import Dossier from '../model/Dossier';
import JsonMapObject from '../model/JsonMapObject';

/**
* Default service.
* @module api/DefaultApi
* @version 1.0-SNAPSHOT
*/
export default class DefaultApi {

    /**
    * Constructs a new DefaultApi. 
    * @alias module:api/DefaultApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * @param {String} fileCode 
     * @param {String} dossierKey 
     * @param {String} dossierPackage 
     * @param {String} dossierCode 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getContentsWithHttpInfo(fileCode, dossierKey, dossierPackage, dossierCode) {
      let postBody = null;
      // verify the required parameter 'fileCode' is set
      if (fileCode === undefined || fileCode === null) {
        throw new Error("Missing the required parameter 'fileCode' when calling getContents");
      }
      // verify the required parameter 'dossierKey' is set
      if (dossierKey === undefined || dossierKey === null) {
        throw new Error("Missing the required parameter 'dossierKey' when calling getContents");
      }
      // verify the required parameter 'dossierPackage' is set
      if (dossierPackage === undefined || dossierPackage === null) {
        throw new Error("Missing the required parameter 'dossierPackage' when calling getContents");
      }
      // verify the required parameter 'dossierCode' is set
      if (dossierCode === undefined || dossierCode === null) {
        throw new Error("Missing the required parameter 'dossierCode' when calling getContents");
      }

      let pathParams = {
        'fileCode': fileCode,
        'dossierKey': dossierKey,
        'dossierPackage': dossierPackage,
        'dossierCode': dossierCode
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/vnd.oasis.opendocument.spreadsheet', 'application/pdf'];
      let returnType = null;
      return this.apiClient.callApi(
        '/dossiers/{dossierKey}/{dossierPackage}/{dossierCode}/dossierfiles/{fileCode}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * @param {String} fileCode 
     * @param {String} dossierKey 
     * @param {String} dossierPackage 
     * @param {String} dossierCode 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getContents(fileCode, dossierKey, dossierPackage, dossierCode) {
      return this.getContentsWithHttpInfo(fileCode, dossierKey, dossierPackage, dossierCode)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * @param {String} fileCode 
     * @param {String} dossierKey 
     * @param {String} dossierPackage 
     * @param {String} dossierCode 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/JsonMapObject} and HTTP response
     */
    getContextWithHttpInfo(fileCode, dossierKey, dossierPackage, dossierCode) {
      let postBody = null;
      // verify the required parameter 'fileCode' is set
      if (fileCode === undefined || fileCode === null) {
        throw new Error("Missing the required parameter 'fileCode' when calling getContext");
      }
      // verify the required parameter 'dossierKey' is set
      if (dossierKey === undefined || dossierKey === null) {
        throw new Error("Missing the required parameter 'dossierKey' when calling getContext");
      }
      // verify the required parameter 'dossierPackage' is set
      if (dossierPackage === undefined || dossierPackage === null) {
        throw new Error("Missing the required parameter 'dossierPackage' when calling getContext");
      }
      // verify the required parameter 'dossierCode' is set
      if (dossierCode === undefined || dossierCode === null) {
        throw new Error("Missing the required parameter 'dossierCode' when calling getContext");
      }

      let pathParams = {
        'fileCode': fileCode,
        'dossierKey': dossierKey,
        'dossierPackage': dossierPackage,
        'dossierCode': dossierCode
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonMapObject;
      return this.apiClient.callApi(
        '/dossiers/{dossierKey}/{dossierPackage}/{dossierCode}/dossierfiles/{fileCode}/context', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * @param {String} fileCode 
     * @param {String} dossierKey 
     * @param {String} dossierPackage 
     * @param {String} dossierCode 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/JsonMapObject}
     */
    getContext(fileCode, dossierKey, dossierPackage, dossierCode) {
      return this.getContextWithHttpInfo(fileCode, dossierKey, dossierPackage, dossierCode)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * @param {String} dossierKey 
     * @param {String} dossierPackage 
     * @param {String} dossierCode 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Dossier} and HTTP response
     */
    getDossierWithHttpInfo(dossierKey, dossierPackage, dossierCode) {
      let postBody = null;
      // verify the required parameter 'dossierKey' is set
      if (dossierKey === undefined || dossierKey === null) {
        throw new Error("Missing the required parameter 'dossierKey' when calling getDossier");
      }
      // verify the required parameter 'dossierPackage' is set
      if (dossierPackage === undefined || dossierPackage === null) {
        throw new Error("Missing the required parameter 'dossierPackage' when calling getDossier");
      }
      // verify the required parameter 'dossierCode' is set
      if (dossierCode === undefined || dossierCode === null) {
        throw new Error("Missing the required parameter 'dossierCode' when calling getDossier");
      }

      let pathParams = {
        'dossierKey': dossierKey,
        'dossierPackage': dossierPackage,
        'dossierCode': dossierCode
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/xml', 'application/json', 'application/xhtml+xml'];
      let returnType = Dossier;
      return this.apiClient.callApi(
        '/dossiers/{dossierKey}/{dossierPackage}/{dossierCode}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * @param {String} dossierKey 
     * @param {String} dossierPackage 
     * @param {String} dossierCode 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Dossier}
     */
    getDossier(dossierKey, dossierPackage, dossierCode) {
      return this.getDossierWithHttpInfo(dossierKey, dossierPackage, dossierCode)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * @param {String} fileCode 
     * @param {String} dossierKey 
     * @param {String} dossierPackage 
     * @param {String} dossierCode 
     * @param {Object} opts Optional parameters
     * @param {Object} opts.body 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    setContentsWithHttpInfo(fileCode, dossierKey, dossierPackage, dossierCode, opts) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'fileCode' is set
      if (fileCode === undefined || fileCode === null) {
        throw new Error("Missing the required parameter 'fileCode' when calling setContents");
      }
      // verify the required parameter 'dossierKey' is set
      if (dossierKey === undefined || dossierKey === null) {
        throw new Error("Missing the required parameter 'dossierKey' when calling setContents");
      }
      // verify the required parameter 'dossierPackage' is set
      if (dossierPackage === undefined || dossierPackage === null) {
        throw new Error("Missing the required parameter 'dossierPackage' when calling setContents");
      }
      // verify the required parameter 'dossierCode' is set
      if (dossierCode === undefined || dossierCode === null) {
        throw new Error("Missing the required parameter 'dossierCode' when calling setContents");
      }

      let pathParams = {
        'fileCode': fileCode,
        'dossierKey': dossierKey,
        'dossierPackage': dossierPackage,
        'dossierCode': dossierCode
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['*/*'];
      let returnType = null;
      return this.apiClient.callApi(
        '/dossiers/{dossierKey}/{dossierPackage}/{dossierCode}/dossierfiles/{fileCode}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * @param {String} fileCode 
     * @param {String} dossierKey 
     * @param {String} dossierPackage 
     * @param {String} dossierCode 
     * @param {Object} opts Optional parameters
     * @param {Object} opts.body 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    setContents(fileCode, dossierKey, dossierPackage, dossierCode, opts) {
      return this.setContentsWithHttpInfo(fileCode, dossierKey, dossierPackage, dossierCode, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * @param {String} fileCode 
     * @param {String} dossierKey 
     * @param {String} dossierPackage 
     * @param {String} dossierCode 
     * @param {Object} opts Optional parameters
     * @param {module:model/JsonMapObject} opts.jsonMapObject 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    setContextWithHttpInfo(fileCode, dossierKey, dossierPackage, dossierCode, opts) {
      opts = opts || {};
      let postBody = opts['jsonMapObject'];
      // verify the required parameter 'fileCode' is set
      if (fileCode === undefined || fileCode === null) {
        throw new Error("Missing the required parameter 'fileCode' when calling setContext");
      }
      // verify the required parameter 'dossierKey' is set
      if (dossierKey === undefined || dossierKey === null) {
        throw new Error("Missing the required parameter 'dossierKey' when calling setContext");
      }
      // verify the required parameter 'dossierPackage' is set
      if (dossierPackage === undefined || dossierPackage === null) {
        throw new Error("Missing the required parameter 'dossierPackage' when calling setContext");
      }
      // verify the required parameter 'dossierCode' is set
      if (dossierCode === undefined || dossierCode === null) {
        throw new Error("Missing the required parameter 'dossierCode' when calling setContext");
      }

      let pathParams = {
        'fileCode': fileCode,
        'dossierKey': dossierKey,
        'dossierPackage': dossierPackage,
        'dossierCode': dossierCode
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['*/*'];
      let returnType = null;
      return this.apiClient.callApi(
        '/dossiers/{dossierKey}/{dossierPackage}/{dossierCode}/dossierfiles/{fileCode}/context', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * @param {String} fileCode 
     * @param {String} dossierKey 
     * @param {String} dossierPackage 
     * @param {String} dossierCode 
     * @param {Object} opts Optional parameters
     * @param {module:model/JsonMapObject} opts.jsonMapObject 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    setContext(fileCode, dossierKey, dossierPackage, dossierCode, opts) {
      return this.setContextWithHttpInfo(fileCode, dossierKey, dossierPackage, dossierCode, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * @param {String} fileCode 
     * @param {String} dossierKey 
     * @param {String} dossierPackage 
     * @param {String} dossierCode 
     * @param {Object} opts Optional parameters
     * @param {File} opts.file 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    uploadContentsWithHttpInfo(fileCode, dossierKey, dossierPackage, dossierCode, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'fileCode' is set
      if (fileCode === undefined || fileCode === null) {
        throw new Error("Missing the required parameter 'fileCode' when calling uploadContents");
      }
      // verify the required parameter 'dossierKey' is set
      if (dossierKey === undefined || dossierKey === null) {
        throw new Error("Missing the required parameter 'dossierKey' when calling uploadContents");
      }
      // verify the required parameter 'dossierPackage' is set
      if (dossierPackage === undefined || dossierPackage === null) {
        throw new Error("Missing the required parameter 'dossierPackage' when calling uploadContents");
      }
      // verify the required parameter 'dossierCode' is set
      if (dossierCode === undefined || dossierCode === null) {
        throw new Error("Missing the required parameter 'dossierCode' when calling uploadContents");
      }

      let pathParams = {
        'fileCode': fileCode,
        'dossierKey': dossierKey,
        'dossierPackage': dossierPackage,
        'dossierCode': dossierCode
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
        'file': opts['file']
      };

      let authNames = [];
      let contentTypes = ['multipart/form-data'];
      let accepts = ['*/*'];
      let returnType = null;
      return this.apiClient.callApi(
        '/dossiers/{dossierKey}/{dossierPackage}/{dossierCode}/dossierfiles/{fileCode}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * @param {String} fileCode 
     * @param {String} dossierKey 
     * @param {String} dossierPackage 
     * @param {String} dossierCode 
     * @param {Object} opts Optional parameters
     * @param {File} opts.file 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    uploadContents(fileCode, dossierKey, dossierPackage, dossierCode, opts) {
      return this.uploadContentsWithHttpInfo(fileCode, dossierKey, dossierPackage, dossierCode, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}

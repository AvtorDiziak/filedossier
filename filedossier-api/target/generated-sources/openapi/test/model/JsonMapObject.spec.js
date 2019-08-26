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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.FiledossierApi);
  }
}(this, function(expect, FiledossierApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new FiledossierApi.JsonMapObject();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('JsonMapObject', function() {
    it('should create an instance of JsonMapObject', function() {
      // uncomment below and update the code to test JsonMapObject
      //var instane = new FiledossierApi.JsonMapObject();
      //expect(instance).to.be.a(FiledossierApi.JsonMapObject);
    });

    it('should have the property updateCount (base name: "updateCount")', function() {
      // uncomment below and update the code to test the property updateCount
      //var instane = new FiledossierApi.JsonMapObject();
      //expect(instance).to.be();
    });

  });

}));

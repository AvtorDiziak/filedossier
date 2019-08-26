# FiledossierApi.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContents**](DefaultApi.md#getContents) | **GET** /dossiers/{dossierKey}/{dossierPackage}/{dossierCode}/dossierfiles/{fileCode} | 
[**getContext**](DefaultApi.md#getContext) | **GET** /dossiers/{dossierKey}/{dossierPackage}/{dossierCode}/dossierfiles/{fileCode}/context | 
[**getDossier**](DefaultApi.md#getDossier) | **GET** /dossiers/{dossierKey}/{dossierPackage}/{dossierCode} | 
[**setContents**](DefaultApi.md#setContents) | **PUT** /dossiers/{dossierKey}/{dossierPackage}/{dossierCode}/dossierfiles/{fileCode} | 
[**setContext**](DefaultApi.md#setContext) | **PUT** /dossiers/{dossierKey}/{dossierPackage}/{dossierCode}/dossierfiles/{fileCode}/context | 
[**uploadContents**](DefaultApi.md#uploadContents) | **POST** /dossiers/{dossierKey}/{dossierPackage}/{dossierCode}/dossierfiles/{fileCode} | 



## getContents

> getContents(fileCode, dossierKey, dossierPackage, dossierCode)



### Example

```javascript
import FiledossierApi from 'filedossier-api';

let apiInstance = new FiledossierApi.DefaultApi();
let fileCode = "fileCode_example"; // String | 
let dossierKey = "dossierKey_example"; // String | 
let dossierPackage = "dossierPackage_example"; // String | 
let dossierCode = "dossierCode_example"; // String | 
apiInstance.getContents(fileCode, dossierKey, dossierPackage, dossierCode).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileCode** | **String**|  | 
 **dossierKey** | **String**|  | 
 **dossierPackage** | **String**|  | 
 **dossierCode** | **String**|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.oasis.opendocument.spreadsheet, application/pdf


## getContext

> JsonMapObject getContext(fileCode, dossierKey, dossierPackage, dossierCode)



### Example

```javascript
import FiledossierApi from 'filedossier-api';

let apiInstance = new FiledossierApi.DefaultApi();
let fileCode = "fileCode_example"; // String | 
let dossierKey = "dossierKey_example"; // String | 
let dossierPackage = "dossierPackage_example"; // String | 
let dossierCode = "dossierCode_example"; // String | 
apiInstance.getContext(fileCode, dossierKey, dossierPackage, dossierCode).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileCode** | **String**|  | 
 **dossierKey** | **String**|  | 
 **dossierPackage** | **String**|  | 
 **dossierCode** | **String**|  | 

### Return type

[**JsonMapObject**](JsonMapObject.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDossier

> Dossier getDossier(dossierKey, dossierPackage, dossierCode)



### Example

```javascript
import FiledossierApi from 'filedossier-api';

let apiInstance = new FiledossierApi.DefaultApi();
let dossierKey = "dossierKey_example"; // String | 
let dossierPackage = "dossierPackage_example"; // String | 
let dossierCode = "dossierCode_example"; // String | 
apiInstance.getDossier(dossierKey, dossierPackage, dossierCode).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dossierKey** | **String**|  | 
 **dossierPackage** | **String**|  | 
 **dossierCode** | **String**|  | 

### Return type

[**Dossier**](Dossier.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json, application/xhtml+xml


## setContents

> setContents(fileCode, dossierKey, dossierPackage, dossierCode, opts)



### Example

```javascript
import FiledossierApi from 'filedossier-api';

let apiInstance = new FiledossierApi.DefaultApi();
let fileCode = "fileCode_example"; // String | 
let dossierKey = "dossierKey_example"; // String | 
let dossierPackage = "dossierPackage_example"; // String | 
let dossierCode = "dossierCode_example"; // String | 
let opts = {
  'body': null // Object | 
};
apiInstance.setContents(fileCode, dossierKey, dossierPackage, dossierCode, opts).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileCode** | **String**|  | 
 **dossierKey** | **String**|  | 
 **dossierPackage** | **String**|  | 
 **dossierCode** | **String**|  | 
 **body** | **Object**|  | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## setContext

> setContext(fileCode, dossierKey, dossierPackage, dossierCode, opts)



### Example

```javascript
import FiledossierApi from 'filedossier-api';

let apiInstance = new FiledossierApi.DefaultApi();
let fileCode = "fileCode_example"; // String | 
let dossierKey = "dossierKey_example"; // String | 
let dossierPackage = "dossierPackage_example"; // String | 
let dossierCode = "dossierCode_example"; // String | 
let opts = {
  'jsonMapObject': new FiledossierApi.JsonMapObject() // JsonMapObject | 
};
apiInstance.setContext(fileCode, dossierKey, dossierPackage, dossierCode, opts).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileCode** | **String**|  | 
 **dossierKey** | **String**|  | 
 **dossierPackage** | **String**|  | 
 **dossierCode** | **String**|  | 
 **jsonMapObject** | [**JsonMapObject**](JsonMapObject.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


## uploadContents

> uploadContents(fileCode, dossierKey, dossierPackage, dossierCode, opts)



### Example

```javascript
import FiledossierApi from 'filedossier-api';

let apiInstance = new FiledossierApi.DefaultApi();
let fileCode = "fileCode_example"; // String | 
let dossierKey = "dossierKey_example"; // String | 
let dossierPackage = "dossierPackage_example"; // String | 
let dossierCode = "dossierCode_example"; // String | 
let opts = {
  'file': "/path/to/file" // File | 
};
apiInstance.uploadContents(fileCode, dossierKey, dossierPackage, dossierCode, opts).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileCode** | **String**|  | 
 **dossierKey** | **String**|  | 
 **dossierPackage** | **String**|  | 
 **dossierCode** | **String**|  | 
 **file** | **File**|  | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: */*

# OmnimessageApi

All URIs are relative to *https://api.messente.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendOmnimessage**](OmnimessageApi.md#sendOmnimessage) | **POST** /omnimessage | Sends an Omnimessage


<a name="sendOmnimessage"></a>
# **sendOmnimessage**
> OmniMessageCreateSuccessResponse sendOmnimessage(body)

Sends an Omnimessage



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OmnimessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

OmnimessageApi apiInstance = new OmnimessageApi();
Omnimessage body = new Omnimessage(); // Omnimessage | Omnimessage to be sent
try {
    OmniMessageCreateSuccessResponse result = apiInstance.sendOmnimessage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OmnimessageApi#sendOmnimessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Omnimessage**](Omnimessage.md)| Omnimessage to be sent |

### Return type

[**OmniMessageCreateSuccessResponse**](OmniMessageCreateSuccessResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# OmnimessageApi

All URIs are relative to *https://api.messente.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelScheduledMessage**](OmnimessageApi.md#cancelScheduledMessage) | **DELETE** /omnimessage/{omnimessage_id} | Cancels a scheduled Omnimessage
[**sendOmnimessage**](OmnimessageApi.md#sendOmnimessage) | **POST** /omnimessage | Sends an Omnimessage


<a name="cancelScheduledMessage"></a>
# **cancelScheduledMessage**
> cancelScheduledMessage(omnimessageId)

Cancels a scheduled Omnimessage

### Example
```java
import com.messente.*;
import com.messente.auth.*;
import com.messente.omnichannel.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("<MESSENTE_API_USERNAME>");
        basicAuth.setPassword("<MESSENTE_API_PASSWORD>");

        OmnimessageApi apiInstance = new OmnimessageApi();
        Omnimessage omnimessage = new Omnimessage(); // Omnimessage | Omnimessage to be sent
        Viber viber = new Viber();
        viber.text("Viber text");
        viber.sender("Messente");
        SMS sms = new SMS();
        sms.text("SMS text");

        omnimessage.setMessages(Arrays.<Object>asList(viber, sms));
        omnimessage.setTo("<recipient phone number in e.164 format>");

        try {
            OmniMessageCreateSuccessResponse result = apiInstance.sendOmnimessage(omnimessage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OmnimessageApi#sendOmnimessage");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **omnimessageId** | [**UUID**](.md)| UUID of the scheduled Omnimessage to be cancelled |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendOmnimessage"></a>
# **sendOmnimessage**
> OmniMessageCreateSuccessResponse sendOmnimessage(omnimessage)

Sends an Omnimessage

### Example
```java

import com.messente.*;
import com.messente.auth.*;
import com.messente.omnichannel.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("<MESSENTE_API_USERNAME>");
        basicAuth.setPassword("<MESSENTE_API_PASSWORD>");

        OmnimessageApi apiInstance = new OmnimessageApi();
        Omnimessage omnimessage = new Omnimessage(); // Omnimessage | Omnimessage to be sent
        Viber viber = new Viber();
        viber.text("Viber text");
        viber.sender("Messente");
        SMS sms = new SMS();
        sms.text("SMS text");

        omnimessage.setMessages(Arrays.<Object>asList(viber, sms));
        omnimessage.setTo("<recipient phone number in international format>");

        try {
            OmniMessageCreateSuccessResponse result = apiInstance.sendOmnimessage(omnimessage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OmnimessageApi#sendOmnimessage");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **omnimessage** | [**Omnimessage**](Omnimessage.md)| Omnimessage to be sent |

### Return type

[**OmniMessageCreateSuccessResponse**](OmniMessageCreateSuccessResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


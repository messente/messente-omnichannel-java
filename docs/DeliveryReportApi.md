# DeliveryReportApi

All URIs are relative to *https://api.messente.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveDeliveryReport**](DeliveryReportApi.md#retrieveDeliveryReport) | **GET** /omnimessage/{omnimessage_id}/status | Retrieves the delivery report for the Omnimessage


<a name="retrieveDeliveryReport"></a>
# **retrieveDeliveryReport**
> DeliveryReportResponse retrieveDeliveryReport(omnimessageId)

Retrieves the delivery report for the Omnimessage

### Example
```java
public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: basicAuth
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

        WhatsApp whatsApp = new WhatsApp();
        WhatsAppText whatsAppText = new WhatsAppText();
        whatsAppText.body("WhatsApp text");
        whatsApp.text(whatsAppText);

        omnimessage.setMessages(Arrays.<Object>asList(whatsApp, viber, sms));
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
 **omnimessageId** | [**UUID**](.md)| UUID of the Omnimessage to for which the delivery report is to be retrieved |

### Return type

[**DeliveryReportResponse**](DeliveryReportResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


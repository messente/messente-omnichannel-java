# omnichannel-java
This is the beta version of Omnichannel API client


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.messente.omnichannel</groupId>
  <artifactId>omnichannel-java</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.messente.omnichannel:omnichannel-java:0.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/omnichannel-java-0.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.messente.omnichannel.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setUsername("<MESSENTE_API_USERNAME>");
        defaultClient.setPassword("<MESSENTE_API_PASSWORD>");

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
            System.out.println(e.getResponseBody());
        }

    }

}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.messente.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DeliveryReportApi* | [**retrieveDeliveryReport**](docs/DeliveryReportApi.md#retrieveDeliveryReport) | **GET** /omnimessage/{omnimessage_id}/status | Retrieves the delivery report for the Omnimessage
*OmnimessageApi* | [**cancelScheduledMessage**](docs/OmnimessageApi.md#cancelScheduledMessage) | **DELETE** /omnimessage/{omnimessage_id} | Cancels a scheduled Omnimessage
*OmnimessageApi* | [**sendOmnimessage**](docs/OmnimessageApi.md#sendOmnimessage) | **POST** /omnimessage | Sends an Omnimessage


## Documentation for Models

 - [Channel](docs/Channel.md)
 - [DeliveryReportResponse](docs/DeliveryReportResponse.md)
 - [DeliveryResult](docs/DeliveryResult.md)
 - [Err](docs/Err.md)
 - [ErrorItem](docs/ErrorItem.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Message](docs/Message.md)
 - [MessageResult](docs/MessageResult.md)
 - [OmniMessageCreateSuccessResponse](docs/OmniMessageCreateSuccessResponse.md)
 - [Omnimessage](docs/Omnimessage.md)
 - [ResponseErrorCode](docs/ResponseErrorCode.md)
 - [ResponseErrorTitle](docs/ResponseErrorTitle.md)
 - [SMS](docs/SMS.md)
 - [Status](docs/Status.md)
 - [Viber](docs/Viber.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

messente@messente.com


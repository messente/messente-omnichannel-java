# omnichannel-java

Java library for Messente Omnichannel API


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

public class Main {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR_MESSENTE_API_USERNAME");
        basicAuth.setPassword("YOUR_MESSENTE_API_PASSWORD");

        OmnimessageApi apiInstance = new OmnimessageApi();
        Omnimessage body = new Omnimessage(); // Omnimessage | Omnimessage to be sent
        ScenarioItem scenarioItem = new ScenarioItem();
        scenarioItem.setChannel(ScenarioItem.ChannelEnum.VIBER);

        Scenarios scenarios = new Scenarios();
        scenarios.add(scenarioItem);
        Viber viber = new Viber().text("Hello!").sender("Messente");
        body.to("<phone number>").scenarios(scenarios).viber(viber);

        try {
            OmniMessageCreateSuccessResponse result = apiInstance.sendOmnimessage(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
            System.err.println("Exception when calling OmnimessageApi#sendOmnimessage");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.messente.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OmnimessageApi* | [**sendOmnimessage**](docs/OmnimessageApi.md#sendOmnimessage) | **POST** /omnimessage | Sends an Omnimessage


## Documentation for Models

 - [ErrorResponse](docs/ErrorResponse.md)
 - [MessageResult](docs/MessageResult.md)
 - [OmniMessageCreateSuccessResponse](docs/OmniMessageCreateSuccessResponse.md)
 - [Omnimessage](docs/Omnimessage.md)
 - [SMS](docs/SMS.md)
 - [ScenarioItem](docs/ScenarioItem.md)
 - [Scenarios](docs/Scenarios.md)
 - [Viber](docs/Viber.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

admin@messente.com


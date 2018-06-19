# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

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



# DeliveryResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Status**](Status.md) |  |  [optional]
**channel** | [**Channel**](Channel.md) |  |  [optional]
**messageId** | [**UUID**](UUID.md) | Unique identifier for the message |  [optional]
**error** | **String** | Human-readable description of what went wrong, *null* in case of success or if the messages has not been processed yet |  [optional]
**err** | [**ErrEnum**](#ErrEnum) | Machine-readable error code, &#x60;null&#x60; when the message has not been processed yet * 0 - No error * 1 - Delivery failure * 2 - Sending message expired * 3 - Invalid number * 4 - Error crediting account * 5 - Invalid number format * 6 - Too many identical messages * 7 - Sender name not allowed * 8 - Operator blacklisted * 9 - Unroutable * 999 - General temporary error  |  [optional]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | When this status was received by Omnichannel API |  [optional]


<a name="ErrEnum"></a>
## Enum: ErrEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4
NUMBER_5 | 5
NUMBER_6 | 6
NUMBER_7 | 7
NUMBER_8 | 8
NUMBER_9 | 9
NUMBER_999 | 999




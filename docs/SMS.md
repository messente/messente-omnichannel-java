
# SMS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sender** | **String** | Phone number or alphanumeric sender name |  [optional]
**validity** | **Integer** | After how many minutes this channel is considered as failed and the next channel is attempted |  [optional]
**text** | **String** | Text content of the SMS | 
**autoconvert** | [**AutoconvertEnum**](#AutoconvertEnum) | Defines how non-GSM characters will be treated: - \&quot;on\&quot; Use replacement settings from the account&#39;s [API Auto Replace settings page](https://dashboard.messente.com/api-settings/auto-replace)(default) - \&quot;full\&quot; All non GSM 03.38 characters will be replaced with suitable alternatives - \&quot;off\&quot; Message content is not modified in any way  |  [optional]
**udh** | **String** | hex-encoded string containing SMS UDH |  [optional]
**channel** | **String** |  |  [optional]


<a name="AutoconvertEnum"></a>
## Enum: AutoconvertEnum
Name | Value
---- | -----
FULL | &quot;full&quot;
ON | &quot;on&quot;
OFF | &quot;off&quot;




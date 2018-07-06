/*
 * Omnichannel API
 * This is the beta version of Omnichannel API
 *
 * OpenAPI spec version: 0.0.1
 * Contact: messente@messente.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.messente.omnichannel;

import com.messente.ApiException;
import com.messente.omnichannel.ErrorResponse;
import com.messente.omnichannel.OmniMessageCreateSuccessResponse;
import com.messente.omnichannel.Omnimessage;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OmnimessageApi
 */
@Ignore
public class OmnimessageApiTest {

    private final OmnimessageApi api = new OmnimessageApi();

    
    /**
     * Cancels a scheduled Omnimessage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelScheduledMessageTest() throws ApiException {
        UUID omnimessageId = null;
        api.cancelScheduledMessage(omnimessageId);

        // TODO: test validations
    }
    
    /**
     * Sends an Omnimessage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendOmnimessageTest() throws ApiException {
        Omnimessage omnimessage = null;
        OmniMessageCreateSuccessResponse response = api.sendOmnimessage(omnimessage);

        // TODO: test validations
    }
    
}

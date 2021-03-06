package com.sap.cloud.rest.api.client.exceptions;

import com.sap.cloud.rest.api.client.RequestBuilder;

/**
 * This exception represents an error, occurred while building a {@link Request}
 * object using the {@link RequestBuilder}.
 *
 */
public class RequestBuilderException extends RestApiClientException {

    private static final long serialVersionUID = 1L;

    public RequestBuilderException(String message) {
        super(message);
    }

    public RequestBuilderException(String message, Throwable cause) {
        super(message, cause);
    }

}

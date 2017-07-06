/*
package com.knoldus.hello.api;

import com.lightbend.lagom.javadsl.api.transport.TransportErrorCode;
import com.lightbend.lagom.javadsl.api.transport.TransportException;
import java.util.UUID;

public class MiddlewareTransportException extends TransportException {
    public static final MiddlewareTransportException GENERIC_500 = new MiddlewareTransportException(TransportErrorCode.fromHttp(500), "An unexpected failure was encountered.");
    private final MiddlewareExceptionMessage mem;
    
    public MiddlewareTransportException(TransportErrorCode tec, String errorMessage) {
        this(tec, new MiddlewareExceptionMessage(errorMessage));
    }
    
    public MiddlewareTransportException(TransportErrorCode tec, MiddlewareExceptionMessage mem) {
        super(tec, mem);
        if(tec == null) {
            throw new IllegalArgumentException("A TransportErrorCode is required.");
        } else {
            this.mem = mem;
            this.setStatusCode(Integer.valueOf(tec.http()));
        }
    }
    
    public MiddlewareTransportException(TransportErrorCode tec, Throwable throwable) {
        super(tec, throwable);
        if(tec == null) {
            throw new IllegalArgumentException("A TransportErrorCode is required.");
        } else {
            this.mem = new MiddlewareExceptionMessage(throwable == null?null:throwable.getMessage());
            this.setStatusCode(Integer.valueOf(tec.http()));
        }
    }
    
    public MiddlewareExceptionMessage exceptionMessage() {
        return this.mem;
    }
    
    public String getAdditionalInformation() {
        return this.mem.getAdditionalInformation();
    }
    
    public void setAdditionalInformation(String additionalInformation) {
        this.mem.setAdditionalInformation(additionalInformation);
    }
    
    public String getDeveloperMessage() {
        return this.mem.getDeveloperMessage();
    }
    
    public void setDeveloperMessage(String developerMessage) {
        this.mem.setDeveloperMessage(developerMessage);
    }
    
    public Integer getErrorCode() {
        return this.mem.getErrorCode();
    }
    
    public void setErrorCode(Integer errorCode) {
        this.mem.setErrorCode(errorCode);
    }
    
    public String getErrorMessage() {
        return this.mem.getErrorMessage();
    }
    
    public void setErrorMessage(String errorMessage) {
        this.mem.setErrorMessage(errorMessage);
    }
    
    public UUID getId() {
        return this.mem.getId();
    }
    
    public Integer getStatusCode() {
        return this.mem.getStatusCode();
    }
    
    public void setStatusCode(Integer statusCode) {
        this.mem.setStatusCode(statusCode);
    }
    
    public String getUserMessage() {
        return this.mem.getUserMessage();
    }
    
    public void setUserMessage(String userMessage) {
        this.mem.setUserMessage(userMessage);
    }
}
*/

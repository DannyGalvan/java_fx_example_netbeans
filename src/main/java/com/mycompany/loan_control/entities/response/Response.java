package com.mycompany.loan_control.entities.response;

import java.util.Collection;

import br.com.fluentvalidator.context.Error;

public class Response<T> {
    private boolean success;
    private String message;
    private T data;
    private Collection<Error> errors;

    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @param success the success to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the errors
     */
    public Collection<Error> getErrors() {
        return errors;
    }

    /**
     * @param errors the errors to set
     */
    public void setErrors(Collection<Error> errors) {
        this.errors = errors;
    }
    
}

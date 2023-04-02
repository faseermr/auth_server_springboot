package com.server.authserver.exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ErrorMessage {
    private int statusCode;
    private Date timestamp;

   private Map<String,String> errors ;
    private String description;

    public ErrorMessage(int statusCode, Date timestamp, Map<String,String> errors, String description) {
        this.statusCode = statusCode;
        this.timestamp = timestamp;
        this.errors = errors;
        this.description = description;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public Map<String, String> getErrors() {
        return errors;
    }



    public String getDescription() {
        return description;
    }
}


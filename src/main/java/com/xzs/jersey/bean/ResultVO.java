package com.xzs.jersey.bean;

public class ResultVO {
    String success;
    String message;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "success='" + success + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
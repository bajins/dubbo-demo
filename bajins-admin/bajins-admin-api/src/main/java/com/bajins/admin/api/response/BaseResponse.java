package com.bajins.admin.api.response;

import com.bajins.admin.api.enums.StatusCode;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;

    public BaseResponse() {
    }

    public BaseResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResponse(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    // ---------------------------- 链式编程，返回类本身 ----------------------------


    public BaseResponse data(T data) {
        this.setData(data);
        return this;
    }

    public BaseResponse msg(String msg) {
        this.setMsg(msg);
        return this;
    }

    public BaseResponse code(Integer code) {
        this.setCode(code);
        return this;
    }
}

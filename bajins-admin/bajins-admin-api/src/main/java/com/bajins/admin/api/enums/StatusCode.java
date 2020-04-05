package com.bajins.admin.api.enums;

public enum StatusCode {
    SUCCESS(200,"成功"),
    FAIL(500,"失败"),
    INVALID_PARAMS(412,"")
    ;


    private Integer code;
    private String msg;

    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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
}

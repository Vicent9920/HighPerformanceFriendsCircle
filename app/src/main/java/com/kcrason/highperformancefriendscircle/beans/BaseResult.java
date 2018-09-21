package com.kcrason.highperformancefriendscircle.beans;

/**
 * 创建日期：2018/9/21 0021on 上午 9:06
 * 描述：
 * @author  Vincent
 * QQ：3332168769
 * 备注：
 */
public class BaseResult<T> {

    /**
     * message : SUCCESS
     * data : {}
     * error : 用户所在小区不存在
     */

    private String message;
    private T data;
    private String error;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public static class DataBean {
    }
}

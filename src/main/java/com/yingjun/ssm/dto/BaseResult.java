package com.yingjun.ssm.dto;

import java.io.Serializable;

/**
 * 
 * @author yingjun
 *
 * ajax 请求的返回类型封装JSON结果
 */
public class BaseResult<T> implements Serializable {


	private static final long serialVersionUID = -4185151304730685014L;

	private boolean success;

    private Integer code;

    private T data;

    private String error;

    public BaseResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public BaseResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
	public String toString() {
		return "BaseResult [success=" + success + ", data=" + data + ", error=" + error + "]";
	}

}

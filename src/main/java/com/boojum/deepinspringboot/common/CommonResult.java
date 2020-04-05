package com.boojum.deepinspringboot.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by boojum on 2020/4/5.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private long code;
    private String message;
    private T data;

    /**
     * 成功返回结果
     * @param data  获取的数据
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(T data){
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     * @param data  获取的数据
     * @param message   提示信息
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(T data, String message){
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode){
        return new CommonResult<>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     * @param message   错误信息
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode, String message){
        return new CommonResult<>(errorCode.getCode(), message, null);
    }

    /**
     * 失败返回结果
     * @param message   提示信息
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(String message){
        return new CommonResult<>(ResultCode.FAILED.getCode(), message, null);
    }

    /**
     * 失败返回结果
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(){
        return failed(ResultCode.FAILED);
    }

    /**
     *参数验证失败返回结果
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> validateFailed(){
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message   提示信息
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> validateFailed(String message){
        return failed(ResultCode.VALIDATE_FAILED, message);
    }

    /**
     * 未登录返回结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> unthorized(T data){
        return new CommonResult<>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权返回结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> forbidden(T data){
        return new CommonResult<>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
    }
}

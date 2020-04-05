package com.boojum.deepinspringboot.common;

/**
 * 封装API的错误码
 * Created by boojum on 2020/4/5.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}

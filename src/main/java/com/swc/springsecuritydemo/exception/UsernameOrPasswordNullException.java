package com.swc.springsecuritydemo.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author Wilson
 * @Description: TODO
 * @date 2024/10/8 13:14
 */
public class UsernameOrPasswordNullException extends AuthenticationException {
    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}
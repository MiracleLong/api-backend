package com.hui.api.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dargon
 * @create 2023-07-04
 * 用户登录请求
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;
}

package com.hui.huiapicommon.service;

import com.hui.huiapicommon.model.entity.User;


/**
 * 内部用户服务
 * @author dargon
 * @create 2023-08-26
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}

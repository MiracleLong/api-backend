package com.hui.huiapicommon.service;

/**
 * 内部用户接口信息服务
 * @author dargon
 * @create 2023-08-26
 */
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}

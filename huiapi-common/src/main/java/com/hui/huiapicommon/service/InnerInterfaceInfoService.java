package com.hui.huiapicommon.service;

import com.hui.huiapicommon.model.entity.InterfaceInfo;

/**
 * 内部接口信息服务
 * @author dargon
 * @create 2023-08-26
 */
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
     * @param path 路径
     * @param method 方法
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}

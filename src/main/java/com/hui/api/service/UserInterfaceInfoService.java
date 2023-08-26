package com.hui.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hui.huiapicommon.model.entity.UserInterfaceInfo;


/**
 * 用户接口信息服务
 *
 * @author miracle
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {


    /**
     * 用户调用次数
     * @param userInterfaceInfo
     * @param add
     */
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}

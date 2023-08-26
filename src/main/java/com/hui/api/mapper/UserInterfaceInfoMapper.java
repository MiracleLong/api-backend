package com.hui.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hui.huiapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * 用户接口信息 Mapper
 *
 * @author miracle
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    /**
     * 计数
     * @param limit
     * @return
     */
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}





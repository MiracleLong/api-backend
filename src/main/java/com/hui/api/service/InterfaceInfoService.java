package com.hui.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hui.huiapicommon.model.entity.InterfaceInfo;
import org.apache.ibatis.annotations.Param;

/**
* @author miracle
* @description 针对表【interface_info(接口信息表)】的数据库操作Service
* @createDate 2023-08-04 20:57:54
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(@Param("interfaceInfo") InterfaceInfo interfaceInfo, @Param("add") boolean add);
}

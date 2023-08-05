package com.hui.api.service;

import com.hui.api.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 86176
* @description 针对表【interface_info(接口信息表)】的数据库操作Service
* @createDate 2023-08-04 20:57:54
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}

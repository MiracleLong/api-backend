package com.hui.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hui.api.common.ErrorCode;
import com.hui.api.exception.BusinessException;
import com.hui.api.exception.ThrowUtils;
import com.hui.api.model.entity.InterfaceInfo;
import com.hui.api.model.entity.InterfaceInfo;
import com.hui.api.service.InterfaceInfoService;
import com.hui.api.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author 86176
* @description 针对表【interface_info(接口信息表)】的数据库操作Service实现
* @createDate 2023-08-04 20:57:54
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，参数不能为空
        /*if (add) {
            ThrowUtils.throwIf(StringUtils.isAnyBlank(title, content, tags), ErrorCode.PARAMS_ERROR);
        }*/
        // 有参数则校验
        if (StringUtils.isNotBlank(name)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "内容过长");
        }
    }

}





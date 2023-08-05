package com.hui.api.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dargon
 * @create 2023-07-05
 * 删除请求
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
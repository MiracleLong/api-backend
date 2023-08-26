package com.hui.huiapicommon.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.hui.huiapicommon.model.entity.Post;

/**
 * @author dargon
 * @create 2023-08-26
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostVo extends Post{

    /**
     * 是否已点赞
     */
    private Boolean hasThumb;

    private static final long serialVersionUID = 1L;
}

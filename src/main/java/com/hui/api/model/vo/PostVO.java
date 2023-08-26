package com.hui.api.model.vo;

import com.hui.api.model.entity.Post;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author dargon
 * @create 2023-07-04
 * 帖子视图
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostVO extends Post {

    /**
     * 是否已点赞
     */
    private Boolean hasThumb;

    private static final long serialVersionUID = 1L;
}


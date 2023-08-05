package com.hui.api.model.dto.postfavour;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dargon
 * @create 2023-07-04
 * 收藏 / 取消收藏请求
 */
@Data
public class PostFavourAddRequest implements Serializable {

    /**
     * 帖子 id
     */
    private Long postId;

    private static final long serialVersionUID = 1L;
}
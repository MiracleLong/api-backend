package com.hui.api.model.dto.postfavour;

import com.hui.api.common.PageRequest;
import com.hui.api.model.dto.post.PostQueryRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author dargon
 * @create 2023-07-04
 * 查询收藏请求
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostFavourQueryRequest extends PageRequest implements Serializable {

    /**
     * 帖子查询请求
     */
    private PostQueryRequest postQueryRequest;

    /**
     * 用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}

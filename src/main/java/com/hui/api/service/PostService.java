package com.hui.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hui.api.model.entity.Post;

/**
 * @author dargon
 * @create 2023-07-04
 * 帖子服务
 */
public interface PostService extends IService<Post> {

    /**
     * 校验
     *
     * @param post
     * @param add
     */
    void validPost(Post post, boolean add);

}

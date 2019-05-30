package com.spring.boot.mybatis.demo.entity;

import com.spring.boot.mybatis.demo.controller.ShareBean;

/**
 * @auther xuxq
 * @date 2019/2/19 10:25
 */
public abstract class ShareItem {
    int type;

    public ShareItem(int type) {
        this.type = type;
    }

    public abstract void doShare(ShareBean.ShareListener listener);
}

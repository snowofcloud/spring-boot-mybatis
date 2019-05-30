package com.spring.boot.mybatis.demo.entity;

import com.spring.boot.mybatis.demo.controller.ShareBean;

import static sun.plugin.dom.html.ns4.NS4DOMObject.TYPE_LINK;

/**
 * @auther xuxq
 * @date 2019/2/19 10:27
 */
public class Link extends ShareItem {

    String title;
    String content;
    String link;

    public Link(String link, String title, String content) {
        super(TYPE_LINK);
        this.link = !TextUtils.isEmpty(link) ? link : "default";
        this.title = !TextUtils.isEmpty(title) ? title : "default";
        this.content = !TextUtils.isEmpty(content) ? content : "default";
    }

    @Override
    public void doShare(ShareBean.ShareListener listener) {
        // do share
    }
}

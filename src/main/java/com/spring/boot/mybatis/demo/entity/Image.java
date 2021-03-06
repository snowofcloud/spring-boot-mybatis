package com.spring.boot.mybatis.demo.entity;

import com.spring.boot.mybatis.demo.controller.ShareBean;

import static sun.plugin.dom.html.ns4.NS4DOMObject.TYPE_IMAGE;


public class Image extends ShareItem {

    String imagePath;

    public Image(String imagePath) {
        super(TYPE_IMAGE);
        this.imagePath = !TextUtils.isEmpty(imagePath) ? imagePath : "default";
    }

    @Override
    public void doShare(ShareBean.ShareListener listener) {
        // do share
    }
}

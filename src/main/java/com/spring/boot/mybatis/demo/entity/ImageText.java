package com.spring.boot.mybatis.demo.entity;

import com.spring.boot.mybatis.demo.controller.ShareBean;


public class ImageText extends ShareItem {
    String content;
    String imagePath;
    private static final int TYPE_IMAGE_TEXT = 3;

    public ImageText(String imagePath, String content) {
        super(TYPE_IMAGE_TEXT);
        this.imagePath = !TextUtils.isEmpty(imagePath) ? imagePath : "default";
        this.content = !TextUtils.isEmpty(content) ? content : "default";
    }

    @Override
    public void doShare(ShareBean.ShareListener listener) {
        // do share
    }
}


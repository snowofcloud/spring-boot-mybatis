package com.spring.boot.mybatis.demo.entity;

import com.spring.boot.mybatis.demo.controller.ShareBean;

import static com.sun.javafx.scene.text.TextLayout.TYPE_TEXT;


public class Text extends ShareItem  {

    String content;

    public Text(String content) {
        super(TYPE_TEXT);
        this.content = !TextUtils.isEmpty(content) ? content : "default";
    }

    @Override
    public void doShare(ShareBean.ShareListener listener) {
        // do share
       // Class.forName();
    }
}

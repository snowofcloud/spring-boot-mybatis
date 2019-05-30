package com.spring.boot.mybatis.demo.entity;

import com.spring.boot.mybatis.demo.controller.ShareBean;

public class Test {
    public void share(ShareItem item, ShareBean.ShareListener listener) {
        if (item == null) {
            if (listener != null) {
                listener.onCallback(ShareBean.ShareListener.STATE_FAIL, "ShareItem 不能为 null");
            }
            return;
        }

        if (listener == null) {
            listener = new ShareBean.ShareListener() {
                @Override
                public void onCallback(int state, String msg) {
                    //Log.i("DEBUG", "ShareListener is null");
                }
            };
        }

        shareImpl(item, listener);
    }

    private void shareImpl (ShareItem item, ShareBean.ShareListener listener) {
        item.doShare(listener);
    }
}

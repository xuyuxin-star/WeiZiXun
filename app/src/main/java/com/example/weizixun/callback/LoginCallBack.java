package com.example.weizixun.callback;

import com.example.weizixun.base.BaseCallBack;
import com.example.weizixun.bean.LoginBean;

public interface LoginCallBack extends BaseCallBack<LoginBean> {
    @Override
    void onSuccess(LoginBean loginBean);

    @Override
    void onFail(String error);
}

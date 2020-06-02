package com.example.weizixun.view;

import com.example.weizixun.base.BaseView;
import com.example.weizixun.bean.LoginBean;

public interface LoginView extends BaseView<LoginBean> {
    @Override
    void onSuccess(LoginBean loginBean);

    @Override
    void onFail(String error);
}

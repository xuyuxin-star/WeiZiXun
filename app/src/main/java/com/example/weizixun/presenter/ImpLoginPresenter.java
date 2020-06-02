package com.example.weizixun.presenter;

import android.text.TextUtils;

import com.example.weizixun.base.BasePresenter;
import com.example.weizixun.bean.LoginBean;
import com.example.weizixun.callback.LoginCallBack;
import com.example.weizixun.model.ImpLoginModel;

public class ImpLoginPresenter extends BasePresenter implements LoginCallBack {
    protected ImpLoginModel model;
    @Override
    protected void initModel() {
        model=new ImpLoginModel();
        addModel(model);
    }
    public void login(String name,String pwd){
        if (TextUtils.isEmpty(name)){
            mView.onFail("账号不能为空");
            return;
        }
        if (TextUtils.isEmpty(pwd)){
            mView.onFail("密码不能为空");
            return;
        }
        model.login(name,pwd,this);
    }
    @Override
    public void onSuccess(LoginBean loginBean) {
        mView.onSuccess(loginBean);
    }

    @Override
    public void onFail(String error) {
        mView.onFail(error);
    }
}

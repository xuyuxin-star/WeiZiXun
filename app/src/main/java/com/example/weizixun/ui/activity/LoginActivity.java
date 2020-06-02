package com.example.weizixun.ui.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.weizixun.R;
import com.example.weizixun.base.BaseActivity;
import com.example.weizixun.bean.LoginBean;
import com.example.weizixun.presenter.ImpLoginPresenter;
import com.example.weizixun.view.LoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity<ImpLoginPresenter, LoginView> implements LoginView {

    @BindView(R.id.et_user)
    EditText etUser;
    @BindView(R.id.et_pwd)
    EditText etPwd;
    @BindView(R.id.btn_login)
    Button btnLogin;



    @Override
    protected LoginView initMvpView() {
        return this;
    }

    @Override
    protected ImpLoginPresenter initMvpPresenter() {
        return new ImpLoginPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void onSuccess(LoginBean loginBean) {
        toast("登录成功aaaaa");
    }

    @Override
    public void onFail(String error) {
        toast(error);
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        String name = etUser.getText().toString().trim();
        String pwd = etPwd.getText().toString().trim();
        mPresenter.login(name,pwd);
    }
}
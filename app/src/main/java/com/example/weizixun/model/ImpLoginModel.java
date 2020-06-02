package com.example.weizixun.model;

import com.example.weizixun.base.BaseModel;
import com.example.weizixun.bean.LoginBean;
import com.example.weizixun.callback.LoginCallBack;
import com.example.weizixun.net.ApiService;
import com.example.weizixun.net.BaseObserver;
import com.example.weizixun.net.HttpManager;
import com.example.weizixun.net.RxUtil;

public class ImpLoginModel extends BaseModel {
    public void login(String name, String pwd, final LoginCallBack loginCallBack){
        HttpManager.getHttpManager().getApiService(ApiService.baseUrl,ApiService.class)
                .login(name,pwd)
                .compose(RxUtil.<LoginBean>rxFlowableTransformer())
                .subscribe(new BaseObserver<LoginBean>() {
                    @Override
                    protected void onSuccess(LoginBean loginBean) {
                        int errorCode = loginBean.getErrorCode();
                        if (errorCode == 0){
                            loginCallBack.onSuccess(loginBean);
                        }else{
                            loginCallBack.onFail(loginBean.getErrorMsg());
                        }
                    }
                });
    }
}

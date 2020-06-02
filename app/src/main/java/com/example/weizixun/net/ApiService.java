package com.example.weizixun.net;

import com.example.weizixun.bean.LoginBean;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {
    String baseUrl="https://www.wanandroid.com/";
    @POST("user/login")
    @FormUrlEncoded
    Flowable<LoginBean> login(@Field("username") String userName,@Field("password") String pwd);
}

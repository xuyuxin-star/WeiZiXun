package com.example.weizixun.common;

import android.app.Application;

public class WzxApplication extends Application {
    private static WzxApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application=this;
    }

    public static WzxApplication getApplication() {
        return application;
    }
}

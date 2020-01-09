package com.ls.fragmentation.app;

import android.app.Application;

import me.yokeyword.fragmentation.Fragmentation;

public class MyApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        Fragmentation.builder()
                .stackViewMode(Fragmentation.BUBBLE)// 设置 栈视图 模式为 （默认）悬浮球模式   SHAKE: 摇一摇唤出  NONE：隐藏， 仅在Debug环境生效
//                .debug(BuildConfig.DEBUG)
//                .handleException()
                .install();


    }



}

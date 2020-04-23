package com.example.maokaixin.myapplication;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

public class MyApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
        /**
         * 如果你继承了MutiDexApplication或者覆写了Application中的attachBaseContext()方法。
         * Application类中的逻辑的注意事项：
         * Application中的静态全局变量会比MutiDex的instal()方法优先加载，所以建议避免在Application类中使用静态变量引用main classes.dex文件以外dex文件中的类，可以根据如下所示的方式进行修改：
         */

        final Context mContext = this;
        new Runnable() {

            @Override
            public void run() {
                // put your logic here!  逻辑
                // use the mContext instead of this here  使用mContext替代this
            }
        }.run();
    }
}

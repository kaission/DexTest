package com.example.maokaixin.myapplication;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.multidex.MultiDex;
import android.view.View;

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

        //app 整体黑白 类似于2020.4.4全国哀悼日各大网站、app整个项目黑白
        //https://juejin.im/post/5e88937951882573c66cf99d#heading-5
        initLifecycle();
    }

    private void initLifecycle() {
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            }

            @Override
            public void onActivityStarted(Activity activity) {
                //关键代码,这五行也可以放在BaseActivity里也行
                Paint paint = new Paint();
                ColorMatrix cm = new ColorMatrix();
                cm.setSaturation(0);
                paint.setColorFilter(new ColorMatrixColorFilter(cm));
                activity.getWindow().getDecorView().setLayerType(View.LAYER_TYPE_HARDWARE, paint);
            }

            @Override
            public void onActivityResumed(Activity activity) {
            }

            @Override
            public void onActivityPaused(Activity activity) {
            }

            @Override
            public void onActivityStopped(Activity activity) {
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
            }

        });
    }
}

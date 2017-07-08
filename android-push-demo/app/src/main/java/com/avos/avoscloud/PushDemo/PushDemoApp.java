package com.avos.avoscloud.PushDemo;

import android.app.Application;
//import com.avos.avoscloud.AVAnalytics;
import com.avos.avoscloud.AVOSCloud;

/**
 * Created with IntelliJ IDEA. User: tangxiaomin Date: 4/19/13 Time: 12:57 PM
 */
public class PushDemoApp extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    // 初始化应用信息(这是leancloud公用的)
//    AVOSCloud.initialize(this, "gqd0m4ytyttvluk1tnn0unlvmdg8h4gxsa2ga159nwp85fks",
//        "7gd2zom3ht3vx6jkcmaamm1p2pkrn8hdye2pn4qjcwux1hl1");

    // 初始化应用信息(这是我自己的)
    AVOSCloud.initialize(this, "vtLYMQPmmy1hMEeUQKh5EPqH-gzGzoHsz",
            "KhpjmvNMQvxT6t7tNAinA7V5");

    // 启用崩溃错误统计
//    AVAnalytics.enableCrashReport(this.getApplicationContext(), true);
    AVOSCloud.setLastModifyEnabled(true);
    AVOSCloud.setDebugLogEnabled(true);
  }
}

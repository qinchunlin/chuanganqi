package android.com.apps;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import org.xutils.DbManager;
import org.xutils.x;

import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


/**
 * Created by Dream on 2019-03-14.
 */
public class App extends Application {
    // 全局上下文
    private static Context context;
    public static DbManager dbManager;//数据库存储
    // 此处采用 LinkedList作为容器，增删速度快
    public static LinkedList<Activity> activityLinkedList;
    private ScheduledExecutorService scheduledExecutorService;
    public ScheduledExecutorService getScheduledExecutorService() {
        return scheduledExecutorService;
    }
    static DbManager.DaoConfig daoConfig = new DbManager.DaoConfig()
            .setDbVersion(1)
            .setDbUpgradeListener(new DbManager.DbUpgradeListener() {
                @Override
                public void onUpgrade(DbManager db, int oldVersion, int newVersion) {

                }
            });

    public App() {

    }

    /**
     * 获取全局上下文
     */
    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        context = this.getApplicationContext();
        super.onCreate();
        x.Ext.init(this);
        //x.Ext.setDebug(BuildConfig.DEBUG); // 是否输出debug日志, 开启debug会影响性能.
        if (dbManager == null) {
            dbManager = x.getDb(daoConfig);
        }
        scheduledExecutorService = Executors.newScheduledThreadPool(3);
        Date date = new Date();


        activityLinkedList = new LinkedList<>();

        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                activityLinkedList.add(activity);
                // 在Activity启动时（onCreate()） 写入Activity实例到容器内
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                activityLinkedList.remove(activity);
                // 在Activity结束时（Destroyed（）） 写出Activity实例
            }

            @Override
            public void onActivityStarted(Activity activity) {
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

        });
    }

    public  void exitApp() {

        // 逐个退出Activity
        for (Activity activity : activityLinkedList) {
            activity.finish();
        }


    }


}

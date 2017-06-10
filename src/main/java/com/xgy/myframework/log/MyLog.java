package com.xgy.myframework.log;

/**
 * Created by gowild.cn on 2017/6/10.
 */
public class MyLog {

    private MyLog() {}

    private static MyLog myLog = null;

    public static MyLog getInstance() {
        if (null == myLog) {
            synchronized (MyLog.class) {
                if (null == myLog) {
                    myLog = new MyLog();
                }
            }
        }
        return myLog;
    }

    public void info(String msg) {
        System.out.println(msg);
    }



}

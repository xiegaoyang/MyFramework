package com.xgy.myframework;

import java.net.ServerSocket;

/**
 * Created by gowild.cn on 2017/6/10.
 */
public class MyServer {

    private final String ip = "localhost";
    private final int port = 12345;

    private boolean isRunning = false;

    private ServerSocket serverSocket = null;

    public boolean init() {



        return true;
    }

    public boolean uninit() {
        return true;
    }

    public boolean start() {

        while (isRunning) {

        }

        return true;
    }


    public static void main(String[] args) {

        MyServer myServer = new MyServer();

        if (!myServer.init()) {
            MyLog.getInstance().info("服务器初始化失败.");
            return;
        }

        if (!myServer.start()) {
            MyLog.getInstance().info("服务器初始化失败.");
            return;
        }

        if (!myServer.uninit()) {
            MyLog.getInstance().info("服务器反初始化失败.");
        }

    }

}

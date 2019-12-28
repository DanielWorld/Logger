package com.danielworld.logger;

import android.util.Log;

/**
 * Copyright (c) op7773hons@gmail.com
 * Created by daniel on 2019-12-29
 */
public class Logger {

    private static boolean mEnabled = BuildConfig.DEBUG;

    private Logger() {

    }

    public static void setEnabled(boolean isEnabled) {
        mEnabled = isEnabled;
    }

    private static String buildLogMsg(String message) {
        Thread thread = Thread.currentThread();
        StackTraceElement ste = thread.getStackTrace()[4];
        StringBuilder sb = new StringBuilder();
        sb.append("(thread : ");
        sb.append(thread.getName());
        sb.append(")");
        sb.append("[[");
        sb.append(ste.getFileName());
        sb.append(">");
        sb.append(ste.getMethodName());
        sb.append(">#");
        sb.append(ste.getLineNumber());
        sb.append("]] ");
        sb.append(message);
        return sb.toString();
    }

    public static void v(String tag, String msg) {
        if (mEnabled) {
            Log.v(tag, buildLogMsg(msg));
        }
    }

    public static void d(String tag, String msg) {
        if (mEnabled) {
            Log.v(tag, buildLogMsg(msg));
        }
    }

    public static void i(String tag, String msg) {
        if (mEnabled) {
            Log.v(tag, buildLogMsg(msg));
        }
    }

    public static void w(String tag, String msg) {
        if (mEnabled) {
            Log.v(tag, buildLogMsg(msg));
        }
    }

    public static void e(String tag, String msg) {
        if (mEnabled) {
            Log.v(tag, buildLogMsg(msg));
        }
    }
}

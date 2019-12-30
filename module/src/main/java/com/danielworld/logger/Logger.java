/*
 * Copyright (c) 2019 DanielWorld.
 * @Author Namgyu Park
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.danielworld.logger;

import android.util.Log;

/**
 * Created by Namgyu Park on 2019-12-29
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

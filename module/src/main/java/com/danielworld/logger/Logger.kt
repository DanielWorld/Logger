package com.danielworld.logger

import android.util.Log

/**
 * print log with specific information.
 * <br><br>
 * Created by Daniel Park on 2019-12-18
 */
object Logger {

    private var mEnabled = BuildConfig.DEBUG

    fun setEnabled(isEnabled: Boolean) {
        mEnabled = isEnabled
    }

    private fun buildLogMsg(message: String): String {
        val thread = Thread.currentThread()
        val ste = thread.stackTrace[4]
        val sb = StringBuilder()
        sb.append("(thread : ")
        sb.append(thread.name)
        sb.append(")")
        sb.append("[[")
        sb.append(ste.fileName)
        sb.append(">")
        sb.append(ste.methodName)
        sb.append(">#")
        sb.append(ste.lineNumber)
        sb.append("]] ")
        sb.append(message)
        return sb.toString()
    }

    fun v(tag: String, msg: String) {
        if (mEnabled) {
            Log.v(tag, buildLogMsg(msg))
        }

    }

    fun d(tag: String, msg: String) {
        if (mEnabled) {
            Log.d(tag, buildLogMsg(msg))
        }

    }

    fun w(tag: String, msg: String) {
        if (mEnabled) {
            Log.w(tag, buildLogMsg(msg))
        }

    }

    fun w(tag: String, msg: String, throwable: Throwable) {
        if (mEnabled) {
            Log.w(tag, buildLogMsg(msg), throwable)
        }

    }

    fun w(tag: String, throwable: Throwable) {
        if (mEnabled) {
            Log.w(tag, throwable)
        }

    }

    fun e(tag: String, msg: String) {
        if (mEnabled) {
            Log.e(tag, buildLogMsg(msg))
        }

    }

    fun e(tag: String, msg: String, throwable: Throwable) {
        if (mEnabled) {
            Log.e(tag, buildLogMsg(msg), throwable)
        }

    }

    fun e(tag: String, throwable: Throwable) {
        if (mEnabled) {
            Log.e(tag, "", throwable)
        }

    }

    fun i(tag: String, msg: String) {
        if (mEnabled) {
            Log.i(tag, buildLogMsg(msg))
        }

    }
}
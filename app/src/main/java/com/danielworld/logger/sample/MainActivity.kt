package com.danielworld.logger.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danielworld.logger.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Logger.setEnabled(true)
        Logger.d(MainActivity::class.java.name, "Hello debug!")
        Logger.i(MainActivity::class.java.name, "Hello info!")
        Logger.v(MainActivity::class.java.name, "Hello verbose!")
        Logger.w(MainActivity::class.java.name, "Hello warning!")
        Logger.e(MainActivity::class.java.name, "Hello error!")
    }
}

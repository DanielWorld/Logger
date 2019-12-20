package com.danielworld.logger.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danielworld.logger.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Logger.d(MainActivity::class.java.name, "Hello!")
    }
}

package com.example.builderpattern_18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val configuration: Configuration = ConfigurationBuilder()
            .setLatency(1000)
            .setUserColor(256)
            .setSensitivity(100)

            .build()
    }
}
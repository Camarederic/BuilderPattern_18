package com.example.builderpattern_18

import android.graphics.Color

data class Configuration(
    val latency: Int,
    val userColor: Int,
    val sensitivity: Int,
)

class ConfigurationBuilder() {

    var latency: Int = 300
    var userColor: Int = Color.BLUE
    var sensitivity: Int = 0

    fun setLatency(latency: Int): ConfigurationBuilder {
        this.latency = latency
        return this
    }

    fun setUserColor(userColor: Int): ConfigurationBuilder {
        this.userColor = userColor
        return this
    }

    fun setSensitivity(sensitivity: Int): ConfigurationBuilder{
        this.sensitivity = sensitivity
        return this
    }

    fun build(): Configuration{
        return Configuration(
            latency = latency,
            userColor = userColor,
            sensitivity = sensitivity
        )
    }
}
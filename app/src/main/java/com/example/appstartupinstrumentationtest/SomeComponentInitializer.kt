package com.example.appstartupinstrumentationtest

import android.content.Context
import android.util.Log
import androidx.startup.Initializer

class SomeComponentInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        // Manual Hilt injection
        val initializerEntryPoint = InitializerEntryPoint.resolve(context)
        initializerEntryPoint.inject(this)

        //TODO: initilization code...
        Log.d("AAAAA", "SomeComponentInitializer-initializing code...")
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}

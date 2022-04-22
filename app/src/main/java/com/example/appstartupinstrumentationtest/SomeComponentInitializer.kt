package com.example.appstartupinstrumentationtest

import android.content.Context
import android.util.Log
import androidx.startup.Initializer
import dagger.hilt.android.EarlyEntryPoints

class SomeComponentInitializer : Initializer<Unit> {

    private lateinit var someDependency: SomeDependency

    override fun create(context: Context) {
        // Manual Hilt injection
        someDependency = EarlyEntryPoints.get(context, InitializerEntryPoint::class.java).someDependency()

        //TODO: initilization code...
        Log.d("AAAAA", "SomeComponentInitializer-initializing code... someDependency: $someDependency")
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}

package com.example.appstartupinstrumentationtest

import android.content.Context
import android.util.Log
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface InitializerEntryPoint {

    fun inject(someComponentInitializer: SomeComponentInitializer)

    companion object {
        fun resolve(context: Context): InitializerEntryPoint {
            Log.d("AAAAA", "InitializerEntryPoint-resolving entrypoints...")
            val appContext = context.applicationContext ?: throw IllegalStateException("Should have an application context by now")
            return EntryPointAccessors.fromApplication(appContext, InitializerEntryPoint::class.java)
        }
    }
}

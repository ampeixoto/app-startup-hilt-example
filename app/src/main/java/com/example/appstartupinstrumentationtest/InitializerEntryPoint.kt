package com.example.appstartupinstrumentationtest

import dagger.hilt.InstallIn
import dagger.hilt.android.EarlyEntryPoint
import dagger.hilt.components.SingletonComponent

@EarlyEntryPoint
@InstallIn(SingletonComponent::class)
interface InitializerEntryPoint {

    fun someDependency(): SomeDependency

}

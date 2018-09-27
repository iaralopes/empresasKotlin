package com.example.iaralopes.empresaskotlin

import android.app.Application
import android.content.Context
import com.example.iaralopes.empresaskotlin.Dagger.Component
import com.example.iaralopes.empresaskotlin.Dagger.DaggerComponent
import com.example.iaralopes.empresaskotlin.Dagger.Module

class MyApplication : Application() {

    lateinit var mComponent: Component

    companion object {
        lateinit var instance: MyApplication
            private set
    }


    override fun onCreate() {
        super.onCreate()

        instance = this

        mComponent = DaggerComponent.builder()
                .module(Module())
                .build()
    }


    fun getComponent() : Component = mComponent


}
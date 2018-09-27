package com.example.iaralopes.empresaskotlin

import android.app.Application
import android.content.Context
import android.content.ContextWrapper
import android.content.SharedPreferences
import kotlin.coroutines.experimental.coroutineContext

object SharedPreferencesUtil  {


    val sharedPreferences = MyApplication.instance.applicationContext
            .getSharedPreferences("My Preferences",
                    Context.MODE_PRIVATE)

    val sharedPreferencesEditor = sharedPreferences.edit()


    fun putString (key: String, value: String) {
        sharedPreferencesEditor.putString(key,value)
        sharedPreferencesEditor.commit()
    }

    fun getString (key: String, defaultValue: String) : String? {
        return sharedPreferences.getString(key, defaultValue)
    }


}
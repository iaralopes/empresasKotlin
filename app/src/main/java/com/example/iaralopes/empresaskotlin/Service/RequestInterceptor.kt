package com.example.iaralopes.empresaskotlin.Service

import com.example.iaralopes.empresaskotlin.MyApplication
import com.example.iaralopes.empresaskotlin.SharedPreferencesUtil
import okhttp3.Headers
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class RequestInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain?): Response? {
        var request = chain?.request()


        val newRequest = request?.newBuilder()
                ?.header("uid", SharedPreferencesUtil
                        .getString("uid", "" )!!)
                ?.header("client", SharedPreferencesUtil
                        .getString("client", "" )!!)
                ?.header("access-token", SharedPreferencesUtil
                        .getString("access-token", "" )!!)

        val response = chain?.proceed(newRequest?.build()!!)
        saveHeaders(response?.headers())

        return response

    }


    private fun saveHeaders (headers: Headers?) {
        SharedPreferencesUtil.putString("uid", headers?.get("uid")!!)
        SharedPreferencesUtil.putString("client", headers.get("client")!!)
        SharedPreferencesUtil.putString("access-token", headers.get("access-token")!!)
    }
}
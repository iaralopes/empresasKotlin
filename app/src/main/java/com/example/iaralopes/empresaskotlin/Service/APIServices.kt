package com.example.iaralopes.empresaskotlin.Service

import android.databinding.ObservableField
import com.example.iaralopes.empresaskotlin.Enterprise.EnterpriseList
import com.example.iaralopes.empresaskotlin.Enterprise.EnterprisePayload
import com.example.iaralopes.empresaskotlin.Login.Credentials
import com.example.iaralopes.empresaskotlin.Login.UserPayload
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface APIServices {

    @POST("users/auth/sign_in")
    fun authorizeUser(@Body credential : Credentials): Observable<UserPayload>

    @GET("enterprises")
    fun getEnterprises(): Observable<EnterpriseList>

    @GET("enterprises/{id}")
    fun getEnterprise(@Path("id") id: Int): Observable<EnterprisePayload>
}

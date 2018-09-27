package com.example.iaralopes.empresaskotlin.Login

import android.databinding.ObservableField
import com.example.iaralopes.empresaskotlin.Service.RetrofitClient
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class LoginRepository {

    fun getLoginObservable (credentials: Credentials) : Observable<UserPayload> {
        return RetrofitClient().getAPIService()
                .authorizeUser(credentials)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }

}
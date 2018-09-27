package com.example.iaralopes.empresaskotlin.Home

import com.example.iaralopes.empresaskotlin.Enterprise.EnterpriseList
import com.example.iaralopes.empresaskotlin.Login.Credentials
import com.example.iaralopes.empresaskotlin.Login.UserPayload
import com.example.iaralopes.empresaskotlin.Service.RetrofitClient
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class HomeRepository {

    fun getEnterpriseListObservable () : Observable<EnterpriseList> {
        return RetrofitClient().getAPIService()
                .getEnterprises()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}
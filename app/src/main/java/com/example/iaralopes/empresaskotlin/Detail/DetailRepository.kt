package com.example.iaralopes.empresaskotlin.Detail

import com.example.iaralopes.empresaskotlin.Enterprise.EnterpriseList
import com.example.iaralopes.empresaskotlin.Enterprise.EnterprisePayload
import com.example.iaralopes.empresaskotlin.Service.RetrofitClient
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class DetailRepository {

    fun getEnterpriseObservable (enterpriseID: Int) : Observable<EnterprisePayload> {
        return RetrofitClient().getAPIService()
                .getEnterprise(enterpriseID)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}
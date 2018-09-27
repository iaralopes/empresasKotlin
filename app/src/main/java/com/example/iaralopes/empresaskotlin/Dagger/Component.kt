package com.example.iaralopes.empresaskotlin.Dagger

import com.example.iaralopes.empresaskotlin.Detail.DetailActivity
import com.example.iaralopes.empresaskotlin.Home.HomeActivity
import com.example.iaralopes.empresaskotlin.Login.LoginActivity
import dagger.Component

@Component(modules = [(Module::class)]) interface Component {

    fun inject(loginActivity: LoginActivity)
    fun inject(homeActivity: HomeActivity)
    fun inject(detailActivity: DetailActivity)

}
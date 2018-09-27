package com.example.iaralopes.empresaskotlin.Dagger

import com.example.iaralopes.empresaskotlin.Detail.DetailRepository
import com.example.iaralopes.empresaskotlin.Home.HomeRepository
import com.example.iaralopes.empresaskotlin.Login.LoginRepository
import dagger.Module
import dagger.Provides

@Module class Module {

    @Provides fun providesLoginRepository(): LoginRepository {
        return LoginRepository()
    }

    @Provides fun providesHomeRepository(): HomeRepository {
        return HomeRepository()
    }

    @Provides fun providesDetailRepository(): DetailRepository {
        return DetailRepository()
    }


}
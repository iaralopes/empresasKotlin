package com.example.iaralopes.empresaskotlin.Login

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField

class LoginViewModel : ViewModel() {

    lateinit var email : ObservableField<String>
    lateinit var password : ObservableField<String>

    lateinit var loginViewInterface: LoginViewInterface
    lateinit var loginRepository: LoginRepository

    lateinit var credentials: Credentials

    fun setupMVVM (loginViewInterface: LoginViewInterface,
                   loginRepository: LoginRepository) {
        email = ObservableField()
        password = ObservableField()

        this.loginViewInterface = loginViewInterface
        this.loginRepository = loginRepository

    }

    fun getAuthHeaders () {
        credentials = Credentials(email.get(), password.get())

        loginRepository.getLoginObservable(credentials)
                .subscribe(
                        {loginViewInterface.userAuthorized()},
                        {}
                )


    }


}
package com.example.iaralopes.empresaskotlin.Login

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.iaralopes.empresaskotlin.Home.HomeActivity
import com.example.iaralopes.empresaskotlin.MyApplication
import com.example.iaralopes.empresaskotlin.R
import com.example.iaralopes.empresaskotlin.databinding.ActivityLoginBinding
import javax.inject.Inject

class LoginActivity : AppCompatActivity(), LoginViewInterface {


    private lateinit var binding : ActivityLoginBinding

    @Inject lateinit var loginRepository: LoginRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        val loginViewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        binding.viewModel = loginViewModel

        MyApplication.instance.getComponent().inject(this)

        setupMVVM()

    }

    private fun setupMVVM () {
        binding.viewModel?.setupMVVM(this, loginRepository)
    }


    fun onLoginClick(view: View) {
        binding.viewModel?.getAuthHeaders()
    }


    override fun userAuthorized() {
        val enterprisesList = Intent(this@LoginActivity, HomeActivity::class.java)
        this@LoginActivity.startActivity(enterprisesList)
    }




}

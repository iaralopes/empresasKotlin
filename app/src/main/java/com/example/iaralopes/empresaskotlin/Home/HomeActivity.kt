package com.example.iaralopes.empresaskotlin.Home

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.iaralopes.empresaskotlin.Detail.DetailActivity
import com.example.iaralopes.empresaskotlin.MyApplication
import com.example.iaralopes.empresaskotlin.R

import com.example.iaralopes.empresaskotlin.databinding.ActivityHomeBinding
import javax.inject.Inject

class HomeActivity : AppCompatActivity(), HomeViewInterface {

    private lateinit var binding : ActivityHomeBinding

    @Inject lateinit var homeRepository: HomeRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        val homeViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        binding.viewModel = homeViewModel

        MyApplication.instance.getComponent().inject(this)

        setupMVVM()
        getEnterpriseList()
    }

    fun setupMVVM() {
        binding.viewModel?.setupMVVM(this, homeRepository)
    }

    fun getEnterpriseList() {
        binding.viewModel?.getEnterpriseList()
    }

    override fun getDetails(enterpriseID : Int) {
        val intent = Intent(this@HomeActivity, DetailActivity::class.java)
        intent.putExtra("ID", enterpriseID)
        startActivity(intent)
    }
}

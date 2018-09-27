package com.example.iaralopes.empresaskotlin.Detail

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.iaralopes.empresaskotlin.MyApplication
import com.example.iaralopes.empresaskotlin.R
import com.example.iaralopes.empresaskotlin.databinding.ActivityDetailBinding
import javax.inject.Inject

class DetailActivity : AppCompatActivity(), DetailViewInterface {

    private lateinit var binding: ActivityDetailBinding

    @Inject lateinit var detailRepository: DetailRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val enterpriseID = intent.getIntExtra("ID", 0)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        val viewModel = ViewModelProviders.of(this).get(DetailViewModel::class.java)
        binding.viewModel = viewModel

        MyApplication.instance.getComponent().inject(this)

        setupMVVM()
        showDetails(enterpriseID)
    }

    fun setupMVVM() {
        binding.viewModel?.setupMVVM(this, detailRepository)
    }

    private fun showDetails(enterpriseID: Int) {
        binding.viewModel?.showDetails(enterpriseID)
    }


}

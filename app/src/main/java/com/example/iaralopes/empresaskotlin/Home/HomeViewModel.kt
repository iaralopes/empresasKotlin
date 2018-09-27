package com.example.iaralopes.empresaskotlin.Home

import android.arch.lifecycle.ViewModel
import com.example.iaralopes.empresaskotlin.Enterprise.EnterpriseList

class HomeViewModel : ViewModel(), HomeViewModelInterface {

    lateinit var homeViewInterface: HomeViewInterface
    lateinit var homeRepository: HomeRepository
    lateinit var homeViewModelInterface : HomeViewModelInterface

    lateinit var listEnterpriseAdapter: ListEnterpriseAdapter

    fun setupMVVM(homeViewInterface: HomeViewInterface,
                  homeRepository: HomeRepository) {
        this.homeViewInterface = homeViewInterface
        this.homeRepository = homeRepository
        this.homeViewModelInterface = this

        listEnterpriseAdapter = ListEnterpriseAdapter()

    }

    fun getEnterpriseList() {
        homeRepository.getEnterpriseListObservable()
                .subscribe({enterpriseList : EnterpriseList ->
                    listEnterpriseAdapter.addItems(homeViewModelInterface,
                            enterpriseList.enterprises!!)},
                        {})
    }

    override fun getDetails(enterpriseID: Int) {
        homeViewInterface.getDetails(enterpriseID)
    }
}
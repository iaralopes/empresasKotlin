package com.example.iaralopes.empresaskotlin.Detail

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import com.example.iaralopes.empresaskotlin.Enterprise.EnterprisePayload

class DetailViewModel : ViewModel() {

    private lateinit var detailViewInterface: DetailViewInterface
    private lateinit var detailRepository: DetailRepository

    lateinit var detailEnterprise : ObservableField<String>

    fun setupMVVM(detailViewInterface: DetailViewInterface,
                  detailRepository: DetailRepository) {
        this.detailViewInterface = detailViewInterface
        this.detailRepository = detailRepository

        detailEnterprise = ObservableField()
    }

    fun showDetails(enterpriseID: Int) {
        detailRepository.getEnterpriseObservable(enterpriseID)
                .subscribe({enterprisePayload : EnterprisePayload ->
                    detailEnterprise.set(enterprisePayload.enterprise?.description) },
                        {})
    }

}
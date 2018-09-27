package com.example.iaralopes.empresaskotlin.Home

import android.view.View
import com.example.iaralopes.empresaskotlin.Enterprise.Enterprise
import com.example.iaralopes.empresaskotlin.R
import com.example.iaralopes.empresaskotlin.databinding.RowEnterprisesBinding
import com.genius.groupie.Item

class ListEnterpriseItem (homeViewModelInterface: HomeViewModelInterface, enterprise: Enterprise) : Item<RowEnterprisesBinding>() {

    var enterprise : Enterprise = enterprise
    var homeViewModelInterface : HomeViewModelInterface = homeViewModelInterface


    override fun getLayout(): Int {
        return R.layout.row_enterprises
    }


    override fun bind(binding: RowEnterprisesBinding, position: Int) {
        binding.textName.text = enterprise.enterpriseName
        binding.textCategory.text = enterprise.enterpriseType?.enterpriseTypeName
        binding.textCountry.text = enterprise.country

        binding.cardView.setOnClickListener { homeViewModelInterface.getDetails(enterprise.id!!) }

    }


}
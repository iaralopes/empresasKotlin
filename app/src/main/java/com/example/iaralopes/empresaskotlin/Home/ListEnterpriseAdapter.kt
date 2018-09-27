package com.example.iaralopes.empresaskotlin.Home

import com.example.iaralopes.empresaskotlin.Enterprise.Enterprise
import com.example.iaralopes.empresaskotlin.Enterprise.EnterpriseList
import com.genius.groupie.GroupAdapter

class ListEnterpriseAdapter : GroupAdapter() {

    var listEnterprise : List<Enterprise> = emptyList()


    fun addItems(homeViewModelInterface: HomeViewModelInterface,
                 listEnterprise: List<Enterprise>) {
        this.listEnterprise = listEnterprise

        super.clear()

        for (e in listEnterprise) {
            add(ListEnterpriseItem(homeViewModelInterface, e))
        }

        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return if (listEnterprise.isNotEmpty())
            listEnterprise.size
        else 0
    }


}
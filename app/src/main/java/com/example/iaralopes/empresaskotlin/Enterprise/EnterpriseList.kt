package com.example.iaralopes.empresaskotlin.Enterprise

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class EnterpriseList {

    @SerializedName("enterprises")
    @Expose
    var enterprises: List<Enterprise>? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param enterprises
     */
    constructor(enterprises: List<Enterprise>) : super() {
        this.enterprises = enterprises
    }



}


package com.example.iaralopes.empresaskotlin.Enterprise

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class EnterprisePayload {

    @SerializedName("enterprise")
    @Expose
    var enterprise: Enterprise? = null
    @SerializedName("success")
    @Expose
    var success: Boolean? = null

    /**
     * No args constructor for use in serialization
     */
    constructor() {}

    /**
     * @param enterprise
     * @param success
     */
    constructor(enterprise: Enterprise, success: Boolean?) : super() {
        this.enterprise = enterprise
        this.success = success
    }


}
package com.example.iaralopes.empresaskotlin.Enterprise

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class EnterpriseType {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("enterprise_type_name")
    @Expose
    var enterpriseTypeName: String? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param id
     * @param enterpriseTypeName
     */
    constructor(id: Int?, enterpriseTypeName: String) : super() {
        this.id = id
        this.enterpriseTypeName = enterpriseTypeName
    }



}


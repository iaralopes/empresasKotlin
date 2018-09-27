package com.example.iaralopes.empresaskotlin.Enterprise

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Enterprise {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("email_enterprise")
    @Expose
    var emailEnterprise: Any? = null
    @SerializedName("facebook")
    @Expose
    var facebook: Any? = null
    @SerializedName("twitter")
    @Expose
    var twitter: Any? = null
    @SerializedName("linkedin")
    @Expose
    var linkedin: Any? = null
    @SerializedName("phone")
    @Expose
    var phone: Any? = null
    @SerializedName("own_enterprise")
    @Expose
    var ownEnterprise: Boolean? = null
    @SerializedName("enterprise_name")
    @Expose
    var enterpriseName: String? = null
    @SerializedName("photo")
    @Expose
    var photo: Any? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("city")
    @Expose
    var city: String? = null
    @SerializedName("country")
    @Expose
    var country: String? = null
    @SerializedName("value")
    @Expose
    var value: Int? = null
    @SerializedName("share_price")
    @Expose
    var sharePrice: Int? = null
    @SerializedName("enterprise_type")
    @Expose
    var enterpriseType: EnterpriseType? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param phone
     * @param linkedin
     * @param enterpriseName
     * @param emailEnterprise
     * @param photo
     * @param ownEnterprise
     * @param city
     * @param country
     * @param id
     * @param enterpriseType
     * @param twitter
     * @param sharePrice
     * @param description
     * @param facebook
     * @param value
     */
    constructor(id: Int?, emailEnterprise: Any, facebook: Any, twitter: Any, linkedin: Any, phone: Any, ownEnterprise: Boolean?, enterpriseName: String, photo: Any, description: String, city: String, country: String, value: Int?, sharePrice: Int?, enterpriseType: EnterpriseType) : super() {
        this.id = id
        this.emailEnterprise = emailEnterprise
        this.facebook = facebook
        this.twitter = twitter
        this.linkedin = linkedin
        this.phone = phone
        this.ownEnterprise = ownEnterprise
        this.enterpriseName = enterpriseName
        this.photo = photo
        this.description = description
        this.city = city
        this.country = country
        this.value = value
        this.sharePrice = sharePrice
        this.enterpriseType = enterpriseType
    }

}

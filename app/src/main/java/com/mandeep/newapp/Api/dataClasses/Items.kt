package com.mandeep.newapp.Api.dataClasses

data class Items(
    val app_center: List<AppCenter>,
    val `data`: List<Data>,
    val home: List<Home>,
    val is_home_enable: Boolean,
    val message: String,
    val more_apps: List<Any>,
    val native_add: NativeAdd,
    val status: Int,
    val translator_ads_id: TranslatorAdsId
)
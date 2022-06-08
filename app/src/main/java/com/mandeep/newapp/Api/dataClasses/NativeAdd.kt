package com.mandeep.newapp.Api.dataClasses

data class NativeAdd(
    val id: Int,
    val image: String,
    val image_active: Int,
    val is_active: Int,
    val package_name: String,
    val playstore_link: String,
    val position: Int
)
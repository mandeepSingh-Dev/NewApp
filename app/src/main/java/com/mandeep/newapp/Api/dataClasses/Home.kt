package com.mandeep.newapp.Api.dataClasses

data class Home(
    val catgeory: String,
    val id: Int,
    val is_active: Int,
    val name: String,
    val position: Int,
    val status: Int,
    val sub_category: List<SubCategoryX>
)
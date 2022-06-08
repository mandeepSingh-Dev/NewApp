package com.mandeep.newapp.Api

import androidx.room.Query
import com.mandeep.newapp.Api.dataClasses.SubCategory
import retrofit2.Response
import retrofit2.http.GET // hello plz run first precticl is it done .?
//actually sir there is some bug in logic so i think i should forward to next practical to save the time
//ok and what about next practical you have only 30 min left for it
//omk sir
//continue okok
interface DaoInterface {

    @GET("home/sub_category")
    suspend fun getHomeSubcategory():Response<SubCategory>
}
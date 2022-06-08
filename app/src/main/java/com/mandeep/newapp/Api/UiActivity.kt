package com.mandeep.newapp.Api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.RequestFuture
import com.android.volley.toolbox.Volley
import com.google.gson.JsonObject
import com.mandeep.newapp.Api.dataClasses.SubCategory
import com.mandeep.newapp.R
import com.mandeep.newapp.databinding.ActivityUiBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UiActivity : AppCompatActivity() {

    lateinit var binding :ActivityUiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding =  ActivityUiBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)


      /* val retrofit =  Retrofit.Builder().baseUrl("https://artwork.vasundharaapps.com/artwork_cache/api/AdvertiseNewApplications/17/com.fancy.fonts.style.keyboard.emojis.screen.number/")
            .addConverterFactory(GsonConverterFactory.create()).build()


        val daoservice = retrofit.create(DaoInterface::class.java)

        CoroutineScope(Dispatchers.Main).launch {
            Log.d("ekfnedfe",daoservice.getHomeSubcategory().body()?)

        }*/

        val subcategoryList = ArrayList<SubCategory>()
        val requestque =Volley.newRequestQueue(this)

      val jsonObjectRequest =  JsonObjectRequest(Request.Method.GET,"https://artwork.vasundharaapps.com/artwork_cache/api/AdvertiseNewApplications/17/com.fancy.fonts.style.keyboard.emojis.screen.number",null,
          {
               val homeArray = it.getJSONArray("home")

              for(i in 0..homeArray.length().minus(1)) {
                  val jsonObject = homeArray.getJSONObject(i)
                val subCateopgry =  jsonObject.getJSONArray("sub_category")

                  for(i in 0..subCateopgry.length().minus(1))
                  {
                      val jsonobjectsubc =subCateopgry.getJSONObject(i)
                    val name = jsonobjectsubc.getString("name")
                     val icon =   jsonobjectsubc.getString("icon")

                      subcategoryList.add(SubCategory(icon,name))

                  }
              }
             val adapter2= MyAdapter2(subcategoryList,this)
              binding.recyler1slider.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
              binding.recyler1slider.adapter = adapter2
          },
          {

          })

        requestque.add(jsonObjectRequest)
    }
}
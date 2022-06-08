package com.mandeep.newapp.Api

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.mandeep.newapp.Api.dataClasses.SubCategory
import com.mandeep.newapp.R

class MyAdapter2(val arrayList:ArrayList<SubCategory>,val context: Context):RecyclerView.Adapter<MyAdapter2.MyViEWhOLDR>() {

    class MyViEWhOLDR(itemView: View):RecyclerView.ViewHolder(itemView)
    {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViEWhOLDR {
      val view =  LayoutInflater.from(context).inflate(R.layout.slideritem,parent,false)
       return MyViEWhOLDR(view)
    }

    override fun onBindViewHolder(holder: MyViEWhOLDR, position: Int) {
    }

    override fun getItemCount(): Int {

        return arrayList.size
    }
}
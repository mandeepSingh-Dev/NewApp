package com.mandeep.newapp

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

class MyAdapterRscreen(val arraylist:ArrayList<Int>,val context: Context):RecyclerView.Adapter<MyAdapterRscreen.MyViewHolder>() {

   lateinit var mClickListenr:MClickListenr
   val redItems:ArrayList<Int> = ArrayList<Int>()
    val blueItems:ArrayList<Int> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        
       val view =  LayoutInflater.from(context).inflate(R.layout.item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.itemView.setOnClickListener {

            redItems.add(position)

            it.setBackgroundColor(Color.RED)
            var random = getRandom()

           // for(i in 0..redItems.size-1)
         //   {
                if(redItems.contains(random)) {
                    random = getRandom()
                }
              //  if(random == i)
              //  {
                  //  random =
              //  }
          //  }

            Log.d("dkfmd",redItems.size.toString())
            mClickListenr.clickListenr(random,redItems)

        }

    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    }

    interface MClickListenr{
        fun clickListenr(int:Int,arraylist: ArrayList<Int>)
    }

    fun setOnClickListener(mClickListenr: MClickListenr){
        this.mClickListenr = mClickListenr
    }

    fun getRandom():Int {

      return  (0..arraylist.size.minus(1)).random()

    }
}
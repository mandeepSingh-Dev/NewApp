package com.mandeep.newapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.mandeep.newapp.databinding.ActivityMainBinding
import com.mandeep.newapp.databinding.ActivityRandomScreen2Binding

class RandomScreen2 : AppCompatActivity() {

    lateinit var binding: ActivityRandomScreen2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRandomScreen2Binding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        var numstr  = intent.getStringExtra("NUM")
        val num = numstr?.toInt()

        val arrlist = ArrayList<Int>()

        num?.let {
            for(i in 0..it.minus(1))
            {
                arrlist.add(i)

            }
        }
        val adapter = MyAdapterRscreen(arrlist,this)
        val gridLayoutManager = GridLayoutManager(this,4,GridLayoutManager.VERTICAL,false)
        binding.gridrecyclerView.layoutManager = gridLayoutManager
        binding.gridrecyclerView.adapter = adapter

        adapter.setOnClickListener(object:MyAdapterRscreen.MClickListenr{
            override fun clickListenr(int: Int,arrayList: ArrayList<Int>) {
                Log.d("eifnef",int.toString())
                //val view=  binding.gridrecyclerView.findViewById<View>(int)


           val view = gridLayoutManager.findViewByPosition(int)
                view?.setBackgroundColor(Color.BLUE)

            }
        })
    }
}
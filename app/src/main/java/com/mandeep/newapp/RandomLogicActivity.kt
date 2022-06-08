package com.mandeep.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.mandeep.newapp.Api.UiActivity
import com.mandeep.newapp.databinding.ActivityRandomLogicBinding

class RandomLogicActivity : AppCompatActivity() {

    lateinit var binding :ActivityRandomLogicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       binding = ActivityRandomLogicBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.startbutton.setOnClickListener {
            val num = binding.enterNUmber.text.toString()

            val intent = Intent(this,RandomScreen2::class.java)
                .putExtra("NUM",num)
            startActivity(intent)
        }

        binding.apibutton.setOnClickListener {
            startActivity(Intent(this,UiActivity::class.java))
        }





    }
}
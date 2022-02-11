package com.snystudio.kotlindependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.snystudio.kotlindependencyinjection.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        val transportation=Transportation()
        val telkom=Telkom(transportation)
        val bankNI=BankNI(transportation)
        binding.button.setOnClickListener {
            binding.textView.text=telkom.setTransportation()+" dan "+bankNI.setTransportation()
        }

    }
}
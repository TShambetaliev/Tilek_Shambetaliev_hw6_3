package com.example.tilek_shambetaliev_hw6_3.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tilek_shambetaliev_hw6_3.ui.activity.adapter.Adapter
import com.example.tilek_shambetaliev_hw6_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var adapter = Adapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       initViews()
    }

    private fun initViews() {
        with(binding){
            viewPager.adapter=adapter
        }
    }
}
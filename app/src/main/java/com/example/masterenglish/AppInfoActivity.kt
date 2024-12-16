package com.example.masterenglish

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.masterenglish.databinding.ActivityAppInfoBinding


class AppInfoActivity : AppCompatActivity() {
    lateinit var binding : ActivityAppInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppInfoBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)


    }
}
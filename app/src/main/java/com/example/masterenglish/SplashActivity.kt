package com.example.masterenglish

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Looper
import android.view.Window
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

         android.os.Handler(Looper.getMainLooper()).postDelayed({ startActivity(Intent(this@SplashActivity, MainActivity::class.java)) }, 3000)
    }
}
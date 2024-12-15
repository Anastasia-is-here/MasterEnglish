package com.example.masterenglish

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.masterenglish.databinding.ActivityMainBinding
import com.example.masterenglish.databinding.ActivityReadBinding

class ReadActivity : AppCompatActivity() {
    lateinit var binding : ActivityReadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityReadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding = ActivityReadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var url = intent.getStringExtra("pdfLink")
        binding.pdf.webViewClient = WebViewClient()


        binding.pdf.loadUrl("https://docs.google.com/gview?embedded=true&url=$url")
        binding.pdf.settings.builtInZoomControls = true
        binding.pdf.settings.displayZoomControls = false
        binding.pdf.settings.javaScriptEnabled = true
    }
}
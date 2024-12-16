package com.example.masterenglish

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.masterenglish.databinding.ActivityReadBinding

class ReadActivity : AppCompatActivity() {
    lateinit var binding : ActivityReadBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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

        binding.backBtn.setOnClickListener{
            finish()
        }

        binding.title.text = intent.getStringExtra("chapter")

        binding.pdf.setLayerType(View.LAYER_TYPE_HARDWARE, null)
        binding.pdf.settings.cacheMode = WebSettings.LOAD_NO_CACHE
    }
}
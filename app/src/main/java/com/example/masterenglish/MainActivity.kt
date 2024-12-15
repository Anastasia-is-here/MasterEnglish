package com.example.masterenglish

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.masterenglish.Recycler.ArticleAdapter
import com.example.masterenglish.Recycler.Model
import com.example.masterenglish.databinding.ActivityMainBinding
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.postgrest.from
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    val supabase = createSupabaseClient(
        supabaseUrl = "https://dofcnsnrucyhqwrwwfto.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImRvZmNuc25ydWN5aHF3cnd3ZnRvIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MzM5NTkyMTUsImV4cCI6MjA0OTUzNTIxNX0.5SFA9BV3QPxzciaOHhs5mHardkoegXWhn3ObLe5gUZ8"
    ) {
        install(Postgrest)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.rcv.layoutManager = LinearLayoutManager(this)


            LoadData()

    }

    private fun LoadData() {

        lifecycleScope.launch(Dispatchers.IO) {
            var countries = supabase.from("Data")
                .select().decodeList<Model>()

            withContext(Dispatchers.Main){
                binding.rcv.adapter = ArticleAdapter(countries as ArrayList<Model>)
            }
        }
    }
}
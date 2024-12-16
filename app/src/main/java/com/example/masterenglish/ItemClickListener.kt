package com.example.masterenglish

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import com.example.masterenglish.Recycler.Model
import java.io.Reader

interface ItemClickListener {
    fun clickListen(chapter : Model)
}

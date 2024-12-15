package com.example.masterenglish.Recycler

import kotlinx.serialization.Serializable

@Serializable
data class Model (
    val id : Int,
    val chapter : String,
    val pdfLink : String
)
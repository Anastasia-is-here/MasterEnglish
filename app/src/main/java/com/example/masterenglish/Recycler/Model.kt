package com.example.masterenglish.Recycler

import kotlinx.serialization.Serializable

@Serializable
data class Model (
    val id : String,
    val chapter : String,
    val img : String,
    val pdfLink : String
)
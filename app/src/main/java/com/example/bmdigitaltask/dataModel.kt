package com.example.bmdigitaltask

import android.media.Rating
import kotlinx.serialization.Serializable


@Serializable
data class itemProducts(
    val id: Int,
    val title: String,
    val price : Double,
    val description : String,
    val category: String,
    val image: String,
    val rating: rating

)
@Serializable
data class rating (
    val rate: Double,
    val count : Int
)
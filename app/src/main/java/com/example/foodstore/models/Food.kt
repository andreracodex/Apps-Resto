package com.example.foodstore.models

data class Food(
    val id:Int,
    val restaurant: Restaurant,
    val category: Category,
    val description: String,
    val price: Int,
    val rating:Float,
    val image: String
)

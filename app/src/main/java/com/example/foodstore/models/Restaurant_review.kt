package com.example.foodstore.models

data class Restaurant_review(
    val id:Int,
    val user: User,
    val restaurant: Restaurant,
    val content:String,
    val rating:Float
)

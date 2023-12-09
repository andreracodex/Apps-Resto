package com.example.foodstore.models

data class Liked_restaurant(
    val id:Int,
    val user: User,
    val restaurant: Restaurant,
)

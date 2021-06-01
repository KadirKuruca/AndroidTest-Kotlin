package com.kadirkuruca.androidtest_kotlin.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_items")
data class ShoppingItem(
    var name: String,
    var amount: Int,
    var price: Float,
    var sImageUrl: String,
    @PrimaryKey(autoGenerate = true)
    val shoppingId: Int? = null
)
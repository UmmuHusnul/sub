package com.example.subawal.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_user")
class FavoriteUser (
    val login: String,

    @PrimaryKey
    val id: Int,
    val avatar_url: String
)

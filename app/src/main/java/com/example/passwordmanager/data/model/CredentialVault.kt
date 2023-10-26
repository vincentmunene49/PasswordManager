package com.example.passwordmanager.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CredentialVault(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val password: String,
    val userName: String,
    val address: String,
    val notes: String,
    val image: String
)
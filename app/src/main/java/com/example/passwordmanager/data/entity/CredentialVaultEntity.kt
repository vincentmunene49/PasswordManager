package com.example.passwordmanager.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "credential_vault")
data class CredentialVaultEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val password: String,
    val userName: String,
    val address: String,
    val notes: String,
    val image: String
)

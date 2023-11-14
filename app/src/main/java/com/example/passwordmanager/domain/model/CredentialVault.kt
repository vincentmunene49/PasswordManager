package com.example.passwordmanager.domain.model

data class CredentialVault(
    val id: Int,
    val password: String,
    val userName: String,
    val address: String,
    val notes: String,
    val image: String
)

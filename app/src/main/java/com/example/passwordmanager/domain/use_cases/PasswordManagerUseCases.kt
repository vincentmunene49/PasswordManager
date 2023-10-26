package com.example.passwordmanager.domain.use_cases

data class PasswordManagerUseCases(
    val saveCredentials: SaveCredentials,
    val deleteCredential: DeleteCredential,
    val getCredentials: GetCredentials
)
package com.example.passwordmanager.domain

import com.example.passwordmanager.data.model.CredentialVault
import kotlinx.coroutines.flow.Flow

interface Repository {

    fun getCredentials(): Flow<List<CredentialVault>>
    suspend fun saveCredentials(credentialVault: CredentialVault)
    suspend fun deleteCredential(credentialVault: CredentialVault)
}
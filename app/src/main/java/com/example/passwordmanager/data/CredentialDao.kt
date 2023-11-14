package com.example.passwordmanager.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.passwordmanager.data.entity.CredentialVaultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CredentialDao {

    @Query("SELECT * FROM credential_vault")
    fun getCredentials(): Flow<List<CredentialVaultEntity>>

    @Upsert
    suspend fun saveCredentials(credentialVaultEntity: CredentialVaultEntity)

    @Delete
    suspend fun deleteCredentials(credentialVaultEntity: CredentialVaultEntity)
}
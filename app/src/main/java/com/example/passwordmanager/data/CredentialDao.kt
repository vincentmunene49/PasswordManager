package com.example.passwordmanager.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.passwordmanager.data.model.CredentialVault
import com.example.passwordmanager.utils.Resource
import kotlinx.coroutines.flow.Flow

@Dao
interface CredentialDao {

    @Query("SELECT * FROM credentialvault")
    fun getCredentials(): Flow<Resource<List<CredentialVault>>>

    @Upsert
    suspend fun saveCredentials(credentialVault: CredentialVault)

    @Delete
    suspend fun deleteCredentials(credentialVault: CredentialVault)
}
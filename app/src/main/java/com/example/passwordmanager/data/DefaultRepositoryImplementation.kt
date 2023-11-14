package com.example.passwordmanager.data

import com.example.passwordmanager.data.mappers.toEntity
import com.example.passwordmanager.data.mappers.toModel
import com.example.passwordmanager.domain.Repository
import com.example.passwordmanager.domain.model.CredentialVault
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class DefaultRepositoryImplementation @Inject constructor(
    private val credentialDao: CredentialDao
):Repository {
    override fun getCredentials(): Flow<List<CredentialVault>> {
        return credentialDao.getCredentials().map { credentialVaultEntities ->
            credentialVaultEntities.map { credentialVaultEntity ->
                credentialVaultEntity.toModel()
            }
        }
    }

    override suspend fun saveCredentials(credentialVault: CredentialVault) {
        return credentialDao.saveCredentials(credentialVault.toEntity())
    }

    override suspend fun deleteCredential(credentialVault: CredentialVault) {
        return credentialDao.deleteCredentials(credentialVault.toEntity())
    }
}
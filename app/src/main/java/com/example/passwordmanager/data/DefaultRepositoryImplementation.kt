package com.example.passwordmanager.data

import com.example.passwordmanager.data.model.CredentialVault
import com.example.passwordmanager.domain.Repository
import com.example.passwordmanager.utils.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DefaultRepositoryImplementation @Inject constructor(
    private val credentialDao: CredentialDao
):Repository {
    override fun getCredentials(): Flow<Resource<List<CredentialVault>>> {
        return credentialDao.getCredentials()
    }

    override suspend fun saveCredentials(credentialVault: CredentialVault) {
        return credentialDao.saveCredentials(credentialVault)
    }

    override suspend fun deleteCredential(credentialVault: CredentialVault) {
        return credentialDao.deleteCredentials(credentialVault)
    }
}
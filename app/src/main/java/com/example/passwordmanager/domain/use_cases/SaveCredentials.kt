package com.example.passwordmanager.domain.use_cases

import com.example.passwordmanager.data.model.CredentialVault
import com.example.passwordmanager.domain.Repository
import javax.inject.Inject

class SaveCredentials @Inject constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(credentialVault: CredentialVault) =
        repository.saveCredentials(credentialVault)
}
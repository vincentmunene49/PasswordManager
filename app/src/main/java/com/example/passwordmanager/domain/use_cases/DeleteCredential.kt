package com.example.passwordmanager.domain.use_cases

import com.example.passwordmanager.data.entity.CredentialVaultEntity
import com.example.passwordmanager.data.mappers.toModel
import com.example.passwordmanager.domain.Repository
import javax.inject.Inject

class DeleteCredential @Inject constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(credentialVaultEntity: CredentialVaultEntity) =
        repository.deleteCredential(credentialVaultEntity.toModel())
}
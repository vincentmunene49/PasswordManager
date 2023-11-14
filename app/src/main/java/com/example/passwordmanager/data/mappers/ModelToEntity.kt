package com.example.passwordmanager.data.mappers

import com.example.passwordmanager.data.entity.CredentialVaultEntity
import com.example.passwordmanager.domain.model.CredentialVault

fun CredentialVault.toEntity(): CredentialVaultEntity {
    return CredentialVaultEntity(
        id = id,
        password = password,
        userName = userName,
        address = address,
        notes = notes,
        image = image
    )
}
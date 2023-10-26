package com.example.passwordmanager.domain.di

import com.example.passwordmanager.domain.Repository
import com.example.passwordmanager.domain.use_cases.DeleteCredential
import com.example.passwordmanager.domain.use_cases.GetCredentials
import com.example.passwordmanager.domain.use_cases.PasswordManagerUseCases
import com.example.passwordmanager.domain.use_cases.SaveCredentials
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class Module {

    @Provides
    @ViewModelScoped
    fun provideGetCredentials(repository: Repository):GetCredentials{
        return GetCredentials(repository)
    }
    @Provides
    @ViewModelScoped
    fun provideSaveCredentials(repository: Repository):SaveCredentials{
        return SaveCredentials(repository)
    }

    @Provides
    @ViewModelScoped
    fun provideDeleteCredentials(repository: Repository):DeleteCredential{
        return DeleteCredential(repository)
    }

    @Provides
    @ViewModelScoped
    fun providePasswordManagerUseCases(
        saveCredentials: SaveCredentials,
        deleteCredential: DeleteCredential,
        getCredentials: GetCredentials
    ) = PasswordManagerUseCases(
        saveCredentials = saveCredentials,
        deleteCredential = deleteCredential,
        getCredentials = getCredentials
    )
}
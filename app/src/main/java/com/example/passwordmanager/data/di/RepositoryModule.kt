package com.example.passwordmanager.data.di

import com.example.passwordmanager.data.DefaultRepositoryImplementation
import com.example.passwordmanager.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun provideRepository(defaultRepositoryImplementation: DefaultRepositoryImplementation):Repository
}
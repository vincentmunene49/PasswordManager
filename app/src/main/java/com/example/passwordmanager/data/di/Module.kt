package com.example.passwordmanager.data.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.passwordmanager.data.CredentialDao
import com.example.passwordmanager.data.DefaultRepositoryImplementation
import com.example.passwordmanager.data.local.PasswordDatabase
import com.example.passwordmanager.domain.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Module {

    @Provides
    @Singleton
    fun provideDatabase(application: Application) =
        Room.databaseBuilder(application, PasswordDatabase::class.java, "passwordDb").build()

    @Provides
    @Singleton
    fun provideDao(database: PasswordDatabase) = database.getDao()

    @Provides
    @Singleton
    fun provideRepository(credentialDao: CredentialDao):Repository{
        return DefaultRepositoryImplementation(credentialDao)
    }


}
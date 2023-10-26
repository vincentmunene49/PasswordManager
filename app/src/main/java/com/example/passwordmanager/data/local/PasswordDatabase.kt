package com.example.passwordmanager.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.passwordmanager.data.CredentialDao
import com.example.passwordmanager.data.model.CredentialVault

@Database(entities = [CredentialVault::class], version = 1, exportSchema = false)
abstract class PasswordDatabase : RoomDatabase() {

    abstract fun getDao(): CredentialDao
}
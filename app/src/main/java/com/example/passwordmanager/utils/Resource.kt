package com.example.passwordmanager.utils

import com.example.passwordmanager.data.model.CredentialVault

sealed class Resource<T>(val data: T? = null, val message: String? = "") {
    class Success<T>(data: T) : Resource<T>(data = data)
    class Error<T>(message: String?) : Resource<T>(message = message)
}

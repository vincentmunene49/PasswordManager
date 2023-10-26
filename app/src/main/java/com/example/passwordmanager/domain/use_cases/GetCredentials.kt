package com.example.passwordmanager.domain.use_cases

import com.example.passwordmanager.domain.Repository
import javax.inject.Inject

class GetCredentials @Inject constructor(
    private val repository: Repository
) {
    operator fun invoke() = repository.getCredentials()
}
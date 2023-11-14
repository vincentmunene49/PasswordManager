package com.example.passwordmanager.presentation.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.passwordmanager.domain.model.CredentialVault
import com.example.passwordmanager.domain.use_cases.PasswordManagerUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val useCases: PasswordManagerUseCases
) : ViewModel() {

    var state: HomeStates by mutableStateOf(HomeStates())
        private set

    init {
         getPasswords()
    }

    fun sendEvent(event: HomeEvents) {
        when (event) {
            HomeEvents.OnClickAddNew -> {
                state = state.copy(
                    onClickAddNewPassword = true
                )
            }

            is HomeEvents.OnClickFilter -> TODO()
            is HomeEvents.OnClickPasswordCard -> {
                state = state.copy(
                    passwordCardClicked = true
                )
            }

        }
    }

    private fun getPasswords(): List<CredentialVault> {
        return useCases.getCredentials()
    }

}
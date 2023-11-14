package com.example.passwordmanager.presentation.home

import com.example.passwordmanager.domain.model.CredentialVault

data class HomeStates(
    val isLoading:Boolean = false,
    val passwordList:List<CredentialVault> = emptyList(),
    val passwordCardClicked:Boolean = false,
    val onClickAddNewPassword:Boolean = false,
    val errorMessage:String = ""
)
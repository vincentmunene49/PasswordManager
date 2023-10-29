package com.example.passwordmanager.presentation.common

sealed class UiEvents {
    data class OneTimeEvent(val snackBarMessage:String):UiEvents()
}
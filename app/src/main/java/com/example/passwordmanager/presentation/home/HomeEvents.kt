package com.example.passwordmanager.presentation.home

sealed class HomeEvents {
    data object OnClickAddNew : HomeEvents()
    data class OnClickPasswordCard(val id: Int) : HomeEvents()

    data class OnClickFilter(val option: String) : HomeEvents()
}
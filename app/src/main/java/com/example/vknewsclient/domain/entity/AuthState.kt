package com.example.vknewsclient.domain.entity

sealed class AuthState {
    object Authorized : AuthState()

    object NotAuthorized : AuthState()

    object Initial : AuthState()
}
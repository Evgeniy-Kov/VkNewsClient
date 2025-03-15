package com.example.vknewsclient

import android.app.Application
import com.example.vknewsclient.di.ApplicationComponent
import com.example.vknewsclient.di.DaggerApplicationComponent

class VkNewsClientApplication : Application() {

    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(this)
    }

}
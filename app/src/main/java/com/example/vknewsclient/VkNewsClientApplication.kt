package com.example.vknewsclient

import android.app.Application
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.vknewsclient.di.ApplicationComponent
import com.example.vknewsclient.di.DaggerApplicationComponent

class VkNewsClientApplication : Application() {

    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(this)
    }

}

@Composable
fun getApplicationComponent(): ApplicationComponent {
    return (LocalContext.current.applicationContext as VkNewsClientApplication).component
}
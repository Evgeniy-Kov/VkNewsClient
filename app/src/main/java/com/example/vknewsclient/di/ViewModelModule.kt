package com.example.vknewsclient.di

import androidx.lifecycle.ViewModel
import com.example.vknewsclient.presentation.main.MainViewModel
import com.example.vknewsclient.presentation.news.NewsFeedViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(NewsFeedViewModel::class)
    @Binds
    fun bindNewsFeedViewModel(viewModel: NewsFeedViewModel): ViewModel

    @IntoMap
    @ViewModelKey(MainViewModel::class)
    @Binds
    fun bindsMainViewModel(viewModel: MainViewModel): ViewModel

}
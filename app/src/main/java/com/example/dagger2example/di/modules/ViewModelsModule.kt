package com.example.dagger2example.di.modules

import androidx.lifecycle.ViewModel
import com.example.dagger2example.di.ViewModelKey
import com.example.dagger2example.viewmodels.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(viewModel: HomeViewModel?): ViewModel?
}
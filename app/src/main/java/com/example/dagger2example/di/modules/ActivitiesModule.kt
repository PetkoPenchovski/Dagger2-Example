package com.example.dagger2example.di.modules

import com.example.dagger2example.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}
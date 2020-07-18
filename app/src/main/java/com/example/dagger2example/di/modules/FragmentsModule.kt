package com.example.dagger2example.di.modules

import com.example.dagger2example.fragments.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentsModule {

    @ContributesAndroidInjector
    abstract fun bindHomeFragment(): HomeFragment
}
package com.example.dagger2example

import android.app.Activity
import android.app.Application
import com.example.dagger2example.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class DaggerApp : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInject: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
            .applicationBind(this)
            .build()
            .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInject
}
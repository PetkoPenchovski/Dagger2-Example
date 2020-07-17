package com.example.dagger2example.di

import android.app.Application
import com.example.dagger2example.DaggerApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class]
)
interface AppComponent {

    fun inject(app: DaggerApp)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun applicationBind(app: Application): Builder

        fun build(): AppComponent
    }
}
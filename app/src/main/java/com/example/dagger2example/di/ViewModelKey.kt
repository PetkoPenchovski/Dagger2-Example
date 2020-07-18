package com.example.dagger2example.di

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass


@Target(AnnotationTarget.FUNCTION)
@MapKey
internal annotation class ViewModelKey(val value: KClass<out ViewModel>)
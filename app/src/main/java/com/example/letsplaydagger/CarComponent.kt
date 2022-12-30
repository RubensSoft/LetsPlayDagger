package com.example.letsplaydagger

import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        WheelsModule::class
    ]
)
interface CarComponent {
    fun inject(mainActivity: MainActivity)
}
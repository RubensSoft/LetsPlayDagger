package com.example.letsplaydagger.dagger

import com.example.letsplaydagger.MainActivity
import com.example.letsplaydagger.dagger.modules.DieselEngineModule
import com.example.letsplaydagger.dagger.modules.WheelsModule
import dagger.Component

@Component(
    modules = [
        WheelsModule::class,
        DieselEngineModule::class
    ]
)
interface CarComponent {
    fun inject(mainActivity: MainActivity)
}
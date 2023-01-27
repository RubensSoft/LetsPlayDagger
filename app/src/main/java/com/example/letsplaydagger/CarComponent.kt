package com.example.letsplaydagger

import com.example.letsplaydagger.modules.PetrolEnginModule
import com.example.letsplaydagger.modules.WheelsModule
import dagger.Component

@Component(
    modules = [
        WheelsModule::class,
        PetrolEnginModule::class
    ]
)
interface CarComponent {
    fun inject(mainActivity: MainActivity)
}
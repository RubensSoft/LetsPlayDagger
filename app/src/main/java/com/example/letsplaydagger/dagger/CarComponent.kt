package com.example.letsplaydagger.dagger

import com.example.letsplaydagger.MainActivity
import com.example.letsplaydagger.car.Car
import com.example.letsplaydagger.dagger.modules.PetrolEnginModule
import com.example.letsplaydagger.dagger.modules.WheelsModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        WheelsModule::class,
        PetrolEnginModule::class
    ]
)
interface CarComponent {
    fun inject(mainActivity: MainActivity)
    fun getCar(): Car

    @Component.Builder
    interface Builder {
        fun horsePower(
            @BindsInstance
            @Named("horse power") horsePower: Int
        ): Builder

        fun engineCapacity(
            @BindsInstance
            @Named("engine capacity") engineCapacity: Int
        ): Builder

        fun build(): CarComponent
    }
}
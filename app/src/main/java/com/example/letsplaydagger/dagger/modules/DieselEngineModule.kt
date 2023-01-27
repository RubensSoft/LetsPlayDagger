package com.example.letsplaydagger.dagger.modules

import com.example.letsplaydagger.car.engine.DieselEngine
import com.example.letsplaydagger.car.engine.Engine
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class DieselEngineModule @Inject constructor(
    private val horsePower: Int
) {

    @Provides
    fun providesHorsePower(): Int = horsePower

    @Provides
    fun provideEngine(dieselEngine: DieselEngine): Engine = DieselEngine(horsePower)

}
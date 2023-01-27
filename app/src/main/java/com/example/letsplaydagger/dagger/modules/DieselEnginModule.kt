package com.example.letsplaydagger.dagger.modules

import com.example.letsplaydagger.car.engine.DieselEngine
import com.example.letsplaydagger.car.engine.Engine
import com.example.letsplaydagger.car.engine.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEnginModule {

    @Binds
    abstract fun bindEngine(dieselEngine: DieselEngine): Engine

}
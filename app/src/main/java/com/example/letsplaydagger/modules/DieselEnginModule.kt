package com.example.letsplaydagger.modules

import com.example.letsplaydagger.engine.DieselEngine
import com.example.letsplaydagger.engine.Engine
import com.example.letsplaydagger.engine.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEnginModule {

    @Binds
    abstract fun bindEngine(dieselEngine: DieselEngine): Engine

}
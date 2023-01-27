package com.example.letsplaydagger.modules

import com.example.letsplaydagger.engine.Engine
import com.example.letsplaydagger.engine.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEnginModule {

    @Binds
    abstract fun bindEngine(petrolEngine: PetrolEngine): Engine

}
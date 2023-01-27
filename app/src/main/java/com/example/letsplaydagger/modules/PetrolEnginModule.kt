package com.example.letsplaydagger.modules

import com.example.letsplaydagger.engine.Engine
import com.example.letsplaydagger.engine.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEnginModule {

//    Provides method quite redundant,
//    it is better use Binds and modify this class to abstract
//    to have a abstract bind function
//    @Provides
//    fun provideEngine(petrolEngine: PetrolEngine): Engine = petrolEngine

    @Binds
    abstract fun bindEngine(petrolEngine: PetrolEngine): Engine

}
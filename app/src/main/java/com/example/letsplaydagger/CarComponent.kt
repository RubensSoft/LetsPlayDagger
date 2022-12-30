package com.example.letsplaydagger

import dagger.Component
import javax.inject.Singleton

@Component
interface CarComponent {
    fun getCart(): Car
}
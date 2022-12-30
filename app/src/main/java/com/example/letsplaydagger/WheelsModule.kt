package com.example.letsplaydagger

import com.example.letsplaydagger.wheelFramework.Rims
import com.example.letsplaydagger.wheelFramework.Tires
import com.example.letsplaydagger.wheelFramework.WheelsFramework
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    companion object {

        @Provides
        fun provideRims(): Rims = Rims()

        @Provides
        fun providesTires(): Tires {
            return Tires().apply {
                // just a sample
                inflate()
            }
        }

        @Provides
        fun provideWheels(rims: Rims, tires: Tires): WheelsFramework =
            WheelsFramework(rims, tires)

    }

}
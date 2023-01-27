package com.example.letsplaydagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.letsplaydagger.car.Car
import com.example.letsplaydagger.dagger.DaggerCarComponent
import com.example.letsplaydagger.dagger.modules.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dieselEngineModule = DieselEngineModule(100)
        val carComponent = DaggerCarComponent.builder()
            .dieselEngineModule(dieselEngineModule)
            .build()
        carComponent.inject(this)

        car.drive()
    }
}
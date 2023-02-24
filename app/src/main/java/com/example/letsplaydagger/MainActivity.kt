package com.example.letsplaydagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.letsplaydagger.car.Car
import com.example.letsplaydagger.dagger.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.builder()
            .horsePower(150)
            .engineCapacity(1400)
            .build()
        carComponent.inject(this)

        car.drive()
    }
}
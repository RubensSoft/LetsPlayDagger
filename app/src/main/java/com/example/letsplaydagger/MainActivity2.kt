package com.example.letsplaydagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.letsplaydagger.dagger.DaggerCarComponent

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val carComponent1 = DaggerCarComponent.builder()
            .horsePower(150)
            .engineCapacity(1400)
            .build()

        val carComponent2 = DaggerCarComponent.builder()
            .horsePower(150)
            .engineCapacity(1400)
            .build()

        carComponent1.getCar().drive()
        carComponent2.getCar().drive()
    }
}
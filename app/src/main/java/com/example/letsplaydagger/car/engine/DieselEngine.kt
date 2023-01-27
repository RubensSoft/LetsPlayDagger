package com.example.letsplaydagger.car.engine

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(horsePower: Int) : Engine {

    private var horsePower: Int = horsePower

    companion object {
        private const val TAG = "Car"
    }

    override fun start() {
        Log.d(TAG, "Diesel engine started. Horsepower: $horsePower")
    }

}
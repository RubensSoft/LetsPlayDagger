package com.example.letsplaydagger.car.engine

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {

    companion object {
        private const val TAG = "Car"
    }

    override fun start() {
        Log.d(TAG, "Petrol engine started")
    }

}
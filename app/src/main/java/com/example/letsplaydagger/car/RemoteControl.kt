package com.example.letsplaydagger.car

import android.util.Log
import javax.inject.Inject

class RemoteControl @Inject constructor() {
    companion object {
        private const val TAG = "Car"
    }

    fun setListener(car: Car) {
        Log.d(TAG, "Remote control connected to $car")
    }

}
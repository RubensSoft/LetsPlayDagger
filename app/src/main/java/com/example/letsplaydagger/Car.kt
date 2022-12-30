package com.example.letsplaydagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheels: Wheels) {

    companion object {
        private const val TAG = "Car"
    }

    fun drive() {
        Log.d(TAG, "driving...")
    }
}
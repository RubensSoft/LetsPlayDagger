package com.example.letsplaydagger.engine

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {

    companion object {
        private const val TAG = "Car"
    }

    override fun start() {
        Log.d(TAG, "Diesel engine started")
    }

}
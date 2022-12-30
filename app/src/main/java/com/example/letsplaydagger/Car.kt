package com.example.letsplaydagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    val wheels: Wheels
) {

    @Inject
    lateinit var engine: Engine

    companion object {
        private const val TAG = "Car"
    }

    @Inject
    fun enableRemoteControl(remote: RemoteControl) {
        remote.setListener(this)
    }

    fun drive() {
        Log.d(TAG, "driving...")
    }
}
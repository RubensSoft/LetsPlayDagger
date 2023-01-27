package com.example.letsplaydagger

import android.util.Log
import com.example.letsplaydagger.engine.Engine
import com.example.letsplaydagger.wheelFramework.WheelsFramework
import javax.inject.Inject

class Car @Inject constructor(
    private val engine: Engine,
    private val wheels: WheelsFramework
) {

    companion object {
        private const val TAG = "Car"
    }

    @Inject
    fun enableRemoteControl(remote: RemoteControl) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "driving...")
    }
}
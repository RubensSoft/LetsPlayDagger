package com.example.letsplaydagger.car

import android.util.Log
import com.example.letsplaydagger.car.engine.Engine
import com.example.letsplaydagger.car.wheelFramework.WheelsFramework
import javax.inject.Inject

class Car @Inject constructor(
    private val engine: Engine,
    private val wheels: WheelsFramework,
    private val driver: Driver
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
        Log.d(TAG, "$driver drives $this")
    }
}
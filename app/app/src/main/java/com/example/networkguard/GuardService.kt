package com.example.networkguard

import android.app.Service
import android.content.Intent
import android.os.IBinder

class GuardService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Thread {
            while (true) {

                try {

                    Runtime.getRuntime().exec(
                        arrayOf(
                            "sh",
                            "-c",
                            "pm block www.evodevicemanager.com"
                        )
                    )

                    Thread.sleep(10000)

                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }.start()

        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}

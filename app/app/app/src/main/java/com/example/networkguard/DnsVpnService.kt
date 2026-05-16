package com.example.networkguard

import android.net.VpnService
import android.content.Intent
import android.os.IBinder

class DnsVpnService : VpnService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return super.onBind(intent)
    }
}

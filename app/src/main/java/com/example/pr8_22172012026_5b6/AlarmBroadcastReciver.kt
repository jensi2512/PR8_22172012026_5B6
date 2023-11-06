package com.example.pr8_22172012026_5b6

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AlarmBroadcastReciver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent){
        if(intent!=null){
            val data=intent.getStringExtra(ALARMKRY)
            if(data!=null){
                val intentService=Intent(context,AlarmService::class.java)
                if (data==ALARMSTART){
                    context.startService(intentService)
                }
                else{
                    context.stopService(intentService)
                }
            }
        }
    }

    companion object{
        val ALARMKRY="KEY"
        val ALARMSTART="START"
        val ALARMSTOP="STOP"
    }
}
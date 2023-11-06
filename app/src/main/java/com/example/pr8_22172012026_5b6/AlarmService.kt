package com.example.pr8_22172012026_5b6

import android.app.Service
import android.app.Service.START_STICKY
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder

class AlarmService : Service(){
    lateinit var player: MediaPlayer

    override fun onBind(intent: Intent):IBinder{
        TODO("Practical-8")
    }

    override fun onStartCommand(intent: Intent?,flags:Int,startId:Int):Int{
        if(intent!=null){
            player=MediaPlayer.create(this,R.raw.alarm)
            player.start()
        }

        return START_STICKY
    }

    override fun onDestroy(){
        player.stop()
        super.onDestroy()
    }
}
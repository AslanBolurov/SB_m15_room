package com.skillbox.aslanbolurov.android.room_dictionary

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase

class App:Application() {

    lateinit var db:AppDatabase

    override fun onCreate() {
        super.onCreate()
        db= Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "db"
        ).build()


    }
}
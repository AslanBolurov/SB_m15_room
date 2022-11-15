package com.skillbox.aslanbolurov.android.room_dictionary

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Word::class,NewWord::class], version=1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun wordDao():WordDAO
}
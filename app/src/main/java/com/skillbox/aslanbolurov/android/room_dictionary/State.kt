package com.skillbox.aslanbolurov.android.room_dictionary

import kotlinx.coroutines.flow.MutableStateFlow

sealed class State {

    object Loading:State()
    object Success:State()
    data class Error(val msg:String):State()

}
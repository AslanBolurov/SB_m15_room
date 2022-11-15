package com.skillbox.aslanbolurov.android.room_dictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.skillbox.aslanbolurov.android.room_dictionary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
//    private lateinit var mainViewModel:ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        val wordDAO:WordDAO=(application as App).db.wordDao()

    }
}
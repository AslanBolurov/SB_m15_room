package com.skillbox.aslanbolurov.android.room_dictionary

import androidx.lifecycle.LiveData
import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDAO {
    @Query("SELECT * FROM Word LIMIT 5")
    fun getAll(): Flow<List<Word>>

    @Query("SELECT * FROM Word LIMIT 5")
    fun getAllLiveData():LiveData<List<Word>>

    @Insert(entity = Word::class)
    suspend fun insert(newWord: NewWord)

    @Update()
    suspend fun updateCntDublicates(word: Word)

//    @Query("SELECT * FROM Word LIMIT (:cnt)")
//    suspend fun getFirstWords(cnt:Int=5):Flow<List<Word>>

    @Delete()
    suspend fun delete(word:Word)


}
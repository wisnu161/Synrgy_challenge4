package com.wisnu.chellenge4

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PenggunaDAO {

    @Insert
    suspend fun addUser(user: Pengguna)

    @Query("SELECT * FROM pengguna ORDER BY id DESC")
    suspend fun getAllUsers(): List<Pengguna>

    @Update
    suspend fun updateUser(user: Pengguna)

    @Delete
    suspend fun deleteAllUsers(user: Pengguna)
}
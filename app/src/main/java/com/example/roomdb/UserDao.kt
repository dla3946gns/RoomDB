package com.example.roomdb

import android.util.Log
import androidx.room.*
import androidx.room.Dao

@Dao
interface UserDao {

    @Insert
    fun insert(user: User) {
        Log.d("UserDao : ", user.toString())
    }

    @Update
    fun update(user: User)

    @Delete
    fun delete(user: User)

    @Query("SELECT * FROM User")
    fun getAll(): List<User>

    @Query("DELETE FROM User WHERE name = :name")
    fun deleteUserByName(name: String)
}
package com.example.roomdb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RoomDBActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newUser = User("임명훈", "29", "010-6878-8517")

        val db = UserDatabase.getInstance(applicationContext)
        CoroutineScope(Dispatchers.IO).launch {
            if (db != null) {
                db.userDao().insert(newUser)
            }
        }
    }
}
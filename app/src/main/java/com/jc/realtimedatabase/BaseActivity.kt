package com.jc.realtimedatabase

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase

abstract class BaseActivity: AppCompatActivity() {

    lateinit var mContext: Context

    // 멤버 변수로 RealtimeDB 에 연결
    val realtimeDB = FirebaseDatabase.getInstance("https://realtimedatabase-59b6c-default-rtdb.asia-southeast1.firebasedatabase.app/")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
    }

    abstract fun setEvents()
    abstract fun setValues()

}
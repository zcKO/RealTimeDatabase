package com.jc.realtimedatabase

import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setEvents()
        setValues()

    }

    override fun setEvents() {

        btnSend.setOnClickListener {

            val inputContent = edtContent.text.toString()

            // 임시 : DB 의 하위 항목으로 => message 항목 => 0번 항목의 => content 항목 : 입력 내용
            realtimeDB.getReference("message").child("0").child("content").setValue(inputContent)

            // 추가 기록 : 현재시간 값을 "2022년 3월 5일 오후 5:05" 양식으로 기록.
            val now = Calendar.getInstance()
            val sdf = SimpleDateFormat("yyyy년 M월 d일 a h:mm")
            val nowStr = sdf.format(now.time)

            realtimeDB.getReference("message").child("0").child("createdAt").setValue(nowStr)

        }

    }

    override fun setValues() {


    }
}
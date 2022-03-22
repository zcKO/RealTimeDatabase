package com.jc.realtimedatabase

import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setEvents()
        setValues()

    }

    override fun setEvents() {

    }

    override fun setValues() {

        // DB 연결 -> 값 기록 연습

        // 싱가폴 db 주소 대입
        val db = FirebaseDatabase.getInstance("https://realtimedatabase-59b6c-default-rtdb.asia-southeast1.firebasedatabase.app/")

        // DB의 하위 항목 (Reference) 설정
        val testRef = db.getReference("test")

        // test 항목에, "Hello World!!" 기록
        testRef.setValue("Hello World")

    }
}
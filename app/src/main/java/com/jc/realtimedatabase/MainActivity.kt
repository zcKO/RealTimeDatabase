package com.jc.realtimedatabase

import android.os.Bundle

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

    }
}
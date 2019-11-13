package com.coder.mm.tutorial_from_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_menu)
        supportActionBar?.title="Second"
    }
}

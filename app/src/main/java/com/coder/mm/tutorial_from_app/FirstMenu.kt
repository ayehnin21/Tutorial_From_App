package com.coder.mm.tutorial_from_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coder.mm.tutorial_from_app.helper.C
import kotlinx.android.synthetic.main.activity_first_menu.*

class FirstMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_menu)
        supportActionBar?.title="First Menu"
        btnGotoUIWidget.setOnClickListener {
            C.changeActivity(this@FirstMenu,UIWidgets())
        }
        btnGotoMenuSample.setOnClickListener {
            C.changeActivity(this@FirstMenu,MenuSampleList())
        }
    }
}

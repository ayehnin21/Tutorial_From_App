package com.coder.mm.tutorial_from_app


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coder.mm.tutorial_from_app.helper.C

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title="Main Activity"
        btnFirstMenu.setOnClickListener {
            C.changeActivity(this@MainActivity, FirstMenu())

        }
        btnSecondMenu.setOnClickListener {
            C.changeActivity(this@MainActivity, SecondMenu())
        }
    }


}

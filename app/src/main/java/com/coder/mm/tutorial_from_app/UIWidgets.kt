package com.coder.mm.tutorial_from_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coder.mm.tutorial_from_app.helper.C
import kotlinx.android.synthetic.main.ui_widgets.*

class UIWidgets : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ui_widgets)
        supportActionBar?.title = "UI widgets"
        btnACTextView.setOnClickListener {
            C.changeActivity(this@UIWidgets, AutoCompleteTextView())
        }
        btnGotoMultiCTextView.setOnClickListener {
            C.changeActivity(this@UIWidgets, MultiAutoCompleteTextView())
        }
    }
}

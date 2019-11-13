package com.coder.mm.tutorial_from_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.coder.mm.tutorial_from_app.helper.C
import kotlinx.android.synthetic.main.auto_complete_text_view.*
import kotlin.text.StringBuilder

class AutoCompleteTextView : AppCompatActivity() {

    var sb = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.auto_complete_text_view)
        supportActionBar?.title = "Auto complete text view"
        addToList()
    }

    private fun addToList() {
        for (name in C.namedList) {
            sb?.append(name).append(",\n")
        }
        txtComplete.text = sb.toString()
        C.l(sb.toString())

        var adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_dropdown_item_1line,
            C.namedList
        )
        aCTV.setAdapter(adapter)
        aCTV.threshold = 1
        aCTV.setAdapter(adapter)
    }
}

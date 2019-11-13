package com.coder.mm.tutorial_from_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import com.coder.mm.tutorial_from_app.helper.C
import kotlinx.android.synthetic.main.multi_auto_complete_text_view.*

class MultiAutoCompleteTextView : AppCompatActivity() {
    var sb = StringBuilder()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.multi_auto_complete_text_view)
        supportActionBar?.title = "Multi Auto complete text view"
        addToList()
    }

    private fun addToList() {
        for (name in C.namedList) {
            sb?.append(name).append(",\n")
        }

        txtMCT.text = sb.toString()
        C.l(sb.toString())
        var adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_dropdown_item_1line,
            C.namedList
        )
        tvMCT.setAdapter(adapter)
        tvMCT.threshold = 1
        tvMCT.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())

    }
}

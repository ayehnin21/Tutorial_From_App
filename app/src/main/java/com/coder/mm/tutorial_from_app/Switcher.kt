package com.coder.mm.tutorial_from_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coder.mm.tutorial_from_app.helper.C
import kotlinx.android.synthetic.main.switcher.*

class Switcher : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.switcher)
        supportActionBar?.title="Switcher"
        btnGotoImageSwitcher.setOnClickListener {
            C.changeActivity(this@Switcher,ImageSwitcher())
        }
        btnGotoTextSwitcher.setOnClickListener {
            C.changeActivity(this@Switcher,TextSwitcher())
        }
    }
}

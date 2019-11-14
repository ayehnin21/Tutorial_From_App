package com.coder.mm.tutorial_from_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coder.mm.tutorial_from_app.helper.C
import kotlinx.android.synthetic.main.activity_menu_sample_list.*

class MenuSampleList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_sample_list)
        supportActionBar?.title="Menu Sample List"

        btnGotoSampleMenu.setOnClickListener {
            C.changeActivity(this@MenuSampleList,SimpleMenu())
        }
        btnGotoContentMenu.setOnClickListener {
            C.changeActivity(this@MenuSampleList,ContentMenu())
        }
        btnGotoPopUpMenu.setOnClickListener {
            C.changeActivity(this@MenuSampleList,PopUpMenu())
        }
    }
}

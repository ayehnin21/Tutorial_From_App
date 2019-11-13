package com.coder.mm.tutorial_from_app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.ViewSwitcher
import kotlinx.android.synthetic.main.activity_text_switcher.*

class TextSwitcher : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_switcher)
        supportActionBar?.title="Text Switcher"
        //textSwitcher.setText(strAry[0])

        var strAry=arrayOf("One","Two","Three","Four","Five")
        var currentIndex=-1

        textSwitcher.setFactory {
            var tv= TextView(this@TextSwitcher)
            tv.gravity=Gravity.TOP or Gravity.CENTER
           tv.setTextColor(Color.MAGENTA)
            tv.text=strAry[strAry.size-1]
            tv.textSize= 30.0F
            tv
        }

        btnPre.setOnClickListener {

          if(currentIndex>0){
              currentIndex=currentIndex-1
              textSwitcher.setText(strAry[currentIndex])
          }
        }

        btnNxt.setOnClickListener {
            if(currentIndex<strAry.size-1 ){
                currentIndex = currentIndex+1
                textSwitcher.setText(strAry[currentIndex])
            }
        }
    }
}

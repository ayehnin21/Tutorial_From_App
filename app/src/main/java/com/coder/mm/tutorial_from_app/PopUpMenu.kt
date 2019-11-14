package com.coder.mm.tutorial_from_app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_pop_up_menu.*
import org.jetbrains.anko.backgroundColor


class PopUpMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_up_menu)
        supportActionBar?.title = "PopUp Menu"

        btnClick.setOnClickListener {

            val popUp = PopupMenu(this@PopUpMenu, btnClick)
            popUp.menuInflater.inflate(R.menu.pop_menu, popUp.menu)

            popUp.setOnMenuItemClickListener { myItem ->

                //Getting Id of selected Item

                when (myItem!!.itemId) {
                    R.id.red -> {
                        popUpBackGround.backgroundColor = Color.RED
                    }

                    R.id.blue -> {
                        popUpBackGround.backgroundColor = Color.BLUE

                    }

                    R.id.green -> {
                        popUpBackGround.backgroundColor = Color.GREEN
                    }
                }

                true
            }
            popUp.show()
        }
    }
}

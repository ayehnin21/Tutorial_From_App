package com.coder.mm.tutorial_from_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import com.coder.mm.tutorial_from_app.helper.C
import kotlinx.android.synthetic.main.activity_content_menu.*
import org.jetbrains.anko.toast

class ContentMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_menu)
        supportActionBar?.title = "Content Menu"
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, C.namedList)
        listViewContextMenu.adapter = adapter
        registerForContextMenu(listViewContextMenu)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu?.setHeaderTitle("Select the Action")
        menu?.add(0, v!!.id, 0, "Code")
        menu?.add(0, v!!.id, 0, "Example")
        menu?.add(0, v!!.id, 0, "Tutorial")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.title) {
            "Code" -> {
                toast("Selected Code")
            }
            "Example" -> {

                toast("Example Code")
            }
            "Tutorial" -> {

                toast("Selected Tutorial")
            }
            else -> return false
        }
        return true
    }
}

package com.coder.mm.tutorial_from_app.helper

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log


object C {
    fun changeActivity(context: Context, a: Activity) {
        context.startActivity(Intent(context, a::class.java))
    }

    fun l(msg: String) {
        Log.d("my_message", msg)
    }

    val namedList = arrayOf(

        "Jurassic Park",
        "Notting Hill",
        "Clueless",
        "the Hynger games",
        "The king's speech",
        "the queen",
        "the wizard of oz",
        "men in black",
        "the babadook",
        "black sheet",
        "Leanne Graham",
        "Ervin Howell",
        "Clementine Bauch",
        "Patricia Lebsack",
        "Chelsey Dietrich",
        "Mrs. Dennis Schulist",
        "Kurtis Weissnat",
        "Nicholas Runolfsdottir V",
        "Glenna Reichert",
        "Clementina DuBuque",
        "Cris",
        "John Smith"
    )


}
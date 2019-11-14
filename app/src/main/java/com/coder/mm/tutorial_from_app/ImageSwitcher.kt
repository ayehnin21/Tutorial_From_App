package com.coder.mm.tutorial_from_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ViewSwitcher
import kotlinx.android.synthetic.main.activity_image_switcher.*

class ImageSwitcher : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_switcher)
        supportActionBar?.title = "Image Switcher"
        var imageList = arrayOf(
            R.drawable.home_bb, R.drawable.home_cc,
            R.drawable.home_dd, R.drawable.home_ee, R.drawable.home_ff
        )
        var currentIndex = -1

        imageSwitcher.setFactory {
            var imageView = ImageView(applicationContext)
            imageView.scaleType = ImageView.ScaleType.FIT_CENTER
            imageView.minimumWidth = 250
            imageView.minimumHeight = 250
            //imageView.scaleType = ImageView.ScaleType.FIT_XY
            imageView
        }

        btnPrevious.setOnClickListener {
            if (currentIndex > 0) {
                currentIndex -= 1
                imageSwitcher.setImageResource(imageList[currentIndex])
            }
        }
        btnNext.setOnClickListener {
            if (currentIndex < imageList.size - 1) {
                currentIndex += 1
                imageSwitcher.setImageResource(imageList[currentIndex])
            }
        }
    }
}

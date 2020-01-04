package com.igreenwood.loupesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.igreenwood.loupe.LoupeImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<LoupeImageView>(R.id.image)
        Glide.with(this).load("https://raw.githubusercontent.com/igreenwood/SimpleCropView/master/simplecropview-sample/src/main/res/drawable/sample4.png").into(imageView)
    }
}
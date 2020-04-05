package com.ccamacho.kotlinprogrammingstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ccamacho.kotlinprogrammingstudy.oop.CustomButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = CustomButton()
        btn.onTouch()
        btn.onClick()

    }

}

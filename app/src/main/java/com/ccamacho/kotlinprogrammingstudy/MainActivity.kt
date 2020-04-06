package com.ccamacho.kotlinprogrammingstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.persistableBundleOf
import com.ccamacho.kotlinprogrammingstudy.lambda.Car

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}

package com.arm.municipios.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.arm.municipios.MainActivity
import com.arm.municipios.R

class SplahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splah)
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        },3000)
    }
}
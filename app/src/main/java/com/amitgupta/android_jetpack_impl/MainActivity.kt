package com.amitgupta.android_jetpack_impl

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            startActivity(
                Intent(
                    this,
                    LoginActivity::class.java
                )
            )
            finish()
        }, 1000)
    }
}

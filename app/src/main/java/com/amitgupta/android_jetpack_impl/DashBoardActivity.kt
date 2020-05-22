package com.amitgupta.android_jetpack_impl

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DashBoardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_dashboard)

        Toast.makeText(this,intent.getStringExtra("message") as String, Toast.LENGTH_SHORT).show()
    }
}
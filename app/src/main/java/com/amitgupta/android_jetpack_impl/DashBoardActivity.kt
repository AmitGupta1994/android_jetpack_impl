package com.amitgupta.android_jetpack_impl

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashBoardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_dashboard)

        Toast.makeText(this,intent.getStringExtra("message") as String, Toast.LENGTH_SHORT).show()

        //set bottom navigation view
        NavigationUI.setupWithNavController(bottom_navigation_view,Navigation.findNavController(this,R.id.nav_host_fragment))

    }
}
package com.amitgupta.android_jetpack_impl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

class LoginActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        // implementing action bar changes
        val navController = Navigation.findNavController(this,R.id.nav_host_fragment)

        NavigationUI.setupActionBarWithNavController(this,navController)
    }
}

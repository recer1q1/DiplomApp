package com.example.ipanchenko.diplomapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log

class MainActivity : BaseActivity(0) {
    var i = 0
    private lateinit var sharedPref: SharedPreferences
    private val TAG = "MainActivity"
    //private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d(TAG, "onCreate")
        setupBottomNavigation()
        sharedPref = applicationContext.getSharedPreferences("AUTH", Context.MODE_PRIVATE)

    }

    override fun onStart() {
        super.onStart()
        val username = sharedPref.getString("USER", "undefined")
        if (username == "undefined") {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}

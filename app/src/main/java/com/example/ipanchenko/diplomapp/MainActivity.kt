package com.example.ipanchenko.diplomapp

import android.content.Intent
import android.os.Bundle
import android.util.Log

class MainActivity : BaseActivity(0) {
    var i = 0
    private val TAG = "MainActivity"
    //private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d(TAG, "onCreate")
        setupBottomNavigation()

        //mAuth = FirebaseAuth.getInstance()
        // mAuth.signOut()

    }

    override fun onStart() {
        super.onStart()
        if (i == 0) {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
            i++
        }
    }
}

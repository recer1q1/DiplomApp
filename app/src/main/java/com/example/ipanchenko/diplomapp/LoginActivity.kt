package com.example.ipanchenko.diplomapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEventListener



class LoginActivity : AppCompatActivity(), KeyboardVisibilityEventListener/*, TextWatcher, View.onClickListener*/ {
    private val TAG = "LoginActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
            Log.d(TAG,"onCreate")

        login_button.setOnClickListener{
            val sharedPref = applicationContext.getSharedPreferences("AUTH", Context.MODE_PRIVATE)
            sharedPref.edit().putString("USER", email_input.text.toString()).commit()
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        KeyboardVisibilityEvent.setEventListener(this, this)
    }



    fun login_button(view: View){

    }


    override fun onVisibilityChanged(isKeyboardOpen: Boolean) {
       if (isKeyboardOpen){
           scroll_view.scrollTo(0, scroll_view.bottom)
           create_account_text.visibility = View.GONE
       } else{
           scroll_view.scrollTo(0, scroll_view.top)
           create_account_text.visibility = View.VISIBLE
       }
    }
}

package com.example.ipanchenko.diplomapp

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
    //private lateinit var mFirebaseAuth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
            Log.d(TAG,"onCreate")

        login_button.setOnClickListener{
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        KeyboardVisibilityEvent.setEventListener(this, this)
        //login_button.isEnabled = false
        //email_input.addTextChangedListener(this)
        //password_input.addTextChangedListener(this)
        //login_button.setOnClickListener(this)

        //mAuth = FirebaseAuth.getInstance()
    }

/*        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_home)
            login_button.setOnClickListener{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }*/

    //override fun onClick(view: View) {
        //val email = email_input.text.toString()
        //val password = password_input.text.toString()
        //if (validate(email, password)){
            //startActivity(Intent(this, LoginActivity::class.java))
            //mAuth.SignInWithEmailAndPassword()
        //}else{
            //Toast.makeText(this, "Go out!", Toast.LENGTH_SHORT).show()
        //}
        //startActivity(Intent(this, MainActivity::class.java))
        //finish()
    //}

    override fun onVisibilityChanged(isKeyboardOpen: Boolean) {
       if (isKeyboardOpen){
           scroll_view.scrollTo(0, scroll_view.bottom)
           create_account_text.visibility = View.GONE
       } else{
           scroll_view.scrollTo(0, scroll_view.top)
           create_account_text.visibility = View.VISIBLE
       }
    }



    //override fun beforeTextChanged(s: Editable?) {
    //   login_button.isEnabled = validate(email_input.text.toString(), password_input.text.toString())
    //}

    //private fun validate(email: String, password: String) =
    //        email.isNotEmpty() && password.isNotEmpty()
}

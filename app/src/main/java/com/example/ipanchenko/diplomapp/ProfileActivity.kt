package com.example.ipanchenko.diplomapp

import android.media.Image
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : BaseActivity(4) {
    private val TAG = "ProfileActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setupBottomNavigation()
        Log.d(TAG,"onCreate")


        Picasso.get().load("https://pbs.twimg.com/profile_images/1120306723892400128/j6ZRWJ0q_400x400.jpg").into(profile_image)
        Picasso.get().load("https://pbs.twimg.com/profile_images/1120306723892400128/j6ZRWJ0q_400x400.jpg").into(profile_image_tweet)
    }
}

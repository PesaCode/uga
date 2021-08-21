package com.example.ugcares

import android.content.Intent
import android.os.Bundle
import android.os.Handler

import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

Handler().postDelayed({
    startActivity(Intent(this,ClientSignInForm::class.java))
    finish()
},2500)
    }
//    val typeface: Typeface =Typeface.createFromAsset(assets,"Montserrat-Bold.ttf")
//    tv_app_name.typeface=typeface
}
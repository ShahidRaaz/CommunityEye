package com.example.communityeye.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.communityeye.R


class Login_SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sign_up)
        val b1 = findViewById<Button>(R.id.button_yell)
        b1.setOnClickListener(){
                    val i = Intent(this@Login_SignUp,MainActivity::class.java)
                    startActivity(i)
                }
            }
    }
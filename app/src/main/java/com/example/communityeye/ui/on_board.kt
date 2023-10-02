package com.example.communityeye.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import com.example.communityeye.R

class on_board : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_on_board)

    // This is used to hide the status bar and make
    // the splash screen as a full screen activity.
    window.setFlags(
        WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN
    )

    // Handler().postDelayed({
    Handler(Looper.getMainLooper()).postDelayed({
        val intent = Intent(this,Login_SignUp::class.java)
        startActivity(intent)
        finish()
    }, 3000) // 3000 is the delayed time in milliseconds.
}
}
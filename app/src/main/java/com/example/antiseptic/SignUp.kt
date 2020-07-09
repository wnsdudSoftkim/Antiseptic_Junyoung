package com.example.antiseptic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        text_goLogin.setOnClickListener {
            GoLogin()
        }
    }
    //로그인 하러 가기
    private fun GoLogin() {
        startActivity(Intent(this,Login::class.java))
    }
}
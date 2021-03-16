package com.example.desafio.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafio.R


class SplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val handle = Handler()
        handle.postDelayed(Runnable { mostrarLogin() }, 2000)

    }
    fun mostrarLogin(){
        val intent= Intent(this, LogInActivity::class.java)
        startActivity(intent)
    }
}
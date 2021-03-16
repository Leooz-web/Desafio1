package com.example.desafio.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.desafio.R


class LogInActivity : AppCompatActivity() {
    private val buttonLogin: Button by lazy { findViewById<Button>(R.id.btn_login) }
    private val buttonRegister: Button  by lazy { findViewById<Button>(R.id.button_register)}

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
            buttonRegister.setOnClickListener {
                val intent = Intent(this,RegisterActivity::class.java)
                startActivity(intent)
            }

        buttonLogin.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
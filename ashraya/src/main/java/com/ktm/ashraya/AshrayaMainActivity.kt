package com.ktm.ashraya

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.security.PrivateKey

class AshrayaMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ashraya_main)

    var login_btn = findViewById<Button>(R.id.login)
    var et_username = findViewById(R.id.username) as EditText
    var et_password = findViewById(R.id.password) as EditText

     fun ValidateUsername():Boolean {
             val Usernameinp:String = et_username.text.toString()
        if (Usernameinp.isEmpty()) {
            et_username.setError("Cant be empty")
            return@ValidateUsername false;
        }else if(Usernameinp.length>15){
            et_username.setError("Username too long")
            return@ValidateUsername false
        }
        else{
            et_username.setError(null)
            return@ValidateUsername true
        }
    }

        fun ValidatePassword():Boolean {
            val Passwordinp = et_password.text.toString()
            if (Passwordinp.isEmpty()) {
                et_password.setError("Cant be empty")
                return@ValidatePassword false
            }else if(Passwordinp.length>15){
                et_username.setError("Password too long")
                return@ValidatePassword false
            }
            else{
                et_password.setError(null)
                return@ValidatePassword true
            }
        }



    login_btn.setOnClickListener {
        val username = et_username.text
        val password  = et_password.text
        if (ValidatePassword() && ValidateUsername()){
            Toast.makeText(this, "Hello $username", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this, "Invalid Username or password", Toast.LENGTH_LONG).show()
        }

    }

    }
}

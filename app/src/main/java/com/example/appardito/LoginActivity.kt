package com.example.appardito

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_login.*




class LoginActivity: AppCompatActivity() {

  private lateinit var auth: FirebaseAuth

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_login)

    auth = Firebase.auth

    login_button_login.setOnClickListener {
      val email = email_edittext_login.text.toString()
      val password = password_edittext_login.text.toString()

      if (email.isEmpty() || password.isEmpty()){
        Toast.makeText(this,"Registrasi Dulu", Toast.LENGTH_SHORT).show()
        return@setOnClickListener
      }

      auth.signInWithEmailAndPassword(email,password)
        .addOnCompleteListener {
          if (!it.isSuccessful){
            startActivity(Intent(this, LoginActivity::class.java))
            return@addOnCompleteListener
          } else
            Toast.makeText(this,"Selamat Datang !", Toast.LENGTH_SHORT).show()
          startActivity(Intent(this, MainActivity::class.java))
        }
        .addOnFailureListener {
          Log.d("Main","Failed Login: ${it.message}")
          Toast.makeText(this,"Email atau Password Salah !", Toast.LENGTH_SHORT).show()
        }

      Log.d("Login", "Attempt login with email/pw: $email/***")
    }

    back_to_register_textview.setOnClickListener{
      finish()
    }
  }

}
package com.example.practica9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.auth.api.signin.GoogleSignIn

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val tvNombre: TextView = findViewById(R.id.tv_nombre)
        val tvEmail: TextView = findViewById(R.id.tv_email)
        val btnCerrar: Button = findViewById(R.id.btn_cerrar)

        val bundle = intent.extras

        if(bundle != null){
            val name = bundle.getString("name")
            val email = bundle.getString("email")
            tvNombre.setText(name)
            tvEmail.setText(email)
        }

        btnCerrar.setOnClickListener {
            finish()
        }
    }


}
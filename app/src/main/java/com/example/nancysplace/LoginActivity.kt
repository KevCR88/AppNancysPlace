package com.example.nancysplace

import Util.Util
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    // Necesitamos el botón de ingreso
    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login) // Conecta con el layout XML

        // Código estándar de setup
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 1. Inicializar el botón de "Ingresar"
        btnLogin = findViewById(R.id.btn_login)

        // 2. AÑADIR LA LÓGICA DE NAVEGACIÓN A HOME
        btnLogin.setOnClickListener {
            Util.openActivity(this, HomeActivity::class.java)
        }
    }
}
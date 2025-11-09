package com.example.nancysplace

import Util.Util
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {

    // Declaramos los botones para poder usarlos en el código
    lateinit var btnVentas: Button
    lateinit var btnProductos: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home) // Conecta con el layout XML

        // Código estándar de setup de la Activity
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 1. Inicializar los botones (siguiendo el modelo PersonActivity.kt
        btnVentas = findViewById(R.id.btnVentas)
        btnProductos = findViewById(R.id.btnProductos)


    }
}
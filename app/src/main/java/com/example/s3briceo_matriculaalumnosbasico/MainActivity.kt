package com.example.s3briceo_matriculaalumnosbasico

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etCodigo = findViewById<EditText>(R.id.etCodigo)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val etDireccion = findViewById<EditText>(R.id.etDireccion)
        val etTelefono = findViewById<EditText>(R.id.etTelefono)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnRegistrar.setOnClickListener {
            val codigo = etCodigo.text.toString().trim()
            val nombre = etNombre.text.toString().trim()
            val correo = etCorreo.text.toString().trim()
            val direccion = etDireccion.text.toString().trim()
            val telefono = etTelefono.text.toString().trim()

            if (codigo.isNotEmpty() && nombre.isNotEmpty() && correo.isNotEmpty()
                && direccion.isNotEmpty() && telefono.isNotEmpty()) {

                val resultado = """
                    Alumno Registrado:
                    Código: $codigo
                    Nombre: $nombre
                    Correo: $correo
                    Dirección: $direccion
                    Teléfono: $telefono
                """.trimIndent()

                tvResultado.text = resultado
            } else {
                tvResultado.text = "Por favor, completa todos los campos."
            }
        }

    }
}
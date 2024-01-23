package com.example.practica_androidstudio.ActivityFragmenLayout.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.practica_androidstudio.R

class ciclo_de_vida : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciclo_de_vida)
        Log.i("cicloVida","Ingresa a onCreate")

        val salirButton :Button=findViewById(R.id.btnSalir)

        salirButton.setOnClickListener {
            // Acciones al hacer clic en el botón de salir
            finish()
        }


    }




    override fun onStart() {
        super.onStart()
        Log.i("cicloVida","Ingresa a onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("cicloVida","Ingresa a onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("cicloVida","Ingresa a onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("cicloVida","Ingresa a onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("cicloVida","Ingresa a onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("cicloVida","Ingresa a onDestroy()")
    }

}
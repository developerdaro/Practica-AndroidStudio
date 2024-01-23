package com.example.practica_androidstudio.ActivityFragmenLayout.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.practica_androidstudio.R

class activity_uno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uno)
        listener()
    }


    fun listener(){

        var nombre:EditText=findViewById(R.id.txtnombreactivityuno)
        var apellido:EditText=findViewById(R.id.txtapellidoactivityuno)

        var btnactivity_dos : Button =findViewById(R.id.btnactivitydos_activityuno)

        btnactivity_dos.setOnClickListener {

            var intent=Intent(this,activity_dos::class.java)
            intent.putExtra("nombre_activityuno",nombre.text.toString())
            startActivity(intent)
        }
    }
}
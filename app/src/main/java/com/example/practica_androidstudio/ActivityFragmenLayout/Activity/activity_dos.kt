package com.example.practica_androidstudio.ActivityFragmenLayout.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.practica_androidstudio.R

class activity_dos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dos)

        var txtnombre:EditText=findViewById(R.id.txtnombre_activitydos)
        var txtapellido:EditText=findViewById(R.id.txtapellido_activitydos)

        var nombre:String=intent.extras?.getString("nombre_activityuno").orEmpty()
        txtnombre.setText(nombre)
    }
}
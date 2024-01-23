package com.example.practica_androidstudio.ActivityFragmenLayout.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.practica_androidstudio.R

class activity_principal : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)



        listener()

    }

    fun mostrarinfo(){
        val txtidentificacion: EditText =findViewById(R.id.editextidentificacion)
        val txtidentificacionvisual: EditText =findViewById(R.id.editextidentificacionvisual)

        var txtfechanacimiento:EditText =findViewById(R.id.editextfechadenacimiento)
        var txtfechanacimientovisual:EditText =findViewById(R.id.editextfechanaciminetovisual)

        var txtnombres:EditText =findViewById(R.id.editextnombres)
        var txtnombresvisual:EditText =findViewById(R.id.editextnombrevisual)

        var txtapellidos:EditText  =findViewById(R.id.editextapellido)
        var txtapellidosvisual:EditText  =findViewById(R.id.editextapellidovisual)

        val identificacion=txtidentificacion.text.toString()
        txtidentificacionvisual.setText(identificacion)

        var fechanacimiento=txtfechanacimiento.text.toString()
        txtfechanacimientovisual.setText(fechanacimiento)

        var nombres=txtnombres.text.toString()
        txtnombresvisual.setText(nombres)

        var apellidos=txtapellidos.text.toString()
        txtapellidosvisual.setText(apellidos)


    }

    fun listener(){
        var btnguardar:Button=findViewById(R.id.btnregistrar)
        var btnlimpiar:Button=findViewById(R.id.btnlimpiar)

        var btnactivity_uno:Button=findViewById(R.id.btnactivityuno)
        var btnactivity_dos:Button=findViewById(R.id.btnactivitydos)
        var btnactivity_tres:Button=findViewById(R.id.btnactivitytres)

        btnguardar.setOnClickListener{
            mostrarinfo()
        }

        btnlimpiar.setOnClickListener {
            val txtidentificacion: EditText =findViewById(R.id.editextidentificacion)
            val txtidentificacionvisual: EditText =findViewById(R.id.editextidentificacionvisual)

            var txtfechanacimiento:EditText =findViewById(R.id.editextfechadenacimiento)
            var txtfechanacimientovisual:EditText =findViewById(R.id.editextfechanaciminetovisual)

            var txtnombres:EditText =findViewById(R.id.editextnombres)
            var txtnombresvisual:EditText =findViewById(R.id.editextnombrevisual)

            var txtapellidos:EditText  =findViewById(R.id.editextapellido)
            var txtapellidosvisual:EditText  =findViewById(R.id.editextapellidovisual)

            txtidentificacion.setText("")
            txtidentificacionvisual.setText("")
            txtfechanacimiento.setText("")
            txtfechanacimientovisual.setText("")
            txtnombres.setText("")
            txtnombresvisual.setText("")
            txtapellidos.setText("")
            txtapellidosvisual.setText("")


        }

        btnactivity_uno.setOnClickListener {
            val inten=Intent(this,activity_uno::class.java)
            startActivity(inten)
        }

    }


}
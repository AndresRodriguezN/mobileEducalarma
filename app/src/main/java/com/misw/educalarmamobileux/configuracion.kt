package com.misw.educalarmamobileux

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class configuracion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.configuracion)
    }
    fun abrirInformacion(view: View){
        val intent=Intent(this,informacion::class.java).apply{}
        startActivity(intent)
    }
}
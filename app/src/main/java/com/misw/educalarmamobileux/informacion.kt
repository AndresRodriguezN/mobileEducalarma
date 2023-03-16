package com.misw.educalarmamobileux

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class informacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.informacion)
    }
    fun abrirConfiguracion(view: View){
        val intent=Intent(this,configuracion::class.java).apply{}
        startActivity(intent)
    }



}
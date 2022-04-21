package com.example.recyclerviewcardviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvEquipos = findViewById<RecyclerView>(R.id.rvEquipos)
        rvEquipos.layoutManager = LinearLayoutManager(this)

        val listaEquipos = ArrayList<Equipo>()

        listaEquipos.add(Equipo("Real Madrid", "ESP", "Merengues"))
        listaEquipos.add(Equipo("Barcelona", "ESP", "Cules"))
        listaEquipos.add(Equipo("Atletico de Madrid", "ESP", "Colchoneros"))

        val adaptadorEquipo = AdaptadorEquipo(listaEquipos)
        rvEquipos.adapter = adaptadorEquipo
    }
}
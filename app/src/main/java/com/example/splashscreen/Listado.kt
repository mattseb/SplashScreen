package com.example.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_listado.*


class Listado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado)

        val arrayAdapter: ArrayAdapter<*>
        val personas = mutableListOf("Carlos","Laura","Diego")

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, personas)
        lvDatos.adapter = arrayAdapter
    }
}
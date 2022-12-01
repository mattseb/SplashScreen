package com.example.splashscreen

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.splashscreen.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_SplashScreen)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnregistro.setOnClickListener() {
            var saltar: Intent = Intent(this, Registro::class.java)
            startActivity(saltar)
        }

        btnlistado.setOnClickListener() {
            var saltar: Intent = Intent(this, Listado::class.java)
            startActivity(saltar)
        }


    }

}
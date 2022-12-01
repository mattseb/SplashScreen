package com.example.splashscreen

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import kotlinx.android.synthetic.main.activity_registro.*

class Registro : AppCompatActivity() {
    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        //setup(email?:"", provider?:"")
        btnguardar.setOnClickListener{
            val docData = hashMapOf(
                "stringExample" to "Hello world!",
            )

            val datosMascota = hashMapOf(
                "nombre" to txtnombre.text.toString(),
                "edad" to txtedad.text.toString()
            )


            docData[Missions().toString()] = datosMascota.toString()

            db.collection("pets").document(txtcolor.toString()).set(docData, SetOptions.merge())

            db.collection("pets").document("data")
                 .get()
                .addOnSuccessListener { document ->
                    if (document!=null){
                        Log.d("TAG", "Docuemnt: ${document.data}")
                    }
                }
        }
    }
    class Missions {
        var title: String? = null
            private set
        var exp: String? = null
            private set
        var date: String? = null
            private set
        var description: String? = null
            private set

        constructor() {}
        constructor(title: String?, exp: String) {
            this.title = title
            this.exp = exp
        }
    }
}
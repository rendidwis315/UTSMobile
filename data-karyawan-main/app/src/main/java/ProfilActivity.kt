package com.example.appdatakaryawan

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    // Deklarasikan variabel untuk setiap elemen UI
    private lateinit var tvHeader: TextView
    private lateinit var etNIP: EditText
    private lateinit var etNama: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profil_karyawan)

    }
}


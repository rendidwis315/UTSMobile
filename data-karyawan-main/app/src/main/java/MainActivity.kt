package com.example.appdatakaryawan

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi elemen UI
        val profilSaya: ImageView = findViewById(R.id.profil_saya)
        val dataKaryawan: ImageView = findViewById(R.id.data_karyawan)
        val presensi: ImageView = findViewById(R.id.presensi)

        // Menambahkan klik listener pada setiap elemen
        profilSaya.setOnClickListener {
            profilSaya.setOnClickListener {
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            }

        }

        dataKaryawan.setOnClickListener {
            val intent = Intent(this, DataActivity::class.java)
            startActivity(intent)
        }

        presensi.setOnClickListener {
            val intent = Intent(this, PresensiActivity::class.java)
            startActivity(intent)
        }
    }
}

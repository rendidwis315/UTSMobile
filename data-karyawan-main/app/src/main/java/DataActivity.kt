package com.example.appdatakaryawan

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.data_karyawan)

        // Inisialisasi elemen UI
        val profileImageView1: ImageView = findViewById(R.id.profileImageView1)
        val nameTextView1: TextView = findViewById(R.id.nameTextView1)

        val profileImageView2: ImageView = findViewById(R.id.profileImageView2)
        val nameTextView2: TextView = findViewById(R.id.nameTextView2)

        val profileImageView3: ImageView = findViewById(R.id.profileImageView3)
        val nameTextView3: TextView = findViewById(R.id.nameTextView3)

        val profileImageView4: ImageView = findViewById(R.id.profileImageView4)
        val nameTextView4: TextView = findViewById(R.id.nameTextView4)

        // Mengatur data untuk setiap item daftar karyawan
        nameTextView1.text = "Nama Karyawan 1"
        nameTextView2.text = "Nama Karyawan 2"
        nameTextView3.text = "Nama Karyawan 3"
        nameTextView4.text = "Nama Karyawan 4"

        // Mengatur gambar profil untuk setiap item daftar karyawan
        profileImageView1.setImageResource(R.drawable.avatar)
        profileImageView2.setImageResource(R.drawable.avatar)
        profileImageView3.setImageResource(R.drawable.avatar)
        profileImageView4.setImageResource(R.drawable.avatar)
    }
}

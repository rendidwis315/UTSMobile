package com.example.appdatakaryawan

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PresensiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.presensi_karyawan)

        // Inisialisasi elemen UI
        val tvNamaKaryawan: TextView = findViewById(R.id.namaKaryawanTextView)
        val tvRentangTanggal: TextView = findViewById(R.id.rentangTanggalTextView)
        val tvTotalHadir: TextView = findViewById(R.id.totalHadirTextView)
        val tvTotalSakit: TextView = findViewById(R.id.totalSakitTextView)
        val tvTotalIzin: TextView = findViewById(R.id.totalIzinTextView)
        val tvPresentaseKehadiran: TextView = findViewById(R.id.presentaseKehadiranTextView)

        // Mengatur data
        tvNamaKaryawan.text = "Nama Karyawan"
        tvRentangTanggal.text = "01/05/2024 - 31/05/2024"
        tvTotalHadir.text = "Total Hadir = 20"
        tvTotalSakit.text = "Total Sakit = 5"
        tvTotalIzin.text = "Total Izin = 3"
        tvPresentaseKehadiran.text = "Presentase kehadiran = 85%"
    }
}

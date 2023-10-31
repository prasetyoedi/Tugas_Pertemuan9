package com.example.Tugas_Pertemuan9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.Tugas_Pertemuan9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    /**
     * Metode ini dipanggil saat aktivitas dibuat.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menginisialisasi binding untuk menghubungkan tata letak XML dengan kode Kotlin.
        binding = ActivityMainBinding.inflate(layoutInflater)

        // Menetapkan tata letak utama aktivitas dengan menggunakan root layout dari binding.
        setContentView(binding.root)

        // Menggunakan binding untuk mendapatkan referensi ke elemen-elemen UI dari tata letak.
        with(binding) {
            // Mendapatkan NavController untuk mengontrol navigasi menggunakan fragment.
            val navController = findNavController(R.id.nav_host_fragment)

            // Mengonfigurasi BottomNavigationView agar berfungsi dengan NavController.
            bottonNavigationView.setupWithNavController(navController)
        }
    }
}


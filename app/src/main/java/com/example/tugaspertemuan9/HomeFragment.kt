package com.example.Tugas_Pertemuan9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class HomeFragment : Fragment() {

    /**
     * Metode ini dipanggil saat tata letak fragmen dibuat.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Mengembalikan tata letak fragmen yang telah diinisialisasi dari file XML 'fragment_home'.
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}

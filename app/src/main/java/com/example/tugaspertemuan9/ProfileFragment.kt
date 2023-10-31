package com.example.Tugas_Pertemuan9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ProfileFragment : Fragment() {

    /**
     * Metode ini dipanggil saat tata letak fragmen dibuat.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Mengembalikan tata letak untuk fragmen ini.
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
}

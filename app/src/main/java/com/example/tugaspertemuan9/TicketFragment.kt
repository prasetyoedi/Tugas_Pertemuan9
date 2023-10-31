package com.example.Tugas_Pertemuan9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.Tugas_Pertemuan9.databinding.FragmentTicketBinding

class TicketFragment : Fragment() {

    private lateinit var binding: FragmentTicketBinding

    /**
     * Metode ini dipanggil saat tata letak fragmen pertama kali dibuat.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Menghubungkan tata letak dengan fragmen menggunakan data binding.
        binding = FragmentTicketBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    /**
     * Metode ini dipanggil setelah tata letak fragmen selesai dibuat.
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            // Membuat aksi untuk tombol btnBuyticketShutup.
            val action = TicketFragmentDirections.actionTicketFragmentToOrderFragment()
            btnBuyticketShutup.setOnClickListener {
                // Navigasi ke fragmen OrderFragment saat tombol diklik.
                findNavController().navigate(action)
            }
        }
    }
}

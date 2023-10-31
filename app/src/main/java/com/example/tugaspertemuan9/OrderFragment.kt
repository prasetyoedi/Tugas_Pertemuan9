package com.example.Tugas_Pertemuan9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.Tugas_Pertemuan9.databinding.FragmentOrderBinding

class OrderFragment : Fragment() {

    private lateinit var binding: FragmentOrderBinding

    /**
     * Metode ini dipanggil saat tata letak fragmen dibuat.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Menginisialisasi binding untuk menghubungkan tata letak XML dengan kode Kotlin.
        binding = FragmentOrderBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    /**
     * Metode ini dipanggil setelah tampilan fragmen selesai dibuat.
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            // Menetapkan OnClickListener untuk elemen JnsTicket.
            JnsTicket.setOnClickListener {
                // Membuat objek aksi untuk berpindah dari OrderFragment ke PickerFragment.
                val action = OrderFragmentDirections.actionOrderFragmentToPickerFragment()
                // Melakukan navigasi ke PickerFragment.
                findNavController().navigate(action)
            }

            // Mengamati perubahan data dalam LiveData dengan kunci "ticket".
            findNavController().currentBackStackEntry?.
            savedStateHandle?.getLiveData<String>("ticket")?.observe(viewLifecycleOwner) {
                    res -> JnsTicket.setText(res) // Mengatur teks pada JnsTicket dengan data dari LiveData.
            }

            // Menetapkan OnClickListener untuk elemen btnBuyticket.
            btnBuyticket.setOnClickListener {
                // Navigasi kembali ke tata letak sebelumnya.
                findNavController().navigateUp()
            }
        }
    }
}

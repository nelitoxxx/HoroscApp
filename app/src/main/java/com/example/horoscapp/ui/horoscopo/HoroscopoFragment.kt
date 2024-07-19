package com.example.horoscapp.ui.horoscopo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horoscapp.databinding.FragmentHoroscopoBinding

class HoroscopoFragment : Fragment() {

    private var _binding:FragmentHoroscopoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        this._binding = FragmentHoroscopoBinding.inflate(layoutInflater, container, false)
        return this.binding.root
    }
}
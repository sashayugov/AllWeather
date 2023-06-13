package com.example.allweather.ui.yandexweather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.allweather.databinding.FragmentYandexWeatherBinding

class YandexWeatherFragment : Fragment() {

    private var _binding: FragmentYandexWeatherBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val yandexWeatherViewModel =
            ViewModelProvider(this).get(YandexWeatherViewModel::class.java)

        _binding = FragmentYandexWeatherBinding.inflate(inflater, container, false)
        val root: View = binding.root

        yandexWeatherViewModel.text.observe(viewLifecycleOwner) {
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
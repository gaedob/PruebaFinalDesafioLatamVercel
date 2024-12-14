package com.desafiolatam.weatherlatamtest1.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.desafiolatam.weatherlatamtest1.R
import com.desafiolatam.weatherlatamtest1.WeatherApplication
import com.desafiolatam.weatherlatamtest1.data.CELSIUS
import com.desafiolatam.weatherlatamtest1.data.ITEM_ID
import com.desafiolatam.weatherlatamtest1.databinding.FragmentDetailsBinding
import com.desafiolatam.weatherlatamtest1.extension.toFahrenheit
import com.desafiolatam.weatherlatamtest1.extension.toShortDateString
import com.desafiolatam.weatherlatamtest1.view.viewmodel.WeatherViewModel
import com.desafiolatam.weatherlatamtest1.view.viewmodel.WeatherViewModelFactory
import kotlinx.coroutines.flow.collectLatest

class DetailsFragment : Fragment() {

    private val viewModel: WeatherViewModel by viewModels {
        WeatherViewModelFactory((activity?.application as WeatherApplication).repository)
    }

    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    private var weatherInfoId: Int = -1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        savedInstanceState?.getInt(ITEM_ID)?.let { weatherInfoId = it }
        arguments?.getInt(ITEM_ID)?.let { weatherInfoId = it }
        navigateToSettings()
        getWeatherData(weatherInfoId)
        return binding.root
    }

    private fun getWeatherData(id: Int) {

        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE) ?: return
        val unit = sharedPref.getString(getString(R.string.settings_temperature_unit), CELSIUS)

        lifecycleScope.launchWhenResumed {
            viewModel.getWeatherDataById(id).collectLatest { weather ->
                weather?.run {
                    binding.currentTemp.text = "Celc"
//                        if (unit == CELSIUS) currentTemp.toString() else currentTemp.toFahrenheit()
//                            .toString()
                    binding.maximumTemp.text = "getString(R.string.max_temp, maxTemp.toString())"
                    binding.minimumTemp.text = "Celc"
                    binding.pressure.text ="Celc"
                    binding.humidity.text = "Celc"
                    binding.windSpeed.text ="Celc"
                    binding.sunrise.text = "Celc"
                    binding.sunset.text = "Celc"
                    binding.cityName.text = nombre
                }
            }
        }
    }

    private fun navigateToSettings() {
        binding.btnSettings.setOnClickListener {
            findNavController().navigate(R.id.action_detailsFragment_to_settingsFragment)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(ITEM_ID, weatherInfoId)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
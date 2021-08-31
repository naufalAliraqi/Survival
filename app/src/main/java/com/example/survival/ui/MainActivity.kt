package com.example.survival.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.survival.R
import com.example.survival.data.DataManger
import com.example.survival.databinding.ActivityMainBinding
import com.example.survival.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(requireNotNull(binding).root)

        parseFile()

        binding?.teamRecycler?.adapter = TeamAdapter(DataManger.teams)
    }

    private fun parseFile() {
        val inputStream = assets.open("Tokyo.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser = CsvParser()
        buffer.forEachLine {
            val currentVaccine = parser.parse(it)
            DataManger.addVaccine(currentVaccine)
        }
    }
}
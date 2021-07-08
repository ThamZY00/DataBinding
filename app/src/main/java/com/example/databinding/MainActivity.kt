package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var aPerson : Person = Person("ali", "123456","ali@gmail.com","123 Road ABC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.personData = aPerson

        binding.btnUpdate.setOnClickListener {
            aPerson.email = "xxx@gmail.com"
            aPerson.address = "123 Road xyz"

            /* binding.personData = aPerson */
            binding.apply { invalidateAll() }
        }
        /*
        binding.tvNameInput.text = aPerson.name
        binding.tvICInput.text = aPerson.ic
        binding.tvEmailInput.text = aPerson.email
        binding.tvAddressInput.text = aPerson.address */

        /* val tvName:TextView = findViewById(R.id.tvName) */
    }
}
package com.lucky.contacts

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.Toast
import com.lucky.contacts.databinding.Activity2Binding
import com.lucky.contacts.databinding.ContactlistBinding

class Activity2 : AppCompatActivity() {
    lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = Activity2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val button =findViewById<Button>(R.id.btnfloat)
        button.setOnClickListener {
            val intent = Intent(this@Activity2,MainActivity::class.java)
            startActivity(intent)
        }
        onResume()
    }

    override fun onResume() {
        super.onResume()
        clear()
        validateForm()
    }
    fun clear(){
        binding.etFirstName.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilFirstName.error = null
            }

            override fun afterTextChanged(s: Editable?) {
            }
    })
        binding.etLastName.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilLastName.error = null
            }

            override fun afterTextChanged(s: Editable?) {
            }
    })
        binding.etPhoneNumber.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilPhoneNumber.error = null
            }

            override fun afterTextChanged(s: Editable?) {
            }
    })
        binding.etEmail.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tieEmail.error = null
            }
            override fun afterTextChanged(s: Editable?) {
            }
       })
    }
    fun validateForm(){
        val name = binding.etFirstName.text.toString()
        val contacts = binding.etLastName.text.toString()
        val email = binding.etEmail.text.toString()

        var error = false
        if (name.isBlank()){
            binding.tilFirstName.error = "Name required"
            error = true
        }
        if (name.isBlank()){
            binding.tilLastName.error = "Name required"
            error = true
        }
        if (contacts.isBlank()){
            binding.tilPhoneNumber.error = "Contact required"
            error = true
        }
        if (email.isBlank()){
            binding.tieEmail.error = "Email required"
        }
        if (!error){
            Toast.makeText(this,"$name,$contacts,$email",Toast.LENGTH_LONG).show()
        }
    }
    }



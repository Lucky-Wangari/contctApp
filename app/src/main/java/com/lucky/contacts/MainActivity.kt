package com.lucky.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.lucky.contacts.databinding.ActivityMainBinding
import com.lucky.contacts.databinding.ContactlistBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnfloat.setOnClickListener {
            val intent = Intent(this,Activity2::class.java)
            startActivity(intent)

        }
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    fun displayContacts(){
        var contact1 = contactData("https://images.unsplash.com/photo-1489424731084-a5d8b219a5bb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Alice","0745647897","alice@gmail.com")
        var contact2 = contactData("https://images.unsplash.com/photo-1463453091185-61582044d556?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80","lucky","0725845647","luckye@gmail.com")
        var contact3 = contactData("https://images.unsplash.com/photo-1517598024396-46c53fb391a1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=435&q=80","Joan","0745453637","joan@gmail.com")
        var contact4 = contactData("https://images.unsplash.com/photo-1522075469751-3a6694fb2f61?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=580&q=80","Clarine","0795738267","clarine@gmail.com")
        var contact5 = contactData("https://images.unsplash.com/photo-1621905253185-95614217f357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=388&q=80","Grace","07437859556","grace@gmail.com")
        var contact6 = contactData("https://images.unsplash.com/photo-1487546331507-fcf8a5d27ab3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80","Clever","07450574638","clever@gmail.com")
        var contact7 = contactData("https://images.unsplash.com/photo-1543610892-0b1f7e6d8ac1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Gubo","07455784975","gubo@gmail.com")
        var contact8 = contactData("https://images.unsplash.com/photo-1533636721434-0e2d61030955?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80","Lisa","07457547485","lisa@gmail.com")
        var contactList = listOf<contactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        var contactAdapter = ContactAdapter(contactList)
        binding.rvContacts.adapter = contactAdapter

    }
}
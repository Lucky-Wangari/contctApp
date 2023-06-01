package com.lucky.contacts

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
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    fun displayContacts(){
        var contact1 = contactData("","Alice","0745647897","alice@gmail.com")
        var contact2 = contactData("","lucky","0725845647","luckye@gmail.com")
        var contact3 = contactData("","Joan","0745453637","joan@gmail.com")
        var contact4 = contactData("","Clarine","0795738267","clarine@gmail.com")
        var contact5 = contactData("","Grace","07437859556","grace@gmail.com")
        var contact6 = contactData("","Clever","07450574638","clever@gmail.com")
        var contact7 = contactData("","Gubo","07455784975","gubo@gmail.com")
        var contact8 = contactData("","Lisa","07457547485","lisa@gmail.com")
        var contactList = listOf<contactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        var contactAdapter = ContactAdapter(contactList)
        binding.rvContacts.adapter = contactAdapter

    }
}
package com.lucky.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lucky.contacts.databinding.ContactlistBinding

class ContactAdapter(var contactList: List<contactData>):RecyclerView.Adapter<ContactViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contact = contactList[position]
        holder.binding.tvName.text = contact.names
        holder.binding.tvNumber.text = contact.phoneNum
        holder.binding.tvEmail.text = contact.email
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(var binding: ContactlistBinding):RecyclerView.ViewHolder(binding.root){

}










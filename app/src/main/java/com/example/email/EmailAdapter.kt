package com.example.email

import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater

class EmailAdapter(private val emails: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val senderIcon: TextView = itemView.findViewById(R.id.senderIcon)
        val senderName: TextView = itemView.findViewById(R.id.senderName)
        val emailSubject: TextView = itemView.findViewById(R.id.emailSubject)
        val emailPreview: TextView = itemView.findViewById(R.id.emailPreview)
        val emailTime: TextView = itemView.findViewById(R.id.emailTime)
        val star:TextView=itemView.findViewById(R.id.star)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }
    private fun getColorFromName(name: String): Int {
        val hash = name.hashCode()
        val r = (hash and 0xFF0000 shr 16) % 256
        val g = (hash and 0x00FF00 shr 8) % 256
        val b = (hash and 0x0000FF) % 256
        return android.graphics.Color.rgb(r, g, b)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emails[position]
        holder.senderIcon.text = email.sender.first().toString()
        val dynamicColor = getColorFromName(email.sender)
        holder.senderIcon.background.setTint(dynamicColor)
        holder.senderName.text = email.sender
        holder.emailSubject.text = email.subject
        holder.emailPreview.text = email.preview
        holder.emailTime.text = email.time
        holder.star.setOnClickListener{
            val isStarred =email.isStarred
            email.isStarred=!isStarred
            holder.star.setBackgroundResource(
                if(email.isStarred)R.drawable.start_background_uns else R.drawable.star_background
            )
        }
    }

    override fun getItemCount() = emails.size
}

package com.example.email

data class Email(
    val sender: String,
    val subject: String,
    val preview: String,
    val time: String,
    val senderColor: Int,
    var isStarred:Boolean=false
)
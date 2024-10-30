package com.example.email

import android.os.Bundle
import android.graphics.Color
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.activity.enableEdgeToEdge
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emails = listOf(
            Email("Edurila.com", "$19 Only (First 10 spots)", "Are you looking to learn Web Design?", "12:34 PM", Color.BLUE),
            Email("Chris Abad", "Help make Campaign Monitor better", "Let us know your thoughts! No Images...", "11:22 AM", Color.RED),
            Email("Tuto.com", "8h de formation gratuite et les nouvea...", "Photoshop, SEO, Blender, CSS, WordPre...", "11:04 AM", Color.GREEN),
            Email("Support", "Société Ovh : suivi de vos services", "SAS OVH - http://www.ovh.com 2 rue K...", "10:26 AM", Color.GRAY),
            Email("Matt from Ionic", "The New Ionic Creator Is Here!", "Announcing the all-new Creator, build...", "10:00 AM", Color.MAGENTA),
            Email("SkillMastery.com", "$29 Discount for Subscribers", "Become a Python Pro in Weeks!", "10:15 AM", Color.GREEN),
            Email("ProLearn.org", "Free Trial (Limited Time)", "Jumpstart Your Data Science Career", "3:47 PM", Color.RED),
            Email("CodeCamp.net", "$15 Special Offer", "Master JavaScript Essentials", "9:30 AM", Color.BLACK),
            Email("DesignHub.co", "Early Bird Access", "Exclusive UI/UX Design Masterclass", "1:20 PM", Color.BLUE),
            Email("DevExperts.io", "Limited Offer", "Advanced React Workshop", "6:45 PM", Color.YELLOW),
            Email("LearnSmartly.edu", "50% Off All Courses", "Upgrade Your Skills with New Tech", "8:05 AM", Color.YELLOW)
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emails)
    }
}

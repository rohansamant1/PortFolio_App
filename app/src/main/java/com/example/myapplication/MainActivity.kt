package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonSkills= findViewById<Button>(R.id.btnSkills)
        buttonSkills.setOnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
        val buttonEducation= findViewById<Button>(R.id.btnEdu)
        buttonEducation.setOnClickListener {
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }
        val buttonAchivement= findViewById<Button>(R.id.btnAchiev)
        buttonAchivement.setOnClickListener {
            val intent = Intent(this, AchivementActivity::class.java)
            startActivity(intent)
        }
        val buttonWorkxp= findViewById<Button>(R.id.btnWxp)
        buttonWorkxp.setOnClickListener {
            val intent = Intent(this, WorkExpAcrivity::class.java)
            startActivity(intent)
        }
    }
}

package com.ss.basictravelphotoapp


import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var currentImage = 0
    private lateinit var image : ImageButton
    private var places= arrayOf("Ganesh Himal","Mount Everest", "Fewa Taal", "BoudhaNath Temple", "Mount Everest", "Bhaktapur Durbar Square", "Ruby Valley")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<ImageButton>(R.id.btnNext)
        val prev = findViewById<ImageButton>(R.id.btnPrev)
        val placeName = findViewById<TextView>(R.id.TVPlace)


        next.setOnClickListener{
            var idCurrentImageString = "pic$currentImage"

            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id",packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (6+currentImage +1) %6
            var idImageToShowString = "pic$currentImage"
            var idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id",packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            placeName.text = places[currentImage]

        }

        prev.setOnClickListener{
            var idCurrentImageString = "pic$currentImage"

            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id",packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (6+currentImage -1) %6
            var idImageToShowString = "pic$currentImage"
            var idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id",packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            placeName.text = places[currentImage]
        }

    }
}
package com.example.lesson11

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources

class MainActivity : AppCompatActivity() {
    var picture: ImageView? = null
    var btnChangeImage: Button? = null
    var listOfPictures: List<Drawable?>? = null
    var etSearchPicture: EditText? = null
    var cat: List<Drawable?>? = null
    var car: List<Drawable?>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickListeners()

        picture = findViewById<ImageView>(R.id.ivPicture)
        btnChangeImage = findViewById<Button>(R.id.btnChangeImage)
        listOfPictures = listOf(
            AppCompatResources.getDrawable(this, R.drawable.tower),
            AppCompatResources.getDrawable(this, R.drawable.x),
            AppCompatResources.getDrawable(this, R.drawable.mount)
        )
        cat = listOf(
            AppCompatResources.getDrawable(this, R.drawable.cat1),
            AppCompatResources.getDrawable(this, R.drawable.cat2),
            AppCompatResources.getDrawable(this, R.drawable.cat3)
        )
        car = listOf(
            AppCompatResources.getDrawable(this, R.drawable.car1),
            AppCompatResources.getDrawable(this, R.drawable.car2),
        )

        etSearchPicture = findViewById<EditText>(R.id.etSearchPicture)

        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        btnChangeImage?.setOnClickListener {

            when (etSearchPicture?.text.toString()) {
                "picture" -> picture?.setImageDrawable(listOfPictures?.random())
                "car" -> picture?.setImageDrawable(car?.random())
                "cat" -> picture?.setImageDrawable(cat?.random())
            }
        }
    }
}
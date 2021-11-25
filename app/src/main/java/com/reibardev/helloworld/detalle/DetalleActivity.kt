package com.reibardev.helloworld.detalle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reibardev.helloworld.R
import com.reibardev.helloworld.databinding.ActivityDetalleBinding
import com.reibardev.helloworld.list.SuperHeroesAdapter
import com.reibardev.helloworld.model.SuperheroeItem
import com.squareup.picasso.Picasso
import java.io.Serializable

class DetalleActivity : AppCompatActivity() {

    private lateinit var detalleBinding: ActivityDetalleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detalleBinding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(detalleBinding.root)

        val superheroe: SuperheroeItem = intent.extras?.getSerializable("superheroe") as SuperheroeItem

        with(detalleBinding){
            nameTextView.text = superheroe.name
            aliasTextView.text = superheroe.alias
            cityTextView.text = superheroe.city
            occupationTextView.text = superheroe.occupation
            heightTextView.text = superheroe.height.toString()
            facebookTextView.text = superheroe.facebook
            powersTextView.text = superheroe.powers
            Picasso.get().load(superheroe.urlPicture).into(pictureImageView)
        }

    }
}

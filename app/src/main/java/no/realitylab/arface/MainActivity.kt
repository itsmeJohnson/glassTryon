package no.realitylab.arface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import no.realitylab.arface.R
import kotlinx.android.synthetic.main.activity_main.*
import no.realitylab.arface.R.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        button_glasses.setOnClickListener {
            startActivity(Intent(this, GlassesActivity::class.java))
        }


    }

}

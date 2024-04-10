package com.eniecole.mod3xml

import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val buttonProcederPaiement = findViewById<Button>(R.id.buttonProcederPaiement)
        buttonProcederPaiement.text = "Procéder au paiement"
        buttonProcederPaiement.textSize = 18f
        val textViewRecap = findViewById<TextView>(R.id.textViewRecapCommande)
        textViewRecap.typeface = Typeface.DEFAULT_BOLD
        val textViewPrixFraisDePort = findViewById<TextView>(R.id.textViewPrixFraisDePort)
        val prixFDP = 13.63
        textViewPrixFraisDePort.text = "$prixFDP€"

        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        //    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        //    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        //    insets
        //}
    }
}
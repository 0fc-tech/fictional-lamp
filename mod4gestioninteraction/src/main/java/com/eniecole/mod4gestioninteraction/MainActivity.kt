package com.eniecole.mod4gestioninteraction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.eniecole.mod4gestioninteraction.ui.theme.DemonstrationsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemonstrationsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Formulaire()
                }
            }
        }
    }
}

@Composable
fun Formulaire() {
    var prenom by rememberSaveable { mutableStateOf("") }
    var nom by rememberSaveable { mutableStateOf("") }
    var dateNaissance by rememberSaveable { mutableStateOf("") }
    Scaffold{ innerPadding ->
        Column(Modifier
            .fillMaxWidth()
            .padding(innerPadding ),
            verticalArrangement = Arrangement.spacedBy(16.dp)) {
            TextField(
                value = prenom,
                onValueChange = { prenom = it },
                label = { Text("Prénom") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = nom,
                onValueChange = { nom = it },
                label = { Text("Nom") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = dateNaissance,
                onValueChange = { dateNaissance = it },
                label = { Text("Date de Naissance") },
                modifier = Modifier.fillMaxWidth()
            )
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text("Valider")
            }
        }
    }
}

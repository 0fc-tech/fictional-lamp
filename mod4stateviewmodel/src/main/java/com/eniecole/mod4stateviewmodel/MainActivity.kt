package com.eniecole.mod4stateviewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.eniecole.mod4stateviewmodel.ui.theme.DemonstrationsTheme
import java.math.RoundingMode
import java.text.DecimalFormat
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import kotlin.random.Random

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
                    ListNotes()
                }
            }
        }
    }
}

@Composable
//Fournit une instance de ListeNoteViewModel (ne recréé pas si déjà existant)
fun ListNotes(vm: ListeNoteViewModel = viewModel()) {
    var noteForm by remember { mutableStateOf("") }
    val listNote = vm.listNotes.collectAsState()
    Column {
        LazyColumn(Modifier.weight(1f)) {
            items(listNote.value) { note ->
                val format = DecimalFormat("#.##")
                format.roundingMode = RoundingMode.CEILING
                val noteString = format.format(note)
                Text(noteString)
            }
        }
        Row{
           TextField(noteForm,{noteForm = it})
           IconButton(onClick = { vm.ajouterNote(noteForm.toDouble())}) {
               Icon(imageVector = Icons.Default.Send,
                   contentDescription = "send")
           }
        }
    }
}








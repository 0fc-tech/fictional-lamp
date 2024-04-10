package com.eniecole.mod4gateauchocolat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eniecole.mod4gateauchocolat.ui.theme.DemonstrationsTheme

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
                    RecetteGateauChocolat()
                }
            }
        }
    }
}

@Composable
fun RecetteGateauChocolat() {
    var nbOeufs by rememberSaveable {mutableIntStateOf(2)}
    val gFarine = 200
    val gSucre = 100
    Card {
        Row(Modifier.padding(all = 8.dp)) {
            Text("Ingrédients:")
            Spacer(modifier = Modifier.padding(horizontal = 8.dp))
            Column {
                Row{
                    IconButton(onClick = {
                        nbOeufs+=1
                    }) {
                        Icon(imageVector = Icons.Default.KeyboardArrowUp,
                            contentDescription = null)
                    }
                    Text("$nbOeufs oeufs")
                    IconButton(onClick = { nbOeufs-=1  }) {
                        Icon(imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = null)
                    }
                }
                Spacer (modifier = Modifier.padding(vertical = 8.dp))
                Text ("$gFarine g Farine")
                Spacer (modifier = Modifier.padding(vertical = 8.dp))
                Text ("$gSucre g Sucre")
            }
        }
    }
}







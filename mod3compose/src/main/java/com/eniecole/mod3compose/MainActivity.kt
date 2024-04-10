package com.eniecole.mod3compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.eniecole.mod3compose.ui.theme.DemonstrationsTheme
import com.eniecole.mod3compose.ui.theme.Typography

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
                    PhoneSpecs()
                }
            }
        }
    }
}

@Composable
fun PhoneSpecs() {
    Column {
        Text("Processeur : SnapDragon 8Gen2",
            style = Typography.titleLarge)
        Text("Camera : Sony Lens",
            style = Typography.titleLarge)
        Text("Verre : Gorilla Glass 9",
            style = Typography.titleLarge)
        Text("Charge : 18h d'autonomie",
            style = Typography.titleLarge)
        Button(
            onClick = { /*TODO*/ },
            Modifier.fillMaxWidth()) {
            Text("Acheter ce super téléphone")
        }
    }
}
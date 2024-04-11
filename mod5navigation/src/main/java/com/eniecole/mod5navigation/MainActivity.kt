package com.eniecole.mod5navigation

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.eniecole.mod5navigation.ui.theme.DemonstrationsTheme


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
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun Navigation() {
    val navController: NavHostController = rememberNavController()
    NavHost(
        navController =navController,
        startDestination = "signIn"){
        composable("signIn"){
            SignInPage(onClickToHome = {navController.navigate("home")})
        }
        composable("home"){
            HomePage()
        }
    }
}

@Composable
fun HomePage() {
    Text(modifier = Modifier.padding(16.dp),
        text = "Bienvenue sur votre espace"
    )
}

@Composable
fun SignInPage(onClickToHome : ()-> Unit) {
    Scaffold(Modifier.padding(16.dp)) {innerPadding->
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            Text("Connectez-vous", style = MaterialTheme.typography.headlineMedium)
            TextField(
                modifier=Modifier.fillMaxWidth(),
                value = "Steve Travail",
                onValueChange = {})
            TextField(
                modifier=Modifier.fillMaxWidth(),
                value = "•••••••••",
                onValueChange = {}
            )
            OutlinedButton(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxWidth(),
                onClick = onClickToHome
            ) {
                Text("Se Connecter")
            }
        }
    }
}


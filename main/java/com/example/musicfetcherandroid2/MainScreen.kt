// MainScreen.kt
package com.example.musicfetcherandroid2

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.*
import androidx.compose.animation.fadeIn
import androidx.compose.animation.core.tween
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.ui.text.style.TextAlign
import com.example.musicfetcherandroid2.ui.theme.Purple80

@Composable
fun MainScreen(navController: NavHostController) {
    var greetingVisible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        greetingVisible = true
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top, // Set verticalArrangement to Top
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AnimatedVisibility(
            visible = greetingVisible,
            enter = fadeIn(
                animationSpec = tween(durationMillis = 1000)
            )
        ) {
            Greeting("Welcome to MusicFetcher")
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center, // Set verticalArrangement to Top
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        //Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navController.navigate("second_screen") }) {
            Text("Go to Second Screen")
        }
    }
}

@Composable
fun Greeting(s: String) {
    Text(
        text = s,
        color = Purple80,
        style = MaterialTheme.typography.displayMedium, // Adjust the style as needed
        textAlign = TextAlign.Center,
        modifier = Modifier
            .border(1.dp,Color.Black)
            .padding(8.dp) // Add some padding for better visibility
    )
}

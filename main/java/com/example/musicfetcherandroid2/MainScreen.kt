// MainScreen.kt
package com.example.musicfetcherandroid2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.border
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun MainScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top, // Set verticalArrangement to Top
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Greeting("Welcome to MusicFetcher")
        Spacer(modifier = Modifier.weight(1f)) // Spacer with weight to push the next item to the center
        // Button directly inside the main Column
        Button(onClick = { navController.navigate("second_screen") }) {
            Text("Go to Second Screen")
        }
    }
}

@Composable
fun Greeting(s: String) {
    Text(
        text = s,
        style = MaterialTheme.typography.displayLarge, // Adjust the style as needed
        modifier = Modifier
            .border(1.dp,Color.Black)
            .padding(8.dp) // Add some padding for better visibility
    )
}

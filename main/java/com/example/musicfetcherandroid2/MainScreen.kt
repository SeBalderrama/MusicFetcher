// MainScreen.kt
package com.example.musicfetcherandroid2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.musicfetcherandroid2.ui.theme.MusicFetcherAndroid2Theme

@Composable
fun MainScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Greeting("Welcome to MusicFetcher")
        Spacer(modifier = Modifier.height(16.dp))
        // Add a button that navigates to the second screen
        Button(onClick = { navController.navigate("second_screen") }) {
            Text("Go to Second Screen")
        }
    }
}

@Composable
fun Greeting(s: String) {
    Text(
        text = s,
        style = MaterialTheme.typography.bodyLarge // Adjust the style as needed
    )
}

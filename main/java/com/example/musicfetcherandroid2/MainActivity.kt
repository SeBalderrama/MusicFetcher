// MainActivity.kt
package com.example.musicfetcherandroid2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.musicfetcherandroid2.ui.theme.MusicFetcherAndroid2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicFetcherAndroid2Theme {
                // Create a NavController
                val navController = rememberNavController()

                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    // Use the NavHost to handle navigation
                    NavHost(navController, startDestination = "main_screen") {
                        composable("main_screen") {
                            MainScreen(navController)
                        }
                        composable("second_screen") {
                            SecondScreen()
                        }
                    }
                }
            }
        }
    }
}

package com.abvanpelt.planty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.abvanpelt.planty.ui.add.AddPlantScreen
import com.abvanpelt.planty.ui.home.HomeScreen
import com.abvanpelt.planty.navigation.AddPlant
import com.abvanpelt.planty.navigation.Home
import com.abvanpelt.planty.ui.theme.PlantyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            PlantyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(navController = navController, startDestination = Home) {
                        composable<Home> {
                            HomeScreen { navController.navigate(AddPlant) }
                        }
                        composable<AddPlant> {
                            AddPlantScreen()
                        }
                    }
                }
            }
        }
    }
}
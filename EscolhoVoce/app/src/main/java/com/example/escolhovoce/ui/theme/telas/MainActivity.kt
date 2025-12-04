package com.example.escolhovoce.ui.theme.telas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.escolhovoce.ui.theme.EscolhoVoceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //navegação
            EscolhoVoceTheme {
                val navController = rememberNavController()
                NavHost(
                    navController,
                    startDestination = "home"
                )
                {
                    composable("home") {
                        Home(navController)

                    }

                    composable("quiz") {
                        Quiz(navController)
                    }

                    composable(route = "quiz_1_wow") {
                        Wow(navController)
                    }

                    composable(route = "quiz_2_minecraft") {
                        Minecraft(navController)
                    }

                    composable(route = "quiz_3_spore"){
                        Spore(navController)
                    }

                    composable(route = "quiz_4_valorant") {
                        Valorant(navController)
                    }

                    composable(route = "quiz_5_clashroyale") {
                        ClashRoyale(navController)
                    }
                }
            }
        }
    }
}
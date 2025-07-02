package com.hiteshgoyal.snakereborn.presentation.activity

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hiteshgoyal.snakereborn.domain.base.BaseActivity
import com.hiteshgoyal.snakereborn.domain.navigation.Screen
import com.hiteshgoyal.snakereborn.presentation.screen.AboutScreen
import com.hiteshgoyal.snakereborn.presentation.screen.HighScoreScreen
import com.hiteshgoyal.snakereborn.presentation.screen.MenuScreen
import com.hiteshgoyal.snakereborn.presentation.screen.SettingScreen

class MainActivity : BaseActivity() {
    private lateinit var navController: NavHostController

    @Composable
    override fun Content() {
        navController = rememberNavController()
        SetupNavigation()
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun SetupNavigation() {
        NavHost(navController = navController, startDestination = Screen.Menu.route) {
            composable(Screen.Menu.route) { MenuScreen(navController) }
            composable(Screen.HighScores.route) { HighScoreScreen(navController) }
            composable(Screen.Settings.route) { SettingScreen(navController) }
            composable(Screen.About.route) { AboutScreen(navController) }
        }
    }
}

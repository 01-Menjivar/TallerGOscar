package com.permafrost.pretaller.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.permafrost.pretaller.FirstScreen
import com.permafrost.pretaller.ui.theme.SecondScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.FirstScreen.route

    ) {
        composable(
            route = Screens.FirstScreen.route
        ) {
            FirstScreen(navController = navController)
        }

        composable(
            route = Screens.SecondScreen.route
        ) {
            SecondScreen(navController = navController)
        }


    }
}
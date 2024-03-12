package com.jasmeet.perfisystask.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jasmeet.perfisystask.screens.HomeScreen
import com.jasmeet.perfisystask.screens.Screens
import com.jasmeet.perfisystask.screens.Task1HistoryScreen
import com.jasmeet.perfisystask.screens.Task1HomeScreen
import com.jasmeet.perfisystask.screens.Task1Screen
import com.jasmeet.perfisystask.screens.Task2HomeScreen
import com.jasmeet.perfisystask.screens.Task2ProfileScreen
import com.jasmeet.perfisystask.screens.Task2Screen

@Composable
fun MainNavHost(navHost: NavHostController) {

    NavHost(
        navController = navHost,
        startDestination = Screens.HomeScreen.route
    ) {

        composable(Screens.HomeScreen.route) { HomeScreen(navHost = navHost) }

        composable(Screens.Task1Screen.route) { Task1Screen(navHost = navHost) }
        composable(Screens.Task2Screen.route) { Task2Screen(navHost = navHost) }

        composable(Screens.Task1HomeScreen.route) { Task1HomeScreen(navHost = navHost) }
        composable(Screens.Task1HistoryScreen.route) { Task1HistoryScreen(navHost = navHost) }

        composable(Screens.Task2HomeScreen.route) { Task2HomeScreen(navHost = navHost) }
        composable(Screens.Task2ProfileScreen.route) { Task2ProfileScreen(navHost = navHost) }

    }

}
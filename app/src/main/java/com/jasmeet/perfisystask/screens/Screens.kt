package com.jasmeet.perfisystask.screens

sealed class Screens (val route :String){

    data object HomeScreen : Screens("home_screen")
    data object Task1Screen : Screens("task1_screen")
    data object Task2Screen : Screens("task2_screen")
    data object Task1HomeScreen : Screens("task1_home_screen")
    data object Task1HistoryScreen : Screens("task1_history_screen")
    data object Task2HomeScreen : Screens("task2_home_screen")
    data object Task2ProfileScreen : Screens("task2_profile_screen")

}
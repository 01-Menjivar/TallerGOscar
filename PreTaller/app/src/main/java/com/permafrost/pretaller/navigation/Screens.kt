package com.permafrost.pretaller.navigation

sealed class Screens (val route: String) {
    data object FirstScreen : Screens("first_screen")
    data object SecondScreen : Screens("second_screen")

}
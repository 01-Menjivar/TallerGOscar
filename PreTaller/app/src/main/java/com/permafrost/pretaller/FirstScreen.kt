package com.permafrost.pretaller

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.permafrost.pretaller.navigation.Screens
import com.permafrost.pretaller.ui.theme.PreTallerTheme

@Composable
fun FirstScreen(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "First Screen", modifier = Modifier
                .clickable { navController.navigate(route = Screens.SecondScreen.route) }
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun FirstScreenPreview() {
    PreTallerTheme {
        FirstScreen(navController = rememberNavController())
    }
}
package com.jasmeet.perfisystask.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.jasmeet.perfisystask.appComponents.TextComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Task2Screen(navHost: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Select your option for Task 2") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xff00b4d8),
                    titleContentColor = Color.Black
                )
            )
        }
    ) {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .fillMaxSize()
                .padding(vertical = it.calculateTopPadding(), horizontal = 16.dp)
        ) {
            TextComponent(
                text = "Home Page of Margh app",
                textSize = 18.sp,
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth()
                    .clickable {
                        navHost.navigate(Screens.Task2HomeScreen.route)
                    }
                    .padding(all = 5.dp),
                textColor = MaterialTheme.colorScheme.onBackground
            )
            HorizontalDivider(thickness = 1.5.dp)
            TextComponent(
                text = "Profile Page of Margh app",
                textSize = 18.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navHost.navigate(Screens.Task2ProfileScreen.route)
                    }
                    .padding(all = 5.dp),
                textColor = MaterialTheme.colorScheme.onBackground
            )

        }
    }


}
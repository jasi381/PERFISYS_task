package com.jasmeet.perfisystask

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.graphics.alpha
import androidx.navigation.compose.rememberNavController
import com.jasmeet.perfisystask.navigation.MainNavHost
import com.jasmeet.perfisystask.ui.theme.PERFISYSTaskTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PERFISYSTaskTheme {
                val navHost = rememberNavController()
                MainNavHost(navHost = navHost)
            }
        }
    }
}

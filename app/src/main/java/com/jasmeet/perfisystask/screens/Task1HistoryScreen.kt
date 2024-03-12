package com.jasmeet.perfisystask.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.jasmeet.perfisystask.appComponents.TextComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Task1HistoryScreen(navHost: NavHostController) {

    BackHandler {
        navHost.popBackStack()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {},
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White),
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = null,
                            tint = Color.Black,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                }
            )
        }
    ) {
        ConstraintLayout(
            Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            val (
                headerText, historyLayout,
                expenseHistoryBtn,
            ) = createRefs()
            TextComponent(
                text = "Expenses",
                textAlign = TextAlign.Center,
                modifier = Modifier.constrainAs(headerText) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
                textSize = 28.sp,
                fontWeight = FontWeight.SemiBold
            )
            Column(
                Modifier.width(LocalConfiguration.current.screenWidthDp.dp *0.8f)
                    .constrainAs(historyLayout){
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        top.linkTo(headerText.bottom,55.dp)
                    }
            ) {

                TextComponent(
                    text = "John has to give 25.9 to mike",
                    textSize = 20.5.sp,
                    fontWeight = FontWeight.W300,
                    modifier = Modifier.padding(bottom = 18.dp).fillMaxWidth()
                )

                TextComponent(
                    text = "Mike has to give 67.5 to John",
                    textSize = 20.5.sp,
                    fontWeight = FontWeight.W300,
                    modifier = Modifier.padding(bottom = 18.dp).fillMaxWidth()
                )

                TextComponent(
                    text = "Alice has to give 15.2 to Mike",
                    textSize = 20.5.sp,
                    fontWeight = FontWeight.W300,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            ExtendedFloatingActionButton(
                modifier = Modifier
                    .constrainAs(expenseHistoryBtn) {
                        start.linkTo(headerText.start)
                        end.linkTo(headerText.end)
                        bottom.linkTo(parent.bottom, margin = 50.dp)
                    },
                onClick = {},
                containerColor = Color.White,
                shape = RoundedCornerShape(10.dp)
            ) {
                TextComponent(text = "Expense history", textSize = 18.sp)

            }
        }
    }
}

@Preview
@Composable
private fun Task1HistoryScreenPreview() {
    val navHost = NavHostController(LocalContext.current)
    Task1HistoryScreen(navHost)
}
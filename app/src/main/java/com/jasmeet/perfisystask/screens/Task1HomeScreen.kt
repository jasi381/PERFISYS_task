package com.jasmeet.perfisystask.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.jasmeet.perfisystask.R
import com.jasmeet.perfisystask.appComponents.TextComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Task1HomeScreen(navHost: NavHostController) {

    BackHandler {
        navHost.popBackStack()
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {},
                navigationIcon = {
                    IconButton(
                        onClick = {},
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_consol),
                            contentDescription = "Games",
                            colorFilter = ColorFilter.tint(Color(0xff4262c7))
                        )

                    }
                },
                actions = {
                    IconButton(
                        onClick = {},
                    ) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "Menu"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        }
    ) {
        ConstraintLayout(
            Modifier
                .background(Color.White)
                .fillMaxSize()
                .padding(it)
        ) {

            val (
                headerText, cardLayout, spendByText,
                tableLayout, showButton, addButton
            ) = createRefs()

            TextComponent(
                text = "Monthly expenses tracer",
                textColor = Color(0xff3c679d),
                textAlign = TextAlign.Center,
                modifier = Modifier.constrainAs(headerText) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
                textSize = 24.sp,
                fontWeight = FontWeight.W500
            )

            ElevatedCard(
                modifier = Modifier.constrainAs(cardLayout) {
                    start.linkTo(headerText.start)
                    end.linkTo(headerText.end)
                    top.linkTo(headerText.bottom, margin = 50.dp)
                },
                colors = CardDefaults.elevatedCardColors(containerColor = Color.White),
                elevation = CardDefaults.elevatedCardElevation(
                    defaultElevation = 10.dp
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    Modifier.padding(
                        start = 18.dp,
                        end = 18.dp,
                        top = 18.dp,
                        bottom = 25.dp
                    ),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    TextComponent(
                        text = "This month",
                        textColor = Color(0xff949494),
                        textSize = 16.sp
                    )

                    Spacer(modifier = Modifier.height(32.dp))

                    TextComponent(
                        text = "2128",
                        textColor = Color.Black,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.SemiBold,
                        textSize = 28.sp
                    )
                }
            }

            TextComponent(
                text = "Spend by",
                textColor = Color.Black,
                fontWeight = FontWeight.SemiBold,
                textSize = 22.sp,
                modifier = Modifier.constrainAs(spendByText) {
                    start.linkTo(headerText.start)
                    top.linkTo(cardLayout.bottom, margin = 40.dp)
                }
            )
            Column(
                Modifier
                    .constrainAs(tableLayout) {
                        start.linkTo(spendByText.start, margin = 25.dp)
                        top.linkTo(spendByText.bottom, margin = 20.dp)

                    }
                    .wrapContentWidth()
            ) {
                Row(
                    Modifier.width(LocalConfiguration.current.screenWidthDp.dp * 0.55f),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TextComponent(
                        text = "Alice",
                        textSize = 22.sp,
                        modifier = Modifier
                    )
                    TextComponent(
                        text = "803",
                        textSize = 22.sp,
                        modifier = Modifier
                    )

                }

                Row(
                    Modifier
                        .padding(top = 15.dp)
                        .width(LocalConfiguration.current.screenWidthDp.dp * 0.55f),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TextComponent(
                        text = "John",
                        textSize = 22.sp,
                        modifier = Modifier
                    )
                    TextComponent(
                        text = "695",
                        textSize = 22.sp,
                        modifier = Modifier
                    )

                }

                Row(
                    Modifier
                        .padding(top = 15.dp)
                        .width(LocalConfiguration.current.screenWidthDp.dp * 0.55f),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TextComponent(
                        text = "Mike",
                        textSize = 22.sp,
                        modifier = Modifier
                    )
                    TextComponent(
                        text = "610",
                        textSize = 22.sp,
                        modifier = Modifier
                    )

                }
            }

            ExtendedFloatingActionButton(
                modifier = Modifier
                    .constrainAs(showButton) {
                        start.linkTo(headerText.start)
                        bottom.linkTo(parent.bottom, margin = 50.dp)
                    },
                onClick = {},
                containerColor = Color.White,
                shape = RoundedCornerShape(10.dp)
            ) {
                TextComponent(text = "Show Expenses", textSize = 18.sp)

            }
            SmallFloatingActionButton(
                modifier = Modifier
                    .constrainAs(addButton) {
                        end.linkTo(headerText.end)
                        bottom.linkTo(parent.bottom, margin = 50.dp)
                    },
                onClick = {},
                shape = CircleShape,
                containerColor = Color.White
            ) {
                Icon(
                    imageVector = Icons.Default.Add, contentDescription = null,
                    modifier = Modifier
                        .padding(12.dp)
                        .size(26.dp),
                    tint = Color(0xff5667a7)
                )

            }
        }

    }

}

@Preview
@Composable
private fun Task1HomeScreenPreview() {
    val navHost = NavHostController(LocalContext.current)
    Task1HomeScreen(navHost)
}
package com.jasmeet.perfisystask.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.jasmeet.perfisystask.appComponents.ButtonComponent
import com.jasmeet.perfisystask.appComponents.ElevatedCardComponent
import com.jasmeet.perfisystask.ui.theme.inter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Task2ProfileScreen(navHost: NavHostController) {

    BackHandler {
        navHost.popBackStack()
    }
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Profile",
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 26.sp,
                        fontFamily = inter
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White),
                actions = {
                    ElevatedCardComponent(
                        text = "Upload your Quotes",
                        textModifier = Modifier.padding(vertical = 12.dp, horizontal = 5.dp),
                        textColor = Color(0xff8e8e8e),
                        modifier = Modifier.padding(end = 6.dp),
                        enableClick = true,
                        onClick = {},
                    )
                }
            )
        }
    ) {
        Column(
            Modifier
                .padding(vertical = it.calculateTopPadding())
                .fillMaxSize()
                .padding(horizontal = 12.dp)
                .background(Color.White)
        ) {
            Image(
                imageVector = Icons.Rounded.AccountCircle,
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 15.dp)
                    .clip(CircleShape)
                    .align(Alignment.CenterHorizontally)
                    .size(110.dp),
                colorFilter = ColorFilter.tint(Color(0xff919191))
            )

            ElevatedCardComponent(
                text = "UserName",
                textModifier = Modifier
                    .padding(vertical = 16.dp)
                    .fillMaxWidth(),
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp, top = 25.dp)
                    .fillMaxWidth(),
                fontWeight = FontWeight.SemiBold,
                textSize = 18.sp
            )

            Row (
                Modifier
                    .padding(start = 10.dp, end = 16.dp, top = 13.dp)
                    .fillMaxWidth()
            ){
                ElevatedCardComponent(
                    text = "Share",
                    textModifier = Modifier
                        .padding(vertical = 21.dp)
                        .fillMaxWidth(),
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(),
                    enableClick = true,
                    onClick = {},
                    textColor = Color(0xff919191)
                )
                Spacer(modifier = Modifier.width(18.dp))
                ElevatedCardComponent(
                    text = "Contact us",
                    textModifier = Modifier
                        .padding(vertical = 21.dp)
                        .fillMaxWidth(),
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(),
                    enableClick = true,
                    onClick = {},
                    textColor = Color(0xff919191)
                )

            }
            ElevatedCardComponent(
                text = "About us",
                textModifier = Modifier
                    .padding(vertical = 16.dp)
                    .fillMaxWidth(),
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp, top = 13.dp)
                    .fillMaxWidth(),
                textSize = 16.sp,
                enableClick = true,
                onClick = {},
                textColor = Color(0xff919191)
            )

            ButtonComponent(
                text = "LOGOUT",
                onClick = {},
                buttonColor = Color(0xffd6d8d7),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 50.dp),
                shape = RoundedCornerShape(2.dp),
                fontWeight = FontWeight.SemiBold

            )

        }

    }

}

@Preview
@Composable
private fun Task2ProfileScreenPreview() {
    val navHost = NavHostController(LocalContext.current)
    Task2ProfileScreen(navHost)
}
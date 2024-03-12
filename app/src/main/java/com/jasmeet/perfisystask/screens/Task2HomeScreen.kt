package com.jasmeet.perfisystask.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FileDownload
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.PersonOutline
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asAndroidBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.jasmeet.perfisystask.R
import com.jasmeet.perfisystask.appComponents.TextComponent
import com.jasmeet.perfisystask.ui.theme.inter
import com.jasmeet.perfisystask.utils.Utils.getDominantColorFromBitmap


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Task2HomeScreen(navHost: NavHostController) {

    val imgList = listOf(
        R.drawable.img,
        R.drawable.img_1,
        R.drawable.img_2,
        R.drawable.img_3,
        R.drawable.img_4,
        R.drawable.img_5,
        R.drawable.img_6,
        R.drawable.img_7,
    )

    val pagerState = rememberPagerState {
        imgList.size
    }

    BackHandler {
        navHost.popBackStack()
    }

    Scaffold(
        bottomBar = {
            Row (
                Modifier
                    .navigationBarsPadding()
                    .fillMaxWidth()
                    .background(Color.White)
                    .height(54.dp)
            ){
                Column(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = null,
                        modifier = Modifier.size(28.dp),
                        tint = Color(0xff2a335c)
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Home",
                        fontSize = 15.sp,
                        fontFamily = inter,
                        color = Color(0xff2a335c)

                    )

                }

                Column(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Outlined.FavoriteBorder,
                        contentDescription = null,
                        modifier = Modifier.size(28.dp),
                        tint = Color(0xff2a335c)
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Saved",
                        fontSize = 15.sp,
                        fontFamily = inter,
                        color = Color(0xff2a335c)

                    )

                }

                Column(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Outlined.PersonOutline,
                        contentDescription = null,
                        modifier = Modifier.size(28.dp),
                        tint = Color(0xff2a335c)
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Profile",
                        fontSize = 15.sp,
                        fontFamily = inter,
                        color = Color(0xff2a335c)

                    )

                }

            }

        }) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(vertical = it.calculateTopPadding())
                .navigationBarsPadding()
                .background(
                    Color.White
                )
        ) {
            HeaderRow()
            VerticalPager(
                modifier = Modifier

                    .padding(top = 4.dp)
                    .fillMaxSize()
                    .navigationBarsPadding(),
                state = pagerState,
                userScrollEnabled = true
            ) {id->
                val bitmap = ImageBitmap.imageResource(imgList[id])
                val dominantColor =
                    remember { getDominantColorFromBitmap(bitmap.asAndroidBitmap()) }
                Column(
                    Modifier
                        .padding(horizontal = 4.dp)
                        .background(color = dominantColor)
                        .fillMaxSize()
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()

                    ) {
                        Image(
                            painter = painterResource(id = imgList[id]),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(horizontal = 25.dp)
                                .align(Alignment.TopCenter)
                        )
                    }

                    Row(
                        Modifier
                            .padding(top = 22.dp, start = 10.dp, end = 10.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .fillMaxWidth()
                            .background(Color.White, RoundedCornerShape(8.dp))
                            .height(66.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {

                        Column(
                            modifier = Modifier.weight(1f),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.FavoriteBorder,
                                contentDescription = null,
                                modifier = Modifier.size(28.dp)
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = "Save",
                                fontSize = 15.sp,
                                fontFamily = inter,
                                color = Color(0xff8c8c8c)

                            )

                        }

                        Column(
                            modifier = Modifier.weight(1f),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Default.FileDownload,
                                contentDescription = null,
                                modifier = Modifier.size(28.dp)
                            )

                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = "Download",
                                fontSize = 15.sp,
                                fontFamily = inter,
                                color = Color(0xff8c8c8c)
                            )
                        }


                        Column(
                            modifier = Modifier.weight(1f),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.Share,
                                contentDescription = null,
                                modifier = Modifier.size(28.dp)
                            )


                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = "Share",
                                fontSize = 15.sp,
                                fontFamily = inter,
                                color = Color(0xff8c8c8c)
                            )
                        }


                    }
                }
            }


        }
    }


}

@Composable
fun HeaderRow() {

    Row(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(Color(0xfff3f6fb))
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp, top = 10.dp)
        ) {
            TextComponent(
                text = "Afternoon vibes are positive vibes.",
                textSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Surface(
                    color = Color(0xff27355c),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    TextComponent(
                        text = "Random quotes",
                        modifier = Modifier.padding(vertical = 12.dp, horizontal = 8.dp),
                        textColor = Color(0xffe7edff),
                        textSize = 14.sp
                    )
                }
                Spacer(Modifier.width(8.dp))


                Surface(
                    onClick = {},
                    shape = MaterialTheme.shapes.extraLarge,
                    modifier = Modifier
                        .fillMaxWidth(),
                    border = BorderStroke(1.dp, Color(0xffd6d8db))
                ) {
                    Row(
                        Modifier
                            .padding(horizontal = 8.dp, vertical = 6.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Search,
                            contentDescription = "search",
                            tint = Color(0xffb6b6b6)
                        )
                        Icon(
                            imageVector = Icons.Default.Mic,
                            contentDescription = "mic",
                            tint = Color(0xff808080)
                        )
                    }

                }
            }
        }

    }
}

@Preview
@Composable
private fun Task2HomeScreenPreview() {
    val navHost = NavHostController(LocalContext.current)
    Task2HomeScreen(navHost)
}

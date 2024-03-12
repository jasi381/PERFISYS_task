package com.jasmeet.perfisystask.appComponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ElevatedCardComponent(
    modifier: Modifier = Modifier,
    textModifier: Modifier = Modifier,
    text:String,
    color :Color = Color.White,
    textColor :Color = Color.Black,
    textSize :TextUnit = 16.sp,
    enableClick :Boolean = false,
    onClick : () -> Unit = {},
    fontWeight: FontWeight = FontWeight.Normal

    ) {

    val clickModifier = if (enableClick) Modifier.clickable(onClick = onClick) else Modifier


    ElevatedCard(
        modifier = modifier.then(clickModifier),
        colors = CardDefaults.elevatedCardColors(
            containerColor = color
        ),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 10.dp
        ),
        shape = RoundedCornerShape(5.dp)
    ) {
        TextComponent(
            textColor = textColor,
            textSize = textSize,
            text = text,
            modifier = textModifier,
            textAlign = TextAlign.Center,
            fontWeight = fontWeight
        )
    }


}
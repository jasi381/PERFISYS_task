package com.jasmeet.perfisystask.appComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jasmeet.perfisystask.style.ButtonStyle
import com.jasmeet.perfisystask.ui.theme.inter

@Composable
fun ButtonComponent(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    textColor: Color = Color.Black,
    textSize: TextUnit = 16.sp,
    fontFamily: FontFamily = inter,
    fontWeight: FontWeight = FontWeight.Normal,
    buttonColor: Color = Color.White,
    shape: Shape = RectangleShape,
    style: ButtonStyle = ButtonStyle.DEFAULT,
    enabled: Boolean = true,
    //this will be used for the elevation of the button in case of default button not for the outlined button
    elevation: ButtonElevation = ButtonDefaults.buttonElevation(
        defaultElevation = 0.dp,
        pressedElevation = 0.dp,
        disabledElevation = 0.dp
    ),
) {
    when (style) {
        ButtonStyle.DEFAULT -> {
            Button(
                modifier = modifier,
                onClick = { onClick.invoke() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = buttonColor
                ),
                shape = shape,
                enabled = enabled,
                elevation = elevation
            ) {
                Text(
                    text = text,
                    color = textColor,
                    fontSize = textSize,
                    fontFamily = fontFamily,
                    fontWeight = fontWeight
                )
            }

        }

        ButtonStyle.OUTLINED -> {
            OutlinedButton(
                modifier = modifier,
                shape = shape,
                onClick = { onClick.invoke() }
            ) {
                Text(
                    text = text,
                    color = textColor,
                    fontSize = textSize,
                    fontFamily = fontFamily,
                    fontWeight = fontWeight,
                    textAlign = TextAlign.Center,
                )
            }
        }

    }
}


@Preview
@Composable
private fun ButtonComponentPreview() {


    Column(
        Modifier.background(Color.Gray).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ButtonComponent(
            text = "Default Button",
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(vertical = 10.dp)
        )
        ButtonComponent(
            text = "Default Button",
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(vertical = 10.dp),
            style = ButtonStyle.OUTLINED
        )

    }

}
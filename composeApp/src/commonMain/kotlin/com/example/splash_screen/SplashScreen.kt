package com.example.splash_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun SplashScreen() {

    val primaryColor = Color(0xFF00130E)
    val midGreen = Color(0xFF004531)
    val lightGreen = Color(0xFF5ED98B)
    val lightBlue = Color(0xFF00EDD6)
    val bottomYellow = Color(0xFFD4E182)

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(primaryColor)
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.radialGradient(

                        colors = listOf(
                            primaryColor,
                            midGreen,
                            lightBlue,
                            Color.Transparent,
                        ),

                        center = Offset(x = 500f, y = 0f),
                        radius = 3000f,
                    ),
                    alpha = 0.9f
                )
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            bottomYellow,
                            lightGreen,

                            Color.Transparent
                            ),
                        center = Offset(x = 550f, y = Float.POSITIVE_INFINITY),
                        radius = 1000f
                    )
                )
        )

        Text(
            text = "Rabta",
            style = TextStyle(
                color = Color.White,
                fontSize = 64.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Cursive
            )
        )
    }
}

@Preview(
    showBackground = true,
    device = "spec:width=412dp,height=912dp"
)
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}

package com.example.splash_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SplashScreen(){

    val firstLayerColor = listOf(
        Color(0xFF001F15),
        Color(0xFF00EDD6),
        //Color(0xFFE4FF95)
    )

    val secondLayer = listOf(
        Color(0xFF00EDD6),
        Color(0xFFE4FF95)
    )

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .matchParentSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = firstLayerColor,
                    )
                )
        )

        /*Box(
            modifier = Modifier
                .matchParentSize()
                .offset( y = 50.dp)
                .background(
                    brush = Brush.radialGradient(
                        colors = secondLayer,
                        center = Offset.Unspecified,
                        radius = 150.0f,
                        tileMode = TileMode.Mirror
                    )
                )
        )*/

        //
    }

//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(
//                color = Color.Green
//            )
//            .offset( y = 20.dp)
//            .background(
//                color = Color.Red
////                brush = Brush.verticalGradient(
////                    colors = firstLayer,
////                    endY = 200.0f
////                )
//            )
//            .offset( y= 25.dp)
//            .background(
//                brush = Brush.radialGradient(
//                    0.0f to Color.Red,
//                    1.0f to Color.Blue,
//                    center = Offset.Unspecified,
//                    radius = 150.0f,
//                    tileMode = TileMode.Mirror,
//                )
//            )
//    ){
//
//    }
}

@Preview(
    showBackground = true,
    device = "spec:width=412dp,height=912dp"
)
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}

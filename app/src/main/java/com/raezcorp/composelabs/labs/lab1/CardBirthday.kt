package com.raezcorp.composelabs.labs.lab1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.raezcorp.composelabs.R

@Composable
fun CardBirthday() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = "Birthday image",
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 20.dp)
            ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Happy Birthday Sam!",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Normal
                )
            )
            Text(
                text = "- from Emma",
                style = TextStyle(
                    fontSize = 18.sp,
                )
            )
        }

    }

}

@Preview(showSystemUi = true)
@Composable
fun CardBirthdayPreview() {
    CardBirthday()
}
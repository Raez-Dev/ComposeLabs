package com.raezcorp.composelabs.labs.lab1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.raezcorp.composelabs.R
import com.raezcorp.composelabs.ui.theme.BackgroundCardPresentation

@Composable
fun CardPresentation() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundCardPresentation)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(3f),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.android_logo),
                        contentDescription = "Android Logo",
                        modifier = Modifier
                            .width(100.dp)
                            .height(100.dp)
                    )
                    Text(
                        text = "Jennifer Doe",
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.White
                        )
                    )
                    Text(
                        text = "Android Developer Extraordinaire",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Green
                        )
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Divider(
                        modifier = Modifier.padding(vertical = 5.dp),
                        thickness = 0.5.dp,
                        color = Color.White
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .height(40.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Phone,
                            contentDescription = "Phone",
                            modifier = Modifier.weight(1f),
                            tint = Color.Green
                        )
                        Text(
                            text = "+11 (123) 444 555 666",
                            modifier = Modifier.weight(3f),
                            color = Color.White
                        )
                    }
                    Divider(
                        modifier = Modifier.padding(vertical = 5.dp),
                        thickness = 0.5.dp,
                        color = Color.White
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .height(40.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Share,
                            contentDescription = "Share",
                            modifier = Modifier.weight(1f),
                            tint = Color.Green
                        )
                        Text(
                            text = "@AndroidDev",
                            modifier = Modifier.weight(3f),
                            color = Color.White
                        )
                    }
                    Divider(
                        modifier = Modifier.padding(vertical = 5.dp),
                        thickness = 0.5.dp,
                        color = Color.White
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .height(40.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Email,
                            contentDescription = "Email",
                            modifier = Modifier.weight(1f),
                            tint = Color.Green
                        )
                        Text(
                            text = "jen.doe@android.com",
                            modifier = Modifier.weight(3f),
                            color = Color.White
                        )
                    }
                }
            }

        }

    }

}

@Preview(showSystemUi = true)
@Composable
fun CardPresentationPreview() {
    CardPresentation()
}
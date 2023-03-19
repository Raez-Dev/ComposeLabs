package com.raezcorp.composelabs.labs.lab1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.raezcorp.composelabs.R

@Composable
fun ComposeArticles() {
    Box() {
        Column() {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.compose_header),
                    contentDescription = "Compose Header",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu",
                    tint = Color.White,
                    modifier = Modifier.padding(top = 20.dp, start = 15.dp).size(30.dp)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(4f)
                    .padding(horizontal = 15.dp, vertical = 15.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        modifier = Modifier.padding(top = 10.dp),
                        text = "Jetpack Compose Tutorial", style = TextStyle(
                            fontSize = 22.sp
                        )
                    )
                    Text(
                        modifier = Modifier
                            .padding(top = 10.dp),
                        style = TextStyle(
                            lineHeight = 16.sp,
                            textAlign = TextAlign.Justify
                        ),
                        text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on android with less code, powerful tools, and intuitive Kotlin APIs.\n\nIn this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's instruction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
                    )
                }

            }

        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun ComposeArticlesPreview() {
    ComposeArticles()
}

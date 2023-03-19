package com.raezcorp.composelabs.labs.lab1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.raezcorp.composelabs.R

@Composable
fun TaskComplete() {

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_task_completed),
                contentDescription = "Task Complete"
            )
            Text(
                modifier = Modifier.padding(top = 10.dp),
                style = TextStyle(
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                ),
                text = "All tasks completed"
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                style = TextStyle(
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                ),
                text = "Nice work!"
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TaskCompletePreview() {
    TaskComplete()
}
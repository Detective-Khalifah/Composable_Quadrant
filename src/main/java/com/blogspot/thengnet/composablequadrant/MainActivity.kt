package com.blogspot.thengnet.composablequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.blogspot.thengnet.composablequadrant.ui.theme.ComposableQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        Column(modifier = modifier.weight(weight = 1F, fill = true)) {
            Column(
                modifier = modifier
                    .background(color = Color(0xFFEADDFF))
                    .padding(16.dp)
                    .weight(weight = 1F, fill = true),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.text_composable_title),
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(bottom = 16.dp),
                )
                Text(
                    text = stringResource(R.string.text_composable_description),
                )
            }
            Column(
                modifier = modifier
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
                    .weight(weight = 1F, fill = true),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.row_composable_title),
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(bottom = 16.dp),
                )
                Text(
                    text = stringResource(R.string.row_composable_description),
                )
            }
        }
        Column(modifier = modifier.weight(weight = 1F, fill = true)) {
            Column(
                modifier = modifier
                    .background(color = Color(0xFFD0BCFF))
                    .padding(16.dp).weight(weight = 1F, fill = true),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.image_composable_title),
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(bottom = 16.dp),
                )
                Text(
                    text = stringResource(R.string.image_composable_description),
                )
            }
            Column(
                modifier = modifier
                    .background(color = Color(0xFFF6EDFF))
                    .padding(16.dp)
                    .weight(weight = 1F, fill = true),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.column_composable_title),
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(bottom = 16.dp),
                )
                Text(
                    text = stringResource(R.string.column_composable_description),
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposableQuadrantTheme {
        Greeting()
    }
}
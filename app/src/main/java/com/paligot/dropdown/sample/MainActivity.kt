package com.paligot.dropdown.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.paligot.dropdown.sample.ui.theme.DropdownsampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DropdownsampleTheme {
                // A surface container using the 'background' color from the theme
                val expanded = remember { mutableStateOf(false) }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        Box {
                            Button(onClick = { expanded.value = true }) {
                                Text(text = "Open menu")
                            }
                            DropdownMenu(expanded = expanded.value, onDismissRequest = { expanded.value = false }) {
                                DropdownMenuItem(onClick = { expanded.value = false }) {
                                    Text(text = "Label 1")
                                }
                                DropdownMenuItem(onClick = { expanded.value = false }) {
                                    Text(text = "Label 1")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DropdownsampleTheme {
        Greeting("Android")
    }
}
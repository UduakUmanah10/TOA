package com.uduak.toa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.uduak.toa.ui.components.PrimaryButton
import com.uduak.toa.ui.components.SecondaryButton
import com.uduak.toa.ui.components.TOATEXTField
import com.uduak.toa.ui.theme.TOATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TOATheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background)
                {
                    Column{
                        Greeting("Android")
                        PrimaryButton(text= "primary Button", onClick = {})
                        SecondaryButton(text = "Secondary Button", onClick = {})
                        TOATEXTField(
                            text = "",
                            onTextChanged = {},
                            labelText = "Label")

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
    TOATheme {
        Greeting("Android")
    }
}
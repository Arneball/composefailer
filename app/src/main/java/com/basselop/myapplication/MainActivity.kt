package com.basselop.myapplication

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold { contentPadding ->
                Column(Modifier.padding(contentPadding)) {
                    ShitButton()
                    ShitButton()
                }
            }
        }
    }
}

@Composable
fun ShitButton() {
    var cnt by remember { mutableStateOf(0) }
    Button(onClick = { cnt++ }) {
        Text("Click $cnt")
    }
}

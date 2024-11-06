package com.example.ucp1_006

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Preview (showBackground = true)
@Composable
fun Ucp1_006(modifier: Modifier = Modifier){
    var namasv by remember { mutableStateOf("")}
    var noTeleponsv by remember { mutableStateOf("")}
    var memilihJksv by remember { mutableStateOf("")}

    var listJK = listOf( "Laki- laki", "perempuan")
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Yuk Lengkapi data dirimu!", fontSize = 14.dp, fontWeight = FontWeight.Bold)
        TextField(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            value = namasv, onValueChange = {namasv = it},
            label = { Text(text = namasv) },
            placeholder = { Text("Muhammad Ikhsan") }
        )
        
        TextField(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            value = noTeleponsv, onValueChange = {noTeleponsv = it},
            label = { Text(text = noTeleponsv) },
            placeholder = { Text("081345768321") }
        )
        
        Row {
            listJK.forEach {item ->
                Row {
                    RadioButton(selected = memilihJksv, onClick = { memilihJksv== item }
                    )
                }
            }
        }
        
        ElevatedButton(onClick = {
            namasv == namasv
        }) {
            Text("Simpan")
        }

    }
}
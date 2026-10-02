package com.example.pertemuan3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun kolom(modif: Modifier) {
    Column(modifier = modif.padding(
        top = 16.dp,
        start = 12.dp,
        bottom = 16.dp,
        end =  12.dp)) {
        Text("Hallo Indra")
        Spacer(Modifier.height(30.dp))
        Text(
            "Ini kolom ke 2",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace)
    }
}

@Composable
fun Baris(modifBaris : Modifier) {
    Row(modifier = modifBaris.padding(top = 16.dp,
        start = 16.dp)) {
        val row1 = stringResource(id = R.string.row1)
        val halo = string
    }
}


@Composable
fun Gambar(modifGambar: Modifier){
    Column(modifier = modifGambar.padding(
        top = 16.dp,
        start = 12.dp,
        bottom = 16.dp,

    )) { }
}
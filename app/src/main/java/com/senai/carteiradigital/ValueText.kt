package com.senai.carteiradigital

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun ValueText(
    value: String,
    fontSize: TextUnit = MaterialTheme.typography.titleLarge.fontSize,
    fontWeight: FontWeight = FontWeight.Normal,
    modifier: Modifier = Modifier
){
    Text(
        text = value,
        fontWeight = fontWeight,
        fontSize = fontSize,
        modifier = modifier
            .padding(4.dp),
        softWrap = true,
        color = MaterialTheme.colorScheme.onSurface,
    )
}

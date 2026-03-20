package com.senai.carteirinhadigitalsenai.features.carteirinha.presentation.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

@Composable
fun LabelText(
    label: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = label,
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.titleLarge,
        fontFamily = MaterialTheme.typography.titleLarge.fontFamily,
        modifier = modifier,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF1A1A1A)
    )
}
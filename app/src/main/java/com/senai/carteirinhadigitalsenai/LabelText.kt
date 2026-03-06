package com.senai.carteirinhadigitalsenai

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.senai.carteirinhadigitalsenai.ui.theme.CarteirinhaDigitalSenaiTheme

@Composable
fun LabelText(
    label: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = label,
        style = MaterialTheme.typography.titleLarge,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF1A1A1A),
        textAlign = TextAlign.Center
    )
}

@Preview()
@Composable
fun LabelTextClaroPreview() {
    CarteirinhaDigitalSenaiTheme(darkTheme = false) {
        LabelText("Nicolas Luis Moura de Almeida")
    }
}
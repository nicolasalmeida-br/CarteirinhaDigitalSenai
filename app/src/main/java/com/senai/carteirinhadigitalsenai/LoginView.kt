package com.senai.carteirinhadigitalsenai

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.senai.carteirinhadigitalsenai.ui.theme.CarteirinhaDigitalSenaiTheme

@Composable
fun LoginView(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 16.dp,
            alignment = Alignment.CenterVertically
        )
    ) {
        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text("Login")
            }
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text("Senha")
            }
        )
        Button(
            onClick = {},
            modifier = Modifier
                .size(300.dp, height = 48.dp),
            shape = RoundedCornerShape(9.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.background
        ),
        border = BorderStroke {
            width
            color = MaterialTheme.colorScheme.primary
        }
        ) {
                Text("Entrar")
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun LoginPreviewClaro() {
    CarteirinhaDigitalSenaiTheme (darkTheme = false) {
        LoginView(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun LoginPreviewEscuro() {
    CarteirinhaDigitalSenaiTheme (darkTheme = true) {
        LoginView()
    }
}
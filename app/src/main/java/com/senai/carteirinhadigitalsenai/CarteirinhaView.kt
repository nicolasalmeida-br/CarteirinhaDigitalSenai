package com.senai.carteirinhadigitalsenai

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.senai.carteirinhadigitalsenai.ui.theme.CarteirinhaDigitalSenaiTheme

@Composable
fun CarteirinhaView(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth(0.9f)
            .padding(16.dp),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp, horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Header()

            Spacer(modifier = Modifier.height(20.dp))

            Perfil()

            Spacer(modifier = Modifier.height(20.dp))

            LabelText(label = "Nicolas Luis Moura de Almeida")
            ValueText(value = "Técnico em Desenvolvimento de Sistemas")

            Spacer(modifier = Modifier.height(12.dp))

            Turma(turma = "4DEVM-A")

            QrCode(
                conteudo = "90000000001382264860",
                modifier = Modifier
                    .size(160.dp)
                    .background(Color.White)
            )

            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}
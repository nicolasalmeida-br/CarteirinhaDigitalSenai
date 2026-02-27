package com.senai.carteirinhadigitalsenai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val nomeCompleto = "Nicolas Luis Moura de Almeida"
        val curso = "Desenvolvimento de Sistemas"

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CarteirinhaDigitalSenai(
                        nomeCompleto = nomeCompleto,
                        curso = curso
                    )
                }
            }
        }
    }
}

@Composable
fun CarteirinhaDigitalSenai(
    nomeCompleto: String,
    curso: String
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4F6FA)),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .wrapContentHeight()
                .clip(RoundedCornerShape(20.dp))
                .background(Color.White)
                .padding(horizontal = 20.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // 1️) Logo
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .height(50.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            // 2️) Foto de perfil
            Image(
                painter = painterResource(id = R.drawable.perfil),
                contentDescription = "Foto do aluno",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(18.dp))

            // 3️) Nome completo
            Text(
                text = nomeCompleto,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0B1B3A),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(8.dp))

            // 4️) Curso
            Text(
                text = curso,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF5B677A),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            // 5) QR Code
            QrCode(
                conteudo = "90000000001382264860"
            )
        }
    }
}
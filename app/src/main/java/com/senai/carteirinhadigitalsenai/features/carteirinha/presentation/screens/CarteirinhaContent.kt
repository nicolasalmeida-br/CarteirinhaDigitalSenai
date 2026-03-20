package com.senai.carteirinhadigitalsenai.features.carteirinha.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.senai.carteirinhadigitalsenai.R
import com.senai.carteirinhadigitalsenai.features.carteirinha.presentation.components.InfoAluno
import com.senai.carteirinhadigitalsenai.core.designsystem.themes.CarteirinhaDigitalSenaiTheme
import com.senai.carteirinhadigitalsenai.features.carteirinha.presentation.components.QrCode

@Composable
fun CarteirinhaContent(
    nomeAluno: String,
    curso: String,
    turma: String,
    qrCodeContent: String,
    modifier: Modifier = Modifier,
    onVoltar: () -> Unit = {}
) {
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.25f))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .padding(24.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(
                color = Color.White,
                shape = RoundedCornerShape(16.dp),
                tonalElevation = 6.dp,
                shadowElevation = 6.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = onVoltar) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Voltar",
                            tint = Color.Black
                        )
                    }

                    Text(
                        text = "Carteirinha",
                        style = MaterialTheme.typography.titleMedium,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 24.dp, horizontal = 16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = "Logo SENAI",
                            modifier = Modifier
                                .height(50.dp)
                                .padding(bottom = 16.dp),
                            contentScale = ContentScale.Fit
                        )

                        HorizontalDivider(
                            thickness = 1.dp,
                            color = Color(0xFFEEEEEE),
                            modifier = Modifier.fillMaxWidth()
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        Box(
                            modifier = Modifier
                                .size(130.dp)
                                .border(4.dp, Color.Black, CircleShape)
                                .padding(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.perfil),
                                contentDescription = "Foto de perfil",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(CircleShape),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        InfoAluno(
                            labelText = "Nome",
                            valueText = nomeAluno,
                            mostrarLabel = false,
                            centralizado = true,
                            fontWeight = FontWeight.Bold,
                            fontSize = MaterialTheme.typography.titleLarge.fontSize,
                            modifier = Modifier.fillMaxWidth()
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        InfoAluno(
                            labelText = "Curso",
                            valueText = curso,
                            mostrarLabel = false,
                            centralizado = true,
                            fontWeight = FontWeight.Normal,
                            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
                            modifier = Modifier.fillMaxWidth()
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        InfoAluno(
                            labelText = "Turma",
                            valueText = "Turma: $turma",
                            mostrarLabel = false,
                            centralizado = true,
                            fontWeight = FontWeight.Normal,
                            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
                            modifier = Modifier.fillMaxWidth()
                        )

                        Spacer(modifier = Modifier.height(24.dp))

                        Surface(
                            color = Color.White,
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            QrCode(
                                conteudo = qrCodeContent,
                                modifier = Modifier
                                    .size(160.dp)
                                    .background(Color.White)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewCarteirinhaClaro() {
    CarteirinhaDigitalSenaiTheme(darkTheme = false) {
        CarteirinhaContent(
            nomeAluno = "Nicolas Luis Moura de Almeida",
            curso = "Técnico em Desenvolvimento de Sistemas",
            turma = "4DEVM-A",
            qrCodeContent = "90000000001382264860",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            onVoltar = {}
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewCarteirinhaEscuro() {
    CarteirinhaDigitalSenaiTheme(darkTheme = true) {
        CarteirinhaContent(
            nomeAluno = "Nicolas Luis Moura de Almeida",
            curso = "Técnico em Desenvolvimento de Sistemas",
            turma = "4DEVM-A",
            qrCodeContent = "90000000001382264860",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            onVoltar = {}
        )
    }
}
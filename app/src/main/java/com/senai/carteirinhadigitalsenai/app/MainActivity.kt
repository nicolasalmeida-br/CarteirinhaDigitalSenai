package com.senai.carteirinhadigitalsenai.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.senai.carteirinhadigitalsenai.features.carteirinha.presentation.CarteirinhaView
import com.senai.carteirinhadigitalsenai.R
import com.senai.carteirinhadigitalsenai.core.designsystem.theme.CarteirinhaDigitalSenaiTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteirinhaDigitalSenaiTheme {
                Carteirinha()
            }
        }
    }
}

@Composable
fun Carteirinha() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CarteirinhaView()
        }
    }
}


@Composable
fun Header() {
    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Logo SENAI",
        modifier = Modifier
            .height(50.dp)
            .padding(bottom = 16.dp),
        contentScale = ContentScale.Fit
    )
    HorizontalDivider(thickness = 1.dp, color = Color(0xFFEEEEEE))
}

@Composable
fun Perfil() {
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
}

@Composable
fun Turma(turma: String) {
    Surface(
        color = Color(0xFFF5F5F5),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(bottom = 24.dp)
    ) {
        Text(
            text = "Turma: $turma",
            style = MaterialTheme.typography.labelLarge,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
            color = Color(0xFF333333)
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CarteirinhaPreviewClaro() {
    CarteirinhaDigitalSenaiTheme (darkTheme = false) {
        Carteirinha()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CarteirinhaPreviewEscuro() {
    CarteirinhaDigitalSenaiTheme (darkTheme = true) {
        Carteirinha()
    }
}
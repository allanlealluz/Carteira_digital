package com.senai.carteiradigital

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rafaelcosta.myapplication.QrCode
import com.senai.carteiradigital.ui.theme.CarteirinhaDigitalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteirinhaDigitalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CarteirinhaDigitalApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }

    @Composable
    fun CarteirinhaDigitalApp(modifier: Modifier = Modifier) {
        Box(modifier = modifier.fillMaxSize()) {
            
            Image(
                painter = painterResource(id = R.drawable.senai),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize(),
                alpha = 0.10f
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {

                Image(
                    painter = painterResource(id = R.drawable.logosenai),
                    contentDescription = "Logo Senai",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .weight(0.25f)
                        .fillMaxWidth()
                )

                Image(
                    painter = painterResource(id = R.drawable.chico),
                    contentDescription = "Foto de Perfil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .weight(.25f)
                        .size(200.dp)
                        .clip(CircleShape)
                        .aspectRatio(1f)
                )

                // Informações do Aluno com tipografia maior e mais visível
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "Nome: Allan",
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Curso: ADS",
                        style = MaterialTheme.typography.titleLarge,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Turma: 4° DEVSM",
                        style = MaterialTheme.typography.titleMedium,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Matrícula: 2026",
                        style = MaterialTheme.typography.titleMedium,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Data de Nascimento: 21/09/2005",
                        style = MaterialTheme.typography.titleMedium,
                        textAlign = TextAlign.Center
                    )
                }

                Box(modifier = Modifier.weight(0.2f), contentAlignment = Alignment.Center) {
                    QrCode("90000000001382838830")
                }
            }
        }
    }
}

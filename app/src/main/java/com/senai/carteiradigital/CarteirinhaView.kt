package com.senai.carteiradigital

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
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rafaelcosta.myapplication.QrCode

@Composable
fun CarteirinhaView(
    modifier: Modifier = Modifier,
    onNavigateToLogin: () -> Unit
) {
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

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                ValueText(
                    value = "Nome: Allan",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                ValueText(
                    value = "Curso: ADS",
                    fontSize = 20.sp
                )
                ValueText(
                    value = "Turma: 4° DEVSM",
                    fontSize = 18.sp
                )
                ValueText(
                    value = "Matrícula: 2026",
                    fontSize = 18.sp
                )
                ValueText(
                    value = "Nasc: 21/09/2005",
                    fontSize = 18.sp
                )
                
                Button(
                    onClick = { onNavigateToLogin() },
                    modifier = Modifier.padding(top = 16.dp)
                ) { 
                    Text("Sair")
                }
            }

            Box(modifier = Modifier.weight(0.2f), contentAlignment = Alignment.Center) {
                QrCode("90000000001382838830")
            }
        }
    }
}

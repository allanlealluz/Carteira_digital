package com.senai.carteiradigital

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.senai.carteiradigital.core.theme.CarteirinhaDigitalTheme

@Composable
fun Login2View(
    modifier: Modifier = Modifier
) {
    var cpf by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logosenai),
            contentDescription = "Logo Senai",
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp),
            contentScale = ContentScale.Fit
        )

        Text(
            text = "Login",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 24.dp),
            color = MaterialTheme.colorScheme.primary
        )

        OutlinedTextField(
            value = cpf,
            onValueChange = { cpf = it },
            label = { Text("CPF") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = senha,
            onValueChange = { senha = it },
            label = { Text("Senha") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp),
            singleLine = true
        )

        Button(
            onClick = { /* Lógica de login */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Entrar", fontSize = 18.sp)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewLoginClaro() {
    CarteirinhaDigitalTheme {
        Login2View(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewLoginEscuro() {
    CarteirinhaDigitalTheme(darkTheme = true) {
        Login2View(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        )
    }
}

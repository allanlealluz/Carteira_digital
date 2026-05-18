package com.rafaelcosta.carteirinhadigital_4devm_t1.feature.unidadecurricular2.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rafaelcosta.carteirinhadigital_4devm_t1.core.designsystem.theme.CarteirinhaDigital_4DEVM_T1Theme
import com.rafaelcosta.carteirinhadigital_4devm_t1.feature.unidadecurricular2.presentation.model.UnidadeCurricular

@Composable
fun UnidadeCurricularCard (
    modifier: Modifier = Modifier,
    unidadeCurricular : UnidadeCurricular
){
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape( 16.dp),
        colors = CardDefaults.
            cardColors(containerColor = MaterialTheme.colorScheme.surface),
            elevation = CardDefaults.cardElevation(4.dp)
    ) { }
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
        Text(text = unidadeCurricular.nome,
            style = MaterialTheme.typography.titleLarge)
        Text(text = "Professor: ${unidadeCurricular.professor}")
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Absolute.SpaceBetween
        ){
            Text(text = "N1: ${unidadeCurricular.nota1}")
            Text(text = "N2: ${unidadeCurricular.nota2}")
            Text(text = "Média: ${unidadeCurricular.media}")

        }
        Text(text = "Faltas: ${unidadeCurricular.faltas}")
    }
}
@Composable
@Preview(
    showBackground = true
)
fun UnidadeCurricularCardPreview(){
    CarteirinhaDigital_4DEVM_T1Theme(){
        UnidadeCurricularCard(
        unidadeCurricular = UnidadeCurricular(
            id = "1",
            nome = "Programação mobile",
            professor = "Rafael Costa",
            nota1 = 10.0,
            nota2 = 9.0,
            media = 9.5,
            faltas = 2
        )
        )
    }

}
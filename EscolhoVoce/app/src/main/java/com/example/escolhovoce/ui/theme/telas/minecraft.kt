package com.example.escolhovoce.ui.theme.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.escolhovoce.R
import com.example.escolhovoce.ui.theme.fontejersey
import com.example.escolhovoce.ui.theme.fontejoan
import com.example.escolhovoce.ui.theme.letras

@Composable
fun Minecraft(navController: NavHostController) {
    Box(
        Modifier.fillMaxSize(),
    ) {
        //fundo
        Image(
            painter = painterResource(R.drawable.fundo_minecraft),
            contentDescription = "fundo roxo do jogo minecraft, resposta da pergunta 2 do quiz",
            contentScale = ContentScale.Crop, //para a imagem pegar a tela inteira
            modifier = Modifier
                .fillMaxSize()
        )

        //foto da figura atras do minecraft
        Image(
            painter = painterResource(R.drawable.rectangle_116),
            contentDescription = "fundo retangular atras da foto do jogo minecraft",
            modifier = Modifier
                .width(700.dp)
                .height(500.dp)
                .offset(y = 30.dp)
        )

        //foto do minecraft
        Image(
            painter = painterResource(R.drawable.foto_minecraft),
            contentDescription = "imagem do jogo minecraft",
            modifier = Modifier
                .width(266.dp)
                .height(376.dp)
                .offset(x = 73.dp, y = 93.dp)
        )

        Text(
            //titulo
            text = "MINECRAFT",
            fontSize = 45.sp,
            textAlign = TextAlign.Center,
            fontFamily = fontejoan,
            color = letras, //cor branca
            style = TextStyle(
                lineHeight = 32.sp,
                shadow = Shadow(
                    // cor da Sombra (Preto, 70% de opacidade)
                    color = Color.Black.copy(alpha = 0.7f),
                    offset = Offset(x = 4f, y = 4f),
                    // para suavizar a sombra
                    blurRadius = 8f
                )
            ),
            modifier = Modifier
                .offset(y = 530.dp)
                .width(271.dp)
                .height(110.dp)
                .align(Alignment.TopCenter)

        )

        Text(
            //descrição
            text = "Minecraft, um jogo onde você explora mundos de blocos, coleta recursos e constrói livremente enquanto enfrenta criaturas e sobreviver.",
            textAlign = TextAlign.Center,
            color = letras,
            fontFamily = fontejersey,
            fontSize = 25.sp,
            style = TextStyle(
                lineHeight = 30.sp,
                shadow = Shadow(
                    // cor da Sombra (Preto, 70% de opacidade)
                    color = Color.Black.copy(alpha = 0.7f),
                    offset = Offset(x = 4f, y = 4f),
                    blurRadius = 8f  // para suavizar a sombra
                )
            ),
            modifier = Modifier
                .offset(y = 120.dp)
                .width(368.dp)
                .height(400.dp)
                .align(Alignment.BottomCenter)


        )

    }
}
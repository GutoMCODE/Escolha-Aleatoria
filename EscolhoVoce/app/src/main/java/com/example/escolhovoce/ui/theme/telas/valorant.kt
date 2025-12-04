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
import com.example.escolhovoce.ui.theme.CorValorant
import com.example.escolhovoce.ui.theme.fontejersey
import com.example.escolhovoce.ui.theme.fontejoan
import com.example.escolhovoce.ui.theme.letras

@Composable
fun Valorant(navController: NavHostController) {
    Box(
        Modifier.fillMaxSize()
    ) {
        //fundo
        Image(
            painter = painterResource(R.drawable.fundo_valorant),
            contentDescription = "fundo ciano para o jogo valorant",
            contentScale = ContentScale.Crop, //para a imagem tirar as bordas
            modifier = Modifier
                .fillMaxSize() //deixar a tela completa
        )

        //moldura
        Image(
            painter = painterResource(R.drawable.polygon_1),
            contentDescription = "um triangulo de ponta cabeça para ir atras da foto do jogo valorant",
            modifier = Modifier
                .width(400.dp)
                .height(425.dp)
                .offset(x = 6.dp, y = 140.dp)
        )

        //imagem do jogo
        Image(
            painter = painterResource(R.drawable.foto_valorant),
            contentDescription = "imagem do jogo chamado valorant, resposta da pergunta 4 do quiz",
            modifier = Modifier
                .width(245.dp)
                .height(368.dp)
                .offset(83.dp, 80.dp)
        )
        Text(
            //titulo
            text = "VALORANT",
            fontSize = 45.sp,
            textAlign = TextAlign.Center,
            fontFamily = fontejoan,
            color = CorValorant, //cor branca
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
                .offset(y = 533.dp)
                .width(271.dp)
                .height(110.dp)
                .align(Alignment.TopCenter)

        )

        Text(
            //descrição
            text = "Valorant, um jogo onde equipes de agentes com habilidades únicas se enfrentam em partidas táticas de tiro, focadas em estratégia e precisão.",
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
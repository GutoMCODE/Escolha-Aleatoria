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
import com.example.escolhovoce.ui.theme.CorClash
import com.example.escolhovoce.ui.theme.CorValorant
import com.example.escolhovoce.ui.theme.fontejersey
import com.example.escolhovoce.ui.theme.fontejoan
import com.example.escolhovoce.ui.theme.letras

@Composable
fun ClashRoyale(navController: NavHostController) {
    Box(
        Modifier.fillMaxSize()
    ) {
        //fundo
        Image(
            painter = painterResource(R.drawable.fundo_clash),
            contentDescription = "fundo do jogo clash royale na cor azul",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )

        //jogo
        Image(
            painter = painterResource(R.drawable.foto_clash),
            contentDescription = "imagem do jogo chamado clash royale, resposta da pergunta 5 do quiz",
            modifier = Modifier
                .width(253.dp)
                .height(369.dp)
                .offset(x = 79.dp, y = 90.dp)
        )
        Text(
            //titulo
            text = "CLASH ROYALE",
            fontSize = 45.sp,
            textAlign = TextAlign.Center,
            fontFamily = fontejoan,
            color = CorClash, //cor branca
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
                .offset(y = 500.dp)
                .width(400.dp)
                .height(110.dp)
                .align(Alignment.TopCenter)

        )

        Text(
            //descrição
            text = "Clash Royale, um jogo onde você usa cartas para invocar tropas e feitiços em batalhas em tempo real, tentando destruir as torres do oponente.",
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
                .offset(y = 100.dp)
                .width(368.dp)
                .height(400.dp)
                .align(Alignment.BottomCenter)


        )
    }
}
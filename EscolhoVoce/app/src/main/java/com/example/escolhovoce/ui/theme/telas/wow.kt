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
import com.example.escolhovoce.ui.theme.CorWow
import com.example.escolhovoce.ui.theme.fontejersey
import com.example.escolhovoce.ui.theme.fontejoan
import com.example.escolhovoce.ui.theme.letras

@Composable
fun Wow(navController: NavHostController) {
    Box(
        Modifier.fillMaxSize(),
    ) {
        Image(
            painter = painterResource(id = R.drawable.fundo),
            contentDescription = "Fundo azul da escolha da pergunta 1 que leva ao jogo wow",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()

        )
        //fundo da imagem do wow
        Image(
            painter = painterResource(R.drawable.ellipse_5),
            contentDescription = "fundo da foto do jogo wow na cor azul bebe",
            modifier = Modifier
                .width(347.dp)
                .height(437.dp)
                .offset(x = 33.dp, y = 55.dp)
        )

        //imagem wow
        Image(
            painter = painterResource(R.drawable.foto),
            contentDescription = "imagem do jogo chamado world of warcraft",
            modifier = Modifier
                .width(279.dp)
                .height(370.dp)
                .offset(x = 67.dp, y = 89.dp)
        )

        Text(
            //titulo, deixo sem as borda?
            text = "World of Warcraft",
            fontSize = 33.sp,
            textAlign = TextAlign.Center,
            fontFamily = fontejoan,
            color = CorWow,
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
            text = "World of Warcraft, um jogo onde você cria personagens de diversas raças e classes para explorar Azeroth, cumprir missões e participar de batalhas PvE e PvP em um MMORPG massivo.",
            textAlign = TextAlign.Center,
            color = letras,
            fontFamily = fontejersey,
            fontSize = 28.sp,
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
                .offset(y = 110.dp)
                .width(368.dp)
                .height(400.dp)
                .align(Alignment.BottomCenter)


        )
    }
}
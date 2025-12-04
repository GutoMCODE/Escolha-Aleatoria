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
import com.example.escolhovoce.ui.theme.CorSpore
import com.example.escolhovoce.ui.theme.fontejersey
import com.example.escolhovoce.ui.theme.fontejoan
import com.example.escolhovoce.ui.theme.letras

@Composable
fun Spore(navController: NavHostController) {
    Box(
        Modifier.fillMaxSize(),
    ) {
        //fundo
        Image(
            painter = painterResource(R.drawable.fundo_spore),
            contentDescription = "fundo numa cor branca para o jogo spore da resposta da pergunta 3",
            contentScale = ContentScale.Crop, //para a imagem pegar a tela inteira
            modifier = Modifier
                .fillMaxSize()
        )

        //moldura
        Image(
            painter = painterResource(R.drawable.rectangle_117),
            contentDescription = "moldura traçado para o fundo da foto do jogo spore",
            modifier = Modifier
                .width(306.dp)
                .height(411.dp)
                .offset(x = 53.dp, y = 75.dp)
        )

        //foto do jogo
        Image(
            painter = painterResource(R.drawable.foto_spore),
            contentDescription = "foto do jogo chamado spore, resposta para a pergunta 3 do quiz",
            modifier = Modifier
                .width(267.dp)
                .height(380.dp)
                .offset(x = 73.dp, y = 91.dp)
        )

        Text(
            //titulo
            text = "SPORE",
            fontSize = 45.sp,
            textAlign = TextAlign.Center,
            fontFamily = fontejoan,
            color = CorSpore, //cor branca
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
            text = "Spore, um jogo onde você evolui uma criatura desde a fase celular até civilizações espaciais, moldando sua espécie e seu mundo.",
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
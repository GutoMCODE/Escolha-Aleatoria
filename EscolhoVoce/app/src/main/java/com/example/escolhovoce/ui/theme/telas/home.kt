package com.example.escolhovoce.ui.theme.telas

import com.example.escolhovoce.R
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.escolhovoce.ui.theme.Corbotao
import com.example.escolhovoce.ui.theme.fontejoan
import com.example.escolhovoce.ui.theme.letras


@Composable
fun Home(navController: NavHostController) {
    Box(
        Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.home_gradiente),
            contentDescription = "Tela home com gradiente com as cores amarelo e laranja",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()

        )
        Text (
            text = "Qual jogo você deveria jogar?",
            fontSize = 33.sp,
            fontFamily = fontejoan,
            color = letras,
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
                .offset(y = 110.dp, x = 100.dp)
                .width(271.dp)
                .height(110.dp)

        )
        Text(
            text = "Com apenas uma pergunta, vamos descobrir que tipo de jogo combina com você?",
            textAlign = TextAlign.Left,
            color = letras,
            fontFamily = fontejoan,
            fontSize = 37.sp,
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
                .offset(x = 9.dp, y = 290.dp)
                .width(310.dp)
                .height(390.dp)



        )
        Column(
            horizontalAlignment = AbsoluteAlignment.Left
        ) {
            BotaoSim(onClick = {
                navController.navigate("quiz")
            }
            )
        }

        //linha em baixo
        Image(
            painter = painterResource(R.drawable.vector_3),
            contentDescription = "linha ondulada no sentido direito em subida",
            modifier = Modifier
                .fillMaxSize()
                .offset(y = 350.dp)

        )
    }

}

//botão
@Composable
fun BotaoSim(onClick: () -> Unit){
    ElevatedButton(
        onClick = onClick,
        colors = ButtonDefaults.elevatedButtonColors(
            containerColor = Corbotao
        ),
        modifier = Modifier
            .offset(x = 210.dp, y = 602.dp)
            .width(138.dp)
            .height(53.dp)
            .shadow(7.dp, RoundedCornerShape(30.dp))
    ) {
        Text(
            text = "Sim!",
            fontFamily = fontejoan,
            fontSize = 30.sp,
            color = letras,
            modifier = Modifier


        )
    }

}
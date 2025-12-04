package com.example.escolhovoce.ui.theme.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.example.escolhovoce.ui.theme.CorCads
import com.example.escolhovoce.ui.theme.fontejoan
import com.example.escolhovoce.ui.theme.letras


//cards das perguntas
@Composable
fun PerguntasQuiz(questionText: String,
                  onCardClick: () -> Unit) {
        val card = RoundedCornerShape(30.dp)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            //aq é pra area do click ser do tamanho do card, será q arrumo melhor ou deixo uma sombra? tenho q perguntar pro gu
            .clip(card)
            .clickable(onClick = onCardClick)
            .padding(vertical = 8.dp),


        shape = RoundedCornerShape(30.dp),
        colors = CardDefaults.cardColors(
            containerColor = CorCads
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp, horizontal = 20.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = questionText,
                color = letras,
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                fontFamily = fontejoan,
                lineHeight = 22.sp,
            )
        }
    }
}

@Composable
fun Quiz(navController: NavHostController) {
    val perguntas = listOf(
        "1 - Um jogo mundo aberto com magias e sempre novos lugares para descobrir?",
        "2 - Um jogo em que você queira explorar sua criatividade ao máximo?",
        "3 - Um jogo em que você esteja em constante evolução e aprendizado?",
        "4 - Um jogo em que você queira elaborar estratégias para surpreender seu adversário.",
        "5 - Um jogo onde você tem uma simulação de guerra com poderes"
    )

    // Lista de rotas (destinos) correspondente às perguntas e tem q ser igual as que estão no main activity navigate
    val rotasDestino = listOf(
        "quiz_1_wow",
        "quiz_2_minecraft",
        "quiz_3_spore",
        "quiz_4_valorant",
        "quiz_5_clashroyale",
    )

    Box(
        Modifier.fillMaxSize(),
    ) {
        Image(
            painter = painterResource(id = R.drawable.home_gradiente),
            contentDescription = "Tela home com gradiente com as cores amarelo e laranja",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()

        )
        Text(
            text = "Escolha uma das 5 opções do quiz.",
            fontSize = 33.sp,
            textAlign = TextAlign.Center,
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
                .offset(y = 110.dp, x = 70.dp)
                .width(271.dp)
                .height(110.dp)

        )
        //linha no fim da tela
        Image(
            painter = painterResource(R.drawable.vector_3),
            contentDescription = "linha ondulada no sentido direito em subida",
            modifier = Modifier
                .fillMaxSize()
                .offset(y = 350.dp)

        )

        // aq vao as perguntas sem que eu precise replicar os cards 5 vezes
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 200.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            itemsIndexed(perguntas) { index, question ->
                PerguntasQuiz(
                    questionText = question,
                    onCardClick = {
                        // Obtém a rota correspondente ao índice da pergunta
                        val destino = rotasDestino[index]

                        // Executa a navegação
                        navController.navigate(destino)
                    }
                )
            }
        }
    }
}

//o codigo ele funciona por ordem de organização tipo o perguntas quiz do lazy column não estava funcionando pois estava acima da função onde tinha os card e o quiz, recoloquei a ordem e deu certo <3





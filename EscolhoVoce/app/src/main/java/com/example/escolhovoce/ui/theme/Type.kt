package com.example.escolhovoce.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.escolhovoce.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

    //fonte principal
     val fontejoan = FontFamily (
         Font(R.font.joan, FontWeight.Normal)
     )

        //n tinha a font jersey ent coloquei uma semelhante
    val fontejersey = FontFamily (
            Font(R.font.chakra_petch_medium)
    )
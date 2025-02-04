package com.guerrae.echo.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.guerrae.echo.R

val OpenSauceSans = FontFamily(
    Font(R.font.opensaucesansregular),
    Font(R.font.opensaucesansbold, weight = FontWeight.Bold),
    Font(R.font.opensaucesansitalic, style = FontStyle.Italic),

    Font(R.font.opensaucesansblack, weight = FontWeight.Black),
    Font(R.font.opensaucesanslight, weight = FontWeight.Light),
    Font(R.font.opensaucesansextrabold, weight = FontWeight.ExtraBold),
    Font(R.font.opensaucesansmedium, weight = FontWeight.Medium),
    Font(R.font.opensaucesanssemibold, weight = FontWeight.SemiBold),


    Font(R.font.opensaucesanslightitalic, style = FontStyle.Italic, weight = FontWeight.Light),
    Font(R.font.opensaucesansbolditalic, style = FontStyle.Italic, weight = FontWeight.Bold),
    Font(R.font.opensaucesansextrabolditalic, style = FontStyle.Italic, weight = FontWeight.ExtraBold),
    Font(R.font.opensaucesansmediumitalic, style = FontStyle.Italic, weight = FontWeight.Medium),
    Font(R.font.opensaucesanssemibolditalic, style = FontStyle.Italic, weight = FontWeight.Medium)
)
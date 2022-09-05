package com.uduak.toa.ui.theme

import android.annotation.SuppressLint
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

private val primaryBlue = Color(color = 0xFF0A3751)

@SuppressLint("InvalidColorHexValue")
private val SecondaryOrange = Color(color = 0xFFFC38138)

@SuppressLint("InvalidColorHexValue")
private val BackgroundBlue = Color(0xFFF4F4F8)


private val onBackGroundBlack = Color(0xFF282828)

val lightColorPallet = lightColors(
    primary = primaryBlue,
    onPrimary= Color.White,
    secondary = SecondaryOrange,
    onSecondary = Color.White,
    background = BackgroundBlue,
    onBackground = onBackGroundBlack,
    surface = Color.White,
    onSurface = primaryBlue
)

package com.uduak.toa.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.uduak.toa.R

// Set of Material typography styles to start with
private val   UrbanistExtrabold = FontFamily(Font(R.font.urbanist_extrabold))
private val   Urbanistbold = FontFamily(Font(R.font.urbanist_bold))
private val   UrbanistMedium = FontFamily(Font(R.font.urbanist_medium))
private val   UrbanistLight= FontFamily(Font(R.font.urbanist_light))
private val   UrbanistSemibold= FontFamily(Font(R.font.urbanist_semibold))



val typography =Typography(
    h1 = TextStyle(
        fontFamily = UrbanistExtrabold,
        fontSize = 40.sp,
    ),
    h2 = TextStyle(
        fontFamily = UrbanistExtrabold,
        fontSize = 36.sp,
    ),
    h3 = TextStyle(
        fontFamily = UrbanistSemibold,
        fontSize = 13.sp,
    ),
    subtitle1 = TextStyle(
        fontFamily= UrbanistMedium,
        fontSize = 15.sp,
    ),
    body1 = TextStyle(
        fontFamily = UrbanistLight,
        fontSize = 13.sp,
    ),
    button = TextStyle(
        fontFamily= Urbanistbold,
        fontSize= 13.sp,
    )

)
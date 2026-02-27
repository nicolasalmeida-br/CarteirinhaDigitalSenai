package com.senai.carteirinhadigitalsenai.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font
import com.senai.carteirinhadigitalsenai.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val abhayaFontFamily = FontFamily(
    Font(
        googleFont = GoogleFont("Abhaya Libre"),
        fontProvider = provider,
        weight = FontWeight.Normal
    ),
    Font(
        googleFont = GoogleFont("Abhaya Libre"),
        fontProvider = provider,
        weight = FontWeight.Bold
    )
)

val baseline = Typography()

val AppTypography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = abhayaFontFamily),
    displayMedium = baseline.displayMedium.copy(fontFamily = abhayaFontFamily),
    displaySmall = baseline.displaySmall.copy(fontFamily = abhayaFontFamily),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = abhayaFontFamily),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = abhayaFontFamily),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = abhayaFontFamily),
    titleLarge = baseline.titleLarge.copy(fontFamily = abhayaFontFamily),
    titleMedium = baseline.titleMedium.copy(fontFamily = abhayaFontFamily),
    titleSmall = baseline.titleSmall.copy(fontFamily = abhayaFontFamily),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = abhayaFontFamily),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = abhayaFontFamily),
    bodySmall = baseline.bodySmall.copy(fontFamily = abhayaFontFamily),
    labelLarge = baseline.labelLarge.copy(fontFamily = abhayaFontFamily),
    labelMedium = baseline.labelMedium.copy(fontFamily = abhayaFontFamily),
    labelSmall = baseline.labelSmall.copy(fontFamily = abhayaFontFamily),
)
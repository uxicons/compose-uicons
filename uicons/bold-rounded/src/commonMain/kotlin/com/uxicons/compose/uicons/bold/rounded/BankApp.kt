package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BankApp: ImageVector? = null

val Icons.Br.BankApp: ImageVector
    get() = _BankApp ?: UXIcon(name = "BankApp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 18f)
            lineTo(3f, 18f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(6f)
            curveToRelative(2.59f, 0f, 4.75f, -1.97f, 5f, -4.5f)
            curveToRelative(0.02f, -0.16f, 0f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(9f, 22f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            close()
            moveTo(24f, 7.56f)
            horizontalLineToRelative(0f)
            curveToRelative(0f, -0.53f, -0.29f, -1.01f, -0.75f, -1.26f)
            lineToRelative(-4.82f, -2.63f)
            curveToRelative(-0.58f, -0.32f, -1.28f, -0.32f, -1.86f, 0f)
            lineToRelative(-4.82f, 2.63f)
            curveToRelative(-0.46f, 0.25f, -0.75f, 0.74f, -0.75f, 1.26f)
            curveToRelative(0f, 0.64f, 0.42f, 1.18f, 1f, 1.36f)
            verticalLineToRelative(4.17f)
            curveToRelative(-0.58f, 0.21f, -1f, 0.76f, -1f, 1.41f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(10f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.65f, -0.42f, -1.2f, -1f, -1.41f)
            verticalLineToRelative(-4.17f)
            curveToRelative(0.58f, -0.19f, 1f, -0.72f, 1f, -1.36f)
            close()
            moveTo(16f, 13f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(4f)
            close()
            moveTo(20f, 13f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(4f)
            close()
        }
    }.also { _BankApp = it }

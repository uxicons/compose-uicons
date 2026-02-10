package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DigitalWallet: ImageVector? = null

val Icons.Br.DigitalWallet: ImageVector
    get() = _DigitalWallet ?: UXIcon(name = "DigitalWallet") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 15f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(20f, 5f)
            lineTo(4f, 5f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            horizontalLineToRelative(0f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            lineTo(22.5f, 3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(4f, 0f)
            curveTo(1.89f, 0f, 0.01f, 1.67f, -0.01f, 3.6f)
            verticalLineToRelative(3.9f)
            curveToRelative(0f, 0.79f, 0.56f, 1.52f, 1.35f, 1.59f)
            curveToRelative(0.81f, 0.08f, 1.5f, -0.49f, 1.63f, -1.25f)
            curveToRelative(0.33f, 0.09f, 0.68f, 0.15f, 1.04f, 0.15f)
            lineTo(20f, 8.0f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            lineTo(24f, 9f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveTo(1.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(1.5f, 16f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
            close()
            moveTo(1.5f, 11f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -6.34f, -5.16f, -11.5f, -11.5f, -11.5f)
            close()
        }
    }.also { _DigitalWallet = it }

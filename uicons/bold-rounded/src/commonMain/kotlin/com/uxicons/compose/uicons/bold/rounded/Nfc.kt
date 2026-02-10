package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Nfc: ImageVector? = null

val Icons.Br.Nfc: ImageVector
    get() = _Nfc ?: UXIcon(name = "Nfc") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(19f, 8f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(7.5f, 19f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(5f, 6.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.61f, 0f, 1.15f, 0.37f, 1.39f, 0.93f)
            reflectiveCurveToRelative(0.1f, 1.21f, -0.33f, 1.63f)
            lineToRelative(-2.06f, 2.06f)
            verticalLineToRelative(6.38f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(-7.88f)
            lineToRelative(-2.85f, 2.85f)
            curveToRelative(-0.09f, 0.09f, -0.15f, 0.22f, -0.15f, 0.35f)
            verticalLineToRelative(1.17f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.17f)
            curveToRelative(0f, -0.94f, 0.36f, -1.81f, 1.03f, -2.48f)
            lineToRelative(3.06f, -3.06f)
            curveToRelative(0.51f, -0.51f, 1.19f, -0.79f, 1.91f, -0.79f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            close()
        }
    }.also { _Nfc = it }

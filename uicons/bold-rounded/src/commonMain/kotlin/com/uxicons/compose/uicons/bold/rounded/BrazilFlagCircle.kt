package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrazilFlagCircle: ImageVector? = null

val Icons.Br.BrazilFlagCircle: ImageVector
    get() = _BrazilFlagCircle ?: UXIcon(name = "BrazilFlagCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.85f, 10.74f)
            lineToRelative(-5.7f, -4.36f)
            curveToRelative(-0.68f, -0.52f, -1.62f, -0.52f, -2.3f, 0f)
            lineToRelative(-5.7f, 4.36f)
            curveToRelative(-0.83f, 0.64f, -0.83f, 1.89f, 0f, 2.52f)
            lineToRelative(5.7f, 4.36f)
            curveToRelative(0.68f, 0.52f, 1.62f, 0.52f, 2.3f, 0f)
            lineToRelative(5.7f, -4.36f)
            curveToRelative(0.83f, -0.64f, 0.83f, -1.89f, 0f, -2.52f)
            close()
            moveTo(12f, 8.5f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            curveToRelative(0f, 0.05f, -0.01f, 0.09f, -0.01f, 0.14f)
            curveToRelative(-2.2f, -1.83f, -4.67f, -2.39f, -6.0f, -2.56f)
            curveToRelative(0.64f, -0.66f, 1.53f, -1.08f, 2.52f, -1.08f)
            close()
            moveTo(12f, 15.5f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            curveToRelative(0f, -0.17f, 0.03f, -0.33f, 0.05f, -0.5f)
            curveToRelative(0.45f, 0.02f, 3.71f, 0.23f, 6.19f, 2.65f)
            curveToRelative(-0.64f, 0.81f, -1.62f, 1.34f, -2.74f, 1.34f)
            close()
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
        }
    }.also { _BrazilFlagCircle = it }

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrazilFlagCircle: ImageVector? = null

val Icons.Ss.BrazilFlagCircle: ImageVector
    get() = _BrazilFlagCircle ?: UXIcon(name = "BrazilFlagCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5.99f)
                lineToRelative(-7.85f, 6.01f)
                lineToRelative(7.85f, 6.01f)
                lineToRelative(7.85f, -6.01f)
                lineToRelative(-7.85f, -6.01f)
                close()
                moveTo(12f, 15.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -0.17f, 0.03f, -0.33f, 0.05f, -0.5f)
                curveToRelative(0.45f, 0.02f, 3.71f, 0.23f, 6.19f, 2.65f)
                curveToRelative(-0.64f, 0.81f, -1.62f, 1.34f, -2.74f, 1.34f)
                close()
                moveTo(9.48f, 9.58f)
                curveToRelative(0.64f, -0.66f, 1.53f, -1.08f, 2.52f, -1.08f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 0.05f, -0.01f, 0.09f, -0.01f, 0.14f)
                curveToRelative(-2.2f, -1.83f, -4.67f, -2.39f, -6.0f, -2.56f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 20.52f)
                lineTo(0.85f, 12f)
                lineTo(12f, 3.48f)
                lineToRelative(11.15f, 8.52f)
                lineToRelative(-11.15f, 8.52f)
                close()
            }
        }.also { _BrazilFlagCircle = it}

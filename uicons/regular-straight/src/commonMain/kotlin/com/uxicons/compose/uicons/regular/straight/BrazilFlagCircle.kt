package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrazilFlagCircle: ImageVector? = null

val Icons.Rs.BrazilFlagCircle: ImageVector
    get() = _BrazilFlagCircle ?: UXIcon(name = "BrazilFlagCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 0.05f, -0.01f, 0.09f, -0.01f, 0.14f)
                curveToRelative(-2.2f, -1.83f, -4.67f, -2.39f, -6.0f, -2.56f)
                curveToRelative(0.64f, -0.66f, 1.53f, -1.08f, 2.52f, -1.08f)
                close()
                moveTo(8.5f, 12f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.11f, 0f, 2.1f, -0.53f, 2.74f, -1.34f)
                curveToRelative(-2.48f, -2.43f, -5.74f, -2.64f, -6.19f, -2.65f)
                curveToRelative(-0.02f, 0.16f, -0.05f, 0.33f, -0.05f, 0.5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(2.05f, 11.09f)
                lineTo(12f, 3.48f)
                lineToRelative(9.95f, 7.61f)
                curveToRelative(-0.46f, -5.09f, -4.75f, -9.09f, -9.95f, -9.09f)
                reflectiveCurveTo(2.51f, 6f, 2.05f, 11.09f)
                close()
                moveTo(12f, 5.99f)
                lineToRelative(-7.85f, 6.01f)
                lineToRelative(7.85f, 6.01f)
                lineToRelative(7.85f, -6.01f)
                lineToRelative(-7.85f, -6.01f)
                close()
                moveTo(21.95f, 12.91f)
                lineToRelative(-9.95f, 7.61f)
                lineTo(2.05f, 12.91f)
                curveToRelative(0.46f, 5.09f, 4.75f, 9.09f, 9.95f, 9.09f)
                reflectiveCurveToRelative(9.49f, -4f, 9.95f, -9.09f)
                close()
            }
        }.also { _BrazilFlagCircle = it}

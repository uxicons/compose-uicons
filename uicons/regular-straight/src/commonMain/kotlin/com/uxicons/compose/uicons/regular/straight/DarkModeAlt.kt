package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DarkModeAlt: ImageVector? = null

val Icons.Rs.DarkModeAlt: ImageVector
    get() = _DarkModeAlt ?: UXIcon(name = "DarkModeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                lineTo(8f, 24f)
                curveTo(3.59f, 24f, 0f, 20.41f, 0f, 16f)
                curveToRelative(0f, -3.66f, 2.47f, -6.74f, 5.83f, -7.69f)
                curveToRelative(0.35f, 0.66f, 0.81f, 1.25f, 1.34f, 1.76f)
                curveToRelative(-2.92f, 0.4f, -5.17f, 2.91f, -5.17f, 5.94f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(8f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -3.03f, -2.26f, -5.53f, -5.17f, -5.94f)
                curveToRelative(0.54f, -0.51f, 0.99f, -1.1f, 1.34f, -1.76f)
                curveToRelative(3.36f, 0.95f, 5.83f, 4.04f, 5.83f, 7.69f)
                close()
                moveTo(7f, 5f)
                curveTo(7f, 2.24f, 9.24f, 0f, 12f, 0f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
                moveTo(9f, 5f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                curveToRelative(0.56f, 0f, 1.07f, -0.16f, 1.52f, -0.42f)
                curveToRelative(-1.16f, -0.29f, -2.02f, -1.33f, -2.02f, -2.58f)
                reflectiveCurveToRelative(0.86f, -2.28f, 2.02f, -2.58f)
                curveToRelative(-0.45f, -0.26f, -0.96f, -0.42f, -1.52f, -0.42f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                close()
                moveTo(12f, 16f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                close()
            }
        }.also { _DarkModeAlt = it}

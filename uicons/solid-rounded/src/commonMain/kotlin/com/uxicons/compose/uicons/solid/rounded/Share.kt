package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Share: ImageVector? = null

val Icons.Sr.Share: ImageVector
    get() = _Share ?: UXIcon(name = "Share", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.01f, 256.01f)
                curveToRelative(-0.22f, 54.77f, 44.01f, 99.35f, 98.78f, 99.57f)
                curveToRelative(25.23f, 0.1f, 49.54f, -9.42f, 68f, -26.61f)
                lineToRelative(147.8f, 66.73f)
                curveToRelative(-1.03f, 5.53f, -1.59f, 11.13f, -1.68f, 16.75f)
                curveToRelative(-0.17f, 55.15f, 44.39f, 100f, 99.54f, 100.18f)
                reflectiveCurveToRelative(100f, -44.39f, 100.18f, -99.54f)
                reflectiveCurveToRelative(-44.39f, -100f, -99.54f, -100.18f)
                curveToRelative(-32.95f, -0.1f, -63.83f, 16.05f, -82.53f, 43.18f)
                lineTo(191.69f, 293.39f)
                curveToRelative(9.86f, -23.82f, 9.9f, -50.57f, 0.11f, -74.41f)
                lineToRelative(138.67f, -63.02f)
                curveToRelative(31.23f, 45.16f, 93.15f, 56.46f, 138.31f, 25.23f)
                reflectiveCurveTo(525.22f, 88.04f, 494f, 42.88f)
                reflectiveCurveToRelative(-93.15f, -56.46f, -138.31f, -25.23f)
                curveToRelative(-26.9f, 18.6f, -42.93f, 49.23f, -42.88f, 81.93f)
                curveToRelative(0.09f, 5.63f, 0.66f, 11.24f, 1.71f, 16.77f)
                lineTo(167.11f, 183.33f)
                curveToRelative(-39.94f, -37.5f, -102.72f, -35.53f, -140.22f, 4.41f)
                curveTo(9.53f, 206.23f, -0.09f, 230.66f, 0.01f, 256.01f)
                close()
            }
        }.also { _Share = it}

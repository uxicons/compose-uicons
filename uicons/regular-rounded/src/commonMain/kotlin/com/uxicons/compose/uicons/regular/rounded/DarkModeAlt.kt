package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DarkModeAlt: ImageVector? = null

val Icons.Rr.DarkModeAlt: ImageVector
    get() = _DarkModeAlt ?: UXIcon(name = "DarkModeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 12f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(19.43f, 8.77f)
                curveToRelative(-0.5f, -0.24f, -1.1f, -0.02f, -1.33f, 0.47f)
                curveToRelative(-0.24f, 0.5f, -0.02f, 1.1f, 0.47f, 1.33f)
                curveToRelative(2.08f, 0.99f, 3.43f, 3.12f, 3.43f, 5.42f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                lineTo(8f, 22.0f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -2.31f, 1.35f, -4.43f, 3.43f, -5.42f)
                curveToRelative(0.5f, -0.24f, 0.71f, -0.83f, 0.47f, -1.33f)
                curveToRelative(-0.24f, -0.5f, -0.83f, -0.71f, -1.33f, -0.47f)
                curveTo(1.79f, 10.09f, 0f, 12.93f, 0f, 16f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                horizontalLineToRelative(8f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -3.07f, -1.79f, -5.91f, -4.57f, -7.23f)
                close()
                moveTo(7f, 5f)
                curveTo(7f, 2.24f, 9.24f, 0f, 12f, 0f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
                moveTo(9.05f, 5.17f)
                curveToRelative(0.09f, 1.51f, 1.31f, 2.73f, 2.82f, 2.82f)
                curveToRelative(0.39f, 0.02f, 0.76f, -0.03f, 1.1f, -0.15f)
                curveToRelative(0.36f, -0.12f, 0.36f, -0.62f, 0.01f, -0.76f)
                curveToRelative(-0.37f, -0.14f, -0.71f, -0.38f, -0.97f, -0.73f)
                curveToRelative(-0.61f, -0.8f, -0.61f, -1.94f, 0f, -2.73f)
                curveToRelative(0.27f, -0.35f, 0.6f, -0.59f, 0.97f, -0.73f)
                curveToRelative(0.36f, -0.14f, 0.35f, -0.64f, -0.01f, -0.76f)
                curveToRelative(-0.29f, -0.1f, -0.6f, -0.15f, -0.92f, -0.15f)
                curveToRelative(-1.71f, 0f, -3.09f, 1.44f, -3.0f, 3.17f)
                close()
            }
        }.also { _DarkModeAlt = it}

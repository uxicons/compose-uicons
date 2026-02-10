package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DarkModeAlt: ImageVector? = null

val Icons.Sr.DarkModeAlt: ImageVector
    get() = _DarkModeAlt ?: UXIcon(name = "DarkModeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(14.76f, 0f, 12f, 0f)
                close()
                moveTo(12.01f, 6.37f)
                curveToRelative(0.27f, 0.35f, 0.6f, 0.59f, 0.97f, 0.73f)
                curveToRelative(0.35f, 0.13f, 0.35f, 0.64f, -0.01f, 0.76f)
                curveToRelative(-0.34f, 0.12f, -0.71f, 0.17f, -1.1f, 0.15f)
                curveToRelative(-1.51f, -0.09f, -2.74f, -1.31f, -2.82f, -2.82f)
                curveToRelative(-0.1f, -1.74f, 1.28f, -3.17f, 3.0f, -3.17f)
                curveToRelative(0.32f, 0f, 0.63f, 0.05f, 0.92f, 0.15f)
                curveToRelative(0.36f, 0.12f, 0.37f, 0.62f, 0.01f, 0.76f)
                curveToRelative(-0.37f, 0.14f, -0.71f, 0.38f, -0.97f, 0.73f)
                curveToRelative(-0.61f, 0.8f, -0.61f, 1.93f, 0f, 2.73f)
                close()
                moveTo(18.17f, 8.31f)
                curveToRelative(-0.61f, 1.14f, -1.54f, 2.09f, -2.66f, 2.74f)
                curveToRelative(0.16f, -0.02f, 0.32f, -0.05f, 0.49f, -0.05f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -1.7f, 0.86f, -3.2f, 2.16f, -4.1f)
                curveToRelative(-0.38f, 0.06f, -0.76f, 0.1f, -1.16f, 0.1f)
                curveToRelative(-2.67f, 0f, -4.99f, -1.5f, -6.17f, -3.69f)
                curveToRelative(-3.36f, 0.95f, -5.83f, 4.04f, -5.83f, 7.69f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                horizontalLineToRelative(8f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -3.66f, -2.47f, -6.74f, -5.83f, -7.69f)
                close()
            }
        }.also { _DarkModeAlt = it}

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DarkModeAlt: ImageVector? = null

val Icons.Br.DarkModeAlt: ImageVector
    get() = _DarkModeAlt ?: UXIcon(name = "DarkModeAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 13f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(19.08f, 8.62f)
            curveToRelative(-0.76f, -0.32f, -1.64f, 0.04f, -1.96f, 0.81f)
            curveToRelative(-0.32f, 0.76f, 0.04f, 1.64f, 0.81f, 1.96f)
            curveToRelative(1.87f, 0.78f, 3.07f, 2.59f, 3.07f, 4.62f)
            curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
            lineTo(8f, 21.0f)
            curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
            curveToRelative(0f, -2.02f, 1.21f, -3.84f, 3.07f, -4.62f)
            curveToRelative(0.77f, -0.32f, 1.12f, -1.2f, 0.81f, -1.96f)
            curveToRelative(-0.32f, -0.77f, -1.2f, -1.12f, -1.96f, -0.81f)
            curveTo(1.93f, 9.86f, 0f, 12.76f, 0f, 16f)
            curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
            horizontalLineToRelative(8f)
            curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
            curveToRelative(0f, -3.24f, -1.93f, -6.14f, -4.92f, -7.38f)
            close()
            moveTo(6.96f, 5f)
            curveTo(6.96f, 2.24f, 9.2f, 0f, 11.96f, 0f)
            reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
            reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
            close()
            moveTo(9.01f, 5.17f)
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
    }.also { _DarkModeAlt = it }

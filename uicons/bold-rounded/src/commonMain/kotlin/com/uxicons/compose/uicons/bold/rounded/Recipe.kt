package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Recipe: ImageVector? = null

val Icons.Br.Recipe: ImageVector
    get() = _Recipe ?: UXIcon(name = "Recipe") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(4f, 9f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-2.05f)
            curveTo(0.62f, 4.67f, -0.34f, 3.26f, 0.11f, 1.74f)
            curveTo(0.35f, 0.94f, 1.02f, 0.3f, 1.82f, 0.09f)
            curveToRelative(0.94f, -0.25f, 1.83f, 0.04f, 2.43f, 0.63f)
            curveToRelative(0.45f, -0.44f, 1.07f, -0.72f, 1.75f, -0.72f)
            reflectiveCurveToRelative(1.3f, 0.28f, 1.75f, 0.72f)
            curveToRelative(0.6f, -0.59f, 1.48f, -0.88f, 2.43f, -0.63f)
            curveToRelative(0.8f, 0.21f, 1.47f, 0.85f, 1.71f, 1.65f)
            curveToRelative(0.45f, 1.53f, -0.51f, 2.93f, -1.89f, 3.21f)
            verticalLineToRelative(2.05f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(19f, 12.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            close()
            moveTo(13.5f, 9f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(10.5f, 16f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1f)
            close()
            moveTo(18.5f, 0f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(6.34f)
            curveToRelative(1.47f, 0f, 2.85f, -0.57f, 3.89f, -1.61f)
            lineToRelative(2.66f, -2.66f)
            curveToRelative(1.04f, -1.04f, 1.61f, -2.42f, 1.61f, -3.89f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
        }
    }.also { _Recipe = it }

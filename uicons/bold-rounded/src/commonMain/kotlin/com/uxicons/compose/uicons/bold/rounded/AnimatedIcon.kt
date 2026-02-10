package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AnimatedIcon: ImageVector? = null

val Icons.Br.AnimatedIcon: ImageVector
    get() = _AnimatedIcon ?: UXIcon(name = "AnimatedIcon") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.5f, 9f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(9f, 22.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            close()
            moveTo(24f, 18.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            close()
            moveTo(9.52f, 17.19f)
            lineToRelative(2.48f, -1.66f)
            lineToRelative(2.52f, 1.64f)
            curveToRelative(0.33f, 0.21f, 0.75f, 0.2f, 1.06f, -0.04f)
            curveToRelative(0.31f, -0.24f, 0.43f, -0.64f, 0.31f, -1.01f)
            lineToRelative(-0.9f, -2.73f)
            lineToRelative(2.17f, -1.77f)
            curveToRelative(0.29f, -0.25f, 0.4f, -0.65f, 0.27f, -1.02f)
            reflectiveCurveToRelative(-0.48f, -0.6f, -0.86f, -0.6f)
            horizontalLineToRelative(-2.75f)
            lineToRelative(-0.97f, -2.61f)
            curveToRelative(-0.13f, -0.36f, -0.48f, -0.6f, -0.86f, -0.6f)
            reflectiveCurveToRelative(-0.73f, 0.24f, -0.86f, 0.6f)
            lineToRelative(-0.97f, 2.61f)
            horizontalLineToRelative(-2.75f)
            curveToRelative(-0.38f, 0f, -0.73f, 0.24f, -0.86f, 0.6f)
            curveToRelative(-0.13f, 0.36f, -0.03f, 0.77f, 0.27f, 1.01f)
            lineToRelative(2.18f, 1.77f)
            lineToRelative(-0.86f, 2.76f)
            curveToRelative(-0.12f, 0.37f, 0.01f, 0.78f, 0.32f, 1.01f)
            curveToRelative(0.16f, 0.12f, 0.36f, 0.18f, 0.55f, 0.18f)
            curveToRelative(0.18f, 0f, 0.36f, -0.05f, 0.51f, -0.15f)
            close()
            moveTo(17f, 1.21f)
            lineTo(17f, 5.87f)
            curveToRelative(0f, 0.9f, 0.97f, 1.46f, 1.75f, 1.02f)
            lineToRelative(4.66f, -2.33f)
            curveToRelative(0.79f, -0.45f, 0.79f, -1.58f, 0f, -2.03f)
            lineTo(18.75f, 0.19f)
            curveToRelative(-0.78f, -0.45f, -1.75f, 0.12f, -1.75f, 1.02f)
            close()
        }
    }.also { _AnimatedIcon = it }

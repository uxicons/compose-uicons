package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationArrow: ImageVector? = null

val Icons.Br.LocationArrow: ImageVector
    get() = _LocationArrow ?: UXIcon(name = "LocationArrow") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.74f, 1.28f)
            curveToRelative(-1.23f, -1.23f, -3.01f, -1.61f, -4.64f, -1.0f)
            lineTo(2.68f, 6.08f)
            curveTo(0.8f, 6.79f, -0.27f, 8.67f, 0.09f, 10.64f)
            curveToRelative(0.36f, 1.98f, 2.02f, 3.36f, 4.03f, 3.36f)
            horizontalLineToRelative(5.88f)
            verticalLineToRelative(5.89f)
            curveToRelative(0f, 2.01f, 1.38f, 3.66f, 3.36f, 4.02f)
            curveToRelative(0.26f, 0.05f, 0.51f, 0.07f, 0.77f, 0.07f)
            curveToRelative(1.68f, 0f, 3.18f, -1.02f, 3.8f, -2.65f)
            lineToRelative(5.82f, -15.43f)
            curveToRelative(0.61f, -1.63f, 0.23f, -3.4f, -1.0f, -4.64f)
            close()
            moveTo(20.93f, 4.86f)
            lineToRelative(-5.82f, 15.43f)
            curveToRelative(-0.3f, 0.79f, -1.0f, 0.73f, -1.22f, 0.69f)
            curveToRelative(-0.21f, -0.04f, -0.9f, -0.23f, -0.9f, -1.07f)
            verticalLineToRelative(-7.39f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7.38f)
            curveToRelative(-0.85f, 0f, -1.04f, -0.69f, -1.07f, -0.9f)
            reflectiveCurveToRelative(-0.1f, -0.92f, 0.69f, -1.22f)
            lineToRelative(15.43f, -5.81f)
            curveToRelative(0.18f, -0.07f, 0.34f, -0.09f, 0.5f, -0.09f)
            curveToRelative(0.5f, 0f, 0.85f, 0.3f, 0.96f, 0.41f)
            curveToRelative(0.15f, 0.15f, 0.6f, 0.69f, 0.31f, 1.46f)
            close()
        }
    }.also { _LocationArrow = it }

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckFront: ImageVector? = null

val Icons.Br.TruckFront: ImageVector
    get() = _TruckFront ?: UXIcon(name = "TruckFront") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.42f, 0.85f, 2.65f, 2.07f, 3.19f)
            curveToRelative(0.14f, 0.79f, 0.52f, 1.52f, 1.1f, 2.11f)
            curveToRelative(0.24f, 0.25f, 0.52f, 0.46f, 0.81f, 0.63f)
            verticalLineToRelative(0.56f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-0.55f)
            curveToRelative(0.99f, -0.58f, 1.71f, -1.57f, 1.93f, -2.74f)
            curveToRelative(1.23f, -0.54f, 2.09f, -1.77f, 2.09f, -3.2f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(6.05f, 13f)
            lineToRelative(0.71f, -1.55f)
            curveToRelative(0.41f, -0.88f, 1.3f, -1.45f, 2.27f, -1.45f)
            horizontalLineToRelative(5.88f)
            curveToRelative(0.97f, 0f, 1.86f, 0.57f, 2.27f, 1.45f)
            lineToRelative(0.71f, 1.55f)
            lineTo(6.05f, 13f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(7.05f)
            lineToRelative(-1.09f, -2.36f)
            curveToRelative(-0.9f, -1.94f, -2.86f, -3.19f, -4.99f, -3.19f)
            horizontalLineToRelative(-5.88f)
            curveToRelative(-2.14f, 0f, -4.1f, 1.25f, -4.99f, 3.19f)
            lineToRelative(-1.04f, 2.26f)
            verticalLineToRelative(-6.95f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(6.04f, 19f)
            curveToRelative(-0.28f, 0f, -0.54f, -0.11f, -0.74f, -0.31f)
            reflectiveCurveToRelative(-0.3f, -0.46f, -0.3f, -0.77f)
            curveToRelative(-0.01f, -0.79f, -0.0f, -1.92f, -0.0f, -1.92f)
            horizontalLineToRelative(1.98f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(2.02f)
            lineToRelative(-0.02f, 1.96f)
            curveToRelative(0f, 0.57f, -0.47f, 1.04f, -1.04f, 1.04f)
            lineTo(6.04f, 19f)
            close()
        }
    }.also { _TruckFront = it }

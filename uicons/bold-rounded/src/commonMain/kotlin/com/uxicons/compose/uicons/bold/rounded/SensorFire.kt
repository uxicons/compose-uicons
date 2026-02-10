package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SensorFire: ImageVector? = null

val Icons.Br.SensorFire: ImageVector
    get() = _SensorFire ?: UXIcon(name = "SensorFire") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 5.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(5f, 6.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            close()
            moveTo(13f, 6.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            close()
            moveTo(24f, 17.5f)
            curveToRelative(0f, 3.46f, -2.7f, 6.29f, -6.12f, 6.49f)
            curveToRelative(-2.85f, 0.17f, -5.33f, -1.69f, -6.42f, -4.33f)
            curveToRelative(-1.02f, -2.46f, 0.09f, -4.99f, 1.25f, -6.42f)
            curveToRelative(0.3f, -0.37f, 0.89f, -0.3f, 1.09f, 0.13f)
            curveToRelative(0.27f, 0.62f, 0.18f, 1.62f, 0.76f, 1.62f)
            curveToRelative(1.23f, 0f, 0.91f, -3.32f, 2.28f, -5.63f)
            curveToRelative(0.24f, -0.41f, 0.81f, -0.49f, 1.16f, -0.17f)
            curveToRelative(2.21f, 1.97f, 6f, 4.89f, 6f, 8.3f)
            close()
            moveTo(19.16f, 17.62f)
            lineToRelative(-1.1f, -1.1f)
            curveToRelative(-0.31f, -0.31f, -0.81f, -0.31f, -1.11f, 0f)
            lineToRelative(-1.1f, 1.1f)
            curveToRelative(-0.94f, 0.94f, -1.11f, 2.49f, -0.24f, 3.5f)
            curveToRelative(1.0f, 1.17f, 2.8f, 1.17f, 3.81f, 0f)
            curveToRelative(0.87f, -1.01f, 0.7f, -2.56f, -0.24f, -3.5f)
            close()
        }
    }.also { _SensorFire = it }

package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureDown: ImageVector? = null

val Icons.Sc.TemperatureDown: ImageVector
    get() = _TemperatureDown ?: UXIcon(name = "TemperatureDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 5.53f)
                curveToRelative(-0.7f, -0.32f, -1.51f, -0.05f, -1.9f, 0.59f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.62f)
                curveToRelative(-0.39f, -0.64f, -1.2f, -0.91f, -1.9f, -0.59f)
                curveToRelative(-0.76f, 0.34f, -1.09f, 1.23f, -0.75f, 1.98f)
                curveToRelative(1.05f, 2.33f, 3.23f, 3.48f, 3.48f, 3.6f)
                curveToRelative(0.21f, 0.11f, 0.44f, 0.16f, 0.67f, 0.16f)
                reflectiveCurveToRelative(0.46f, -0.05f, 0.67f, -0.16f)
                curveToRelative(0.25f, -0.12f, 2.44f, -1.27f, 3.48f, -3.6f)
                curveToRelative(0.34f, -0.76f, 0.0f, -1.64f, -0.75f, -1.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.88f, 10.1f)
                curveToRelative(-0.01f, -1.58f, -0.04f, -4.53f, -0.08f, -5.2f)
                curveToRelative(-0.14f, -2.19f, -2.0f, -3.9f, -4.23f, -3.9f)
                reflectiveCurveToRelative(-4.09f, 1.71f, -4.23f, 3.9f)
                curveToRelative(-0.04f, 0.65f, -0.07f, 3.5f, -0.08f, 5.2f)
                curveToRelative(-1.78f, 1.07f, -2.64f, 3.03f, -2.64f, 5.97f)
                curveToRelative(0f, 6.21f, 3.97f, 6.93f, 6.96f, 6.93f)
                reflectiveCurveToRelative(6.96f, -0.72f, 6.96f, -6.93f)
                curveToRelative(0f, -2.94f, -0.87f, -4.9f, -2.64f, -5.97f)
                close()
                moveTo(8.57f, 19.01f)
                curveToRelative(-1.63f, 0f, -2.95f, -1.32f, -2.95f, -2.94f)
                curveToRelative(0f, -1.27f, 0.81f, -2.36f, 1.95f, -2.77f)
                verticalLineToRelative(-1.05f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.05f)
                curveToRelative(1.14f, 0.41f, 1.95f, 1.5f, 1.95f, 2.77f)
                curveToRelative(0f, 1.62f, -1.32f, 2.94f, -2.95f, 2.94f)
                close()
            }
        }.also { _TemperatureDown = it}

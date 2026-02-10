package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureUp: ImageVector? = null

val Icons.Sc.TemperatureUp: ImageVector
    get() = _TemperatureUp ?: UXIcon(name = "TemperatureUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.37f, 4.9f)
                curveToRelative(-1.05f, -2.33f, -3.23f, -3.48f, -3.48f, -3.6f)
                curveToRelative(-0.42f, -0.21f, -0.92f, -0.21f, -1.34f, 0f)
                curveToRelative(-0.25f, 0.12f, -2.44f, 1.27f, -3.48f, 3.6f)
                curveToRelative(-0.34f, 0.76f, -0.01f, 1.66f, 0.75f, 1.98f)
                curveToRelative(0.88f, 0.37f, 1.62f, -0.14f, 1.9f, -0.6f)
                verticalLineToRelative(4.12f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(6.29f)
                curveToRelative(0.39f, 0.64f, 1.2f, 0.91f, 1.9f, 0.59f)
                curveToRelative(0.76f, -0.34f, 1.09f, -1.23f, 0.75f, -1.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.79f, 10.1f)
                curveToRelative(-0.01f, -1.73f, -0.04f, -4.56f, -0.08f, -5.2f)
                curveToRelative(-0.14f, -2.19f, -2.0f, -3.9f, -4.24f, -3.9f)
                reflectiveCurveToRelative(-4.1f, 1.71f, -4.24f, 3.9f)
                curveToRelative(-0.04f, 0.64f, -0.07f, 3.5f, -0.08f, 5.2f)
                curveToRelative(-1.78f, 1.07f, -2.65f, 3.03f, -2.65f, 5.97f)
                curveToRelative(0f, 6.21f, 3.98f, 6.93f, 6.97f, 6.93f)
                reflectiveCurveToRelative(6.97f, -0.72f, 6.97f, -6.93f)
                curveToRelative(0f, -2.94f, -0.87f, -4.9f, -2.65f, -5.97f)
                close()
                moveTo(8.46f, 19.01f)
                curveToRelative(-1.63f, 0f, -2.95f, -1.32f, -2.95f, -2.94f)
                curveToRelative(0f, -1.27f, 0.82f, -2.36f, 1.95f, -2.77f)
                lineTo(7.46f, 5.93f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7.37f)
                curveToRelative(1.14f, 0.41f, 1.96f, 1.5f, 1.96f, 2.77f)
                curveToRelative(0f, 1.62f, -1.32f, 2.94f, -2.96f, 2.94f)
                close()
            }
        }.also { _TemperatureUp = it}

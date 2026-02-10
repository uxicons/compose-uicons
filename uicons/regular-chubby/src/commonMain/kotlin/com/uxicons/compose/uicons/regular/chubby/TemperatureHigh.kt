package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureHigh: ImageVector? = null

val Icons.Rc.TemperatureHigh: ImageVector
    get() = _TemperatureHigh ?: UXIcon(name = "TemperatureHigh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.44f, 1.01f)
                curveToRelative(-2.68f, 0f, -3.25f, 1.76f, -3.25f, 3.24f)
                reflectiveCurveToRelative(0.56f, 3.24f, 3.25f, 3.24f)
                reflectiveCurveToRelative(3.24f, -1.76f, 3.24f, -3.24f)
                reflectiveCurveToRelative(-0.56f, -3.24f, -3.24f, -3.24f)
                close()
                moveTo(18.44f, 5.5f)
                curveToRelative(-0.96f, 0f, -1.25f, -0.16f, -1.25f, -1.24f)
                reflectiveCurveToRelative(0.28f, -1.24f, 1.25f, -1.24f)
                reflectiveCurveToRelative(1.24f, 0.16f, 1.24f, 1.24f)
                reflectiveCurveToRelative(-0.28f, 1.24f, -1.24f, 1.24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.61f, 10.1f)
                curveToRelative(-0.01f, -1.73f, -0.04f, -4.56f, -0.08f, -5.2f)
                curveToRelative(-0.14f, -2.19f, -2.0f, -3.9f, -4.24f, -3.9f)
                reflectiveCurveToRelative(-4.1f, 1.71f, -4.24f, 3.9f)
                curveToRelative(-0.04f, 0.64f, -0.07f, 3.5f, -0.08f, 5.2f)
                curveToRelative(-1.78f, 1.07f, -2.65f, 3.03f, -2.65f, 5.97f)
                curveToRelative(0f, 6.21f, 3.98f, 6.93f, 6.97f, 6.93f)
                reflectiveCurveToRelative(6.97f, -0.72f, 6.97f, -6.93f)
                curveToRelative(0f, -2.94f, -0.87f, -4.9f, -2.65f, -5.97f)
                close()
                moveTo(9.29f, 21f)
                curveToRelative(-3.07f, 0f, -4.97f, -0.82f, -4.97f, -4.93f)
                curveToRelative(0f, -3.16f, 1.17f, -4.05f, 2.05f, -4.45f)
                curveToRelative(0.36f, -0.16f, 0.59f, -0.52f, 0.59f, -0.91f)
                curveToRelative(0.01f, -2f, 0.04f, -5.09f, 0.08f, -5.68f)
                curveToRelative(0.07f, -1.14f, 1.06f, -2.03f, 2.25f, -2.03f)
                reflectiveCurveToRelative(2.17f, 0.89f, 2.25f, 2.03f)
                curveToRelative(0.04f, 0.59f, 0.07f, 3.68f, 0.08f, 5.68f)
                curveToRelative(0.0f, 0.39f, 0.23f, 0.75f, 0.59f, 0.91f)
                curveToRelative(0.88f, 0.4f, 2.05f, 1.29f, 2.05f, 4.45f)
                curveToRelative(0f, 4.11f, -1.9f, 4.93f, -4.97f, 4.93f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.29f, 13.3f)
                lineTo(10.29f, 5.93f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(7.37f)
                curveToRelative(-1.14f, 0.41f, -1.95f, 1.5f, -1.95f, 2.77f)
                curveToRelative(0f, 1.62f, 1.32f, 2.94f, 2.95f, 2.94f)
                reflectiveCurveToRelative(2.96f, -1.32f, 2.96f, -2.94f)
                curveToRelative(0f, -1.27f, -0.82f, -2.36f, -1.96f, -2.77f)
                close()
                moveTo(9.29f, 17.01f)
                curveToRelative(-0.53f, 0f, -0.95f, -0.42f, -0.95f, -0.94f)
                reflectiveCurveToRelative(0.43f, -0.94f, 0.95f, -0.94f)
                reflectiveCurveToRelative(0.95f, 0.42f, 0.95f, 0.94f)
                reflectiveCurveToRelative(-0.43f, 0.94f, -0.95f, 0.94f)
                close()
            }
        }.also { _TemperatureHigh = it}

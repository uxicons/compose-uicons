package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SensorOn: ImageVector? = null

val Icons.Tc.SensorOn: ImageVector
    get() = _SensorOn ?: UXIcon(name = "SensorOn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.41f, 8.24f)
                curveToRelative(-0.12f, -0.04f, -3.09f, -0.86f, -6.6f, -0.86f)
                reflectiveCurveToRelative(-6.48f, 0.82f, -6.6f, 0.86f)
                curveToRelative(-0.16f, 0.05f, -0.29f, 0.17f, -0.34f, 0.34f)
                curveToRelative(-0.04f, 0.12f, -0.86f, 2.9f, -0.86f, 6.62f)
                curveToRelative(0f, 3.75f, 0.83f, 6.5f, 0.86f, 6.62f)
                curveToRelative(0.05f, 0.16f, 0.18f, 0.29f, 0.34f, 0.34f)
                curveToRelative(0.12f, 0.04f, 3.09f, 0.86f, 6.6f, 0.86f)
                reflectiveCurveToRelative(6.48f, -0.82f, 6.6f, -0.86f)
                curveToRelative(0.16f, -0.04f, 0.29f, -0.17f, 0.34f, -0.33f)
                curveToRelative(0.04f, -0.12f, 0.95f, -2.94f, 0.95f, -6.67f)
                curveToRelative(0f, -3.76f, -0.91f, -6.48f, -0.95f, -6.59f)
                curveToRelative(-0.05f, -0.16f, -0.18f, -0.28f, -0.34f, -0.32f)
                close()
                moveTo(14.88f, 21.25f)
                curveToRelative(-0.8f, 0.2f, -3.29f, 0.75f, -6.07f, 0.75f)
                reflectiveCurveToRelative(-5.26f, -0.55f, -6.06f, -0.75f)
                curveToRelative(-0.2f, -0.77f, -0.75f, -3.12f, -0.75f, -6.06f)
                curveToRelative(0f, -2.92f, 0.55f, -5.29f, 0.75f, -6.06f)
                curveToRelative(0.8f, -0.2f, 3.29f, -0.75f, 6.06f, -0.75f)
                curveToRelative(2.79f, 0f, 5.28f, 0.56f, 6.07f, 0.76f)
                curveToRelative(0.22f, 0.75f, 0.82f, 3.07f, 0.82f, 6.02f)
                curveToRelative(0f, 2.93f, -0.6f, 5.33f, -0.82f, 6.1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.98f, 2.99f)
                curveToRelative(-1.28f, -1.28f, -3.07f, -1.99f, -5.02f, -1.99f)
                curveToRelative(-0.29f, 0.01f, -0.53f, 0.21f, -0.53f, 0.5f)
                curveToRelative(0f, 0.28f, 0.25f, 0.48f, 0.5f, 0.5f)
                curveToRelative(1.71f, -0.03f, 3.25f, 0.59f, 4.35f, 1.7f)
                curveToRelative(1.12f, 1.12f, 1.73f, 2.7f, 1.72f, 4.45f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0.01f, -2.02f, -0.71f, -3.85f, -2.02f, -5.16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.44f, 4.69f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.23f, -0.5f, 0.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.81f, -0.03f, 1.49f, 0.25f, 1.98f, 0.73f)
                curveToRelative(0.49f, 0.49f, 0.75f, 1.19f, 0.75f, 2.02f)
                curveToRelative(0f, 0.28f, 0.22f, 0.53f, 0.5f, 0.5f)
                curveToRelative(0.33f, -0.03f, 0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0.01f, -1.1f, -0.35f, -2.05f, -1.04f, -2.73f)
                curveToRelative(-0.68f, -0.68f, -1.61f, -1.08f, -2.69f, -1.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 12f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
        }.also { _SensorOn = it}

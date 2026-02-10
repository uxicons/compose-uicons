package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneArrival: ImageVector? = null

val Icons.Sc.PlaneArrival: ImageVector
    get() = _PlaneArrival ?: UXIcon(name = "PlaneArrival") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.96f, 19.15f)
                curveToRelative(-0.19f, -0.81f, -1.0f, -1.3f, -1.81f, -1.1f)
                curveToRelative(-0.04f, 0.01f, -4.04f, 0.96f, -9.15f, 0.96f)
                reflectiveCurveToRelative(-9.11f, -0.95f, -9.15f, -0.96f)
                curveToRelative(-0.81f, -0.19f, -1.62f, 0.3f, -1.81f, 1.1f)
                curveToRelative(-0.2f, 0.81f, 0.3f, 1.61f, 1.1f, 1.81f)
                curveToRelative(0.18f, 0.04f, 4.35f, 1.04f, 9.85f, 1.04f)
                reflectiveCurveToRelative(9.68f, -1f, 9.85f, -1.04f)
                curveToRelative(0.81f, -0.2f, 1.3f, -1.0f, 1.1f, -1.81f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.54f, 9.89f)
                curveToRelative(0.23f, 0.12f, 5.65f, 2.95f, 8.81f, 4.11f)
                curveToRelative(3.8f, 1.39f, 6.07f, 2.19f, 6.74f, 2.36f)
                curveToRelative(0.3f, 0.08f, 0.6f, 0.12f, 0.9f, 0.12f)
                curveToRelative(1.29f, 0f, 2.41f, -0.73f, 2.85f, -1.93f)
                curveToRelative(0.52f, -1.44f, -0.21f, -3.07f, -1.71f, -3.81f)
                curveToRelative(-2.31f, -1.13f, -4.46f, -2.06f, -6.6f, -2.85f)
                curveToRelative(-2.31f, -0.84f, -4.49f, -1.48f, -5.69f, -1.81f)
                lineToRelative(-0.07f, -0.23f)
                curveToRelative(-0.36f, -1.16f, -1.22f, -2.16f, -2.35f, -2.73f)
                lineToRelative(-1.96f, -1.0f)
                curveToRelative(-0.31f, -0.16f, -0.68f, -0.15f, -0.98f, 0.04f)
                reflectiveCurveToRelative(-0.48f, 0.51f, -0.48f, 0.85f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.37f, 0.21f, 0.71f, 0.54f, 0.89f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.21f, 6.01f)
                curveToRelative(0.77f, 0.28f, 1.54f, 0.58f, 2.31f, 0.9f)
                curveToRelative(-1.11f, -1.95f, -2.76f, -3.96f, -5.1f, -4.82f)
                curveToRelative(-0.48f, -0.18f, -0.99f, -0.09f, -1.35f, 0.23f)
                curveToRelative(-0.33f, 0.3f, -0.63f, 0.74f, -0.53f, 2.16f)
                curveToRelative(1.23f, 0.36f, 2.91f, 0.88f, 4.66f, 1.52f)
                close()
            }
        }.also { _PlaneArrival = it}

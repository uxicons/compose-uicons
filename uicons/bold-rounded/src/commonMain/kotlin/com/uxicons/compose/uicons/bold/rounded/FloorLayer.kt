package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloorLayer: ImageVector? = null

val Icons.Br.FloorLayer: ImageVector
    get() = _FloorLayer ?: UXIcon(name = "FloorLayer") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(1.75f, 10.76f)
            lineToRelative(7.88f, 3.71f)
            curveToRelative(0.75f, 0.35f, 1.56f, 0.53f, 2.37f, 0.53f)
            curveToRelative(0.81f, 0f, 1.63f, -0.18f, 2.38f, -0.54f)
            lineToRelative(7.88f, -3.74f)
            curveToRelative(1.06f, -0.5f, 1.74f, -1.58f, 1.74f, -2.74f)
            reflectiveCurveToRelative(-0.69f, -2.24f, -1.75f, -2.74f)
            lineToRelative(-7.88f, -3.71f)
            curveToRelative(-1.5f, -0.71f, -3.23f, -0.71f, -4.74f, 0f)
            lineTo(1.75f, 5.24f)
            curveToRelative(-1.06f, 0.5f, -1.75f, 1.58f, -1.75f, 2.77f)
            curveToRelative(0f, 1.17f, 0.69f, 2.24f, 1.75f, 2.74f)
            close()
            moveTo(10.91f, 4.24f)
            curveToRelative(0.35f, -0.16f, 0.72f, -0.24f, 1.09f, -0.24f)
            reflectiveCurveToRelative(0.74f, 0.08f, 1.09f, 0.24f)
            lineToRelative(5.85f, 2.8f)
            lineToRelative(-6.94f, 3.27f)
            lineToRelative(-6.98f, -3.29f)
            lineToRelative(5.89f, -2.78f)
            close()
            moveTo(24.01f, 16.25f)
            curveToRelative(0f, 0.86f, -0.5f, 1.65f, -1.28f, 2.02f)
            lineToRelative(-8.39f, 3.71f)
            curveToRelative(-0.73f, 0.35f, -1.53f, 0.52f, -2.33f, 0.52f)
            curveToRelative(-0.81f, 0f, -1.62f, -0.18f, -2.38f, -0.54f)
            lineToRelative(-8.3f, -3.68f)
            curveTo(0.51f, 17.9f, 0.01f, 17.11f, 0.01f, 16.25f)
            curveToRelative(0f, -0.77f, 0.39f, -1.48f, 1.04f, -1.89f)
            curveToRelative(0.66f, -0.42f, 1.47f, -0.46f, 2.17f, -0.13f)
            lineToRelative(8.78f, 3.92f)
            lineToRelative(8.82f, -3.94f)
            curveToRelative(0.67f, -0.32f, 1.48f, -0.27f, 2.14f, 0.15f)
            curveToRelative(0.65f, 0.41f, 1.04f, 1.12f, 1.04f, 1.89f)
            close()
        }
    }.also { _FloorLayer = it }

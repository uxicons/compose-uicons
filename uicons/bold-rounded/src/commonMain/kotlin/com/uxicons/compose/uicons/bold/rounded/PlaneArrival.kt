package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneArrival: ImageVector? = null

val Icons.Br.PlaneArrival: ImageVector
    get() = _PlaneArrival ?: UXIcon(name = "PlaneArrival") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.51f, 24f)
            horizontalLineTo(1.51f)
            curveTo(0.68f, 24f, 0.01f, 23.33f, 0.01f, 22.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineTo(22.51f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.25f, 13.66f)
            curveToRelative(-0.36f, -1.11f, -1.14f, -2.0f, -2.19f, -2.52f)
            horizontalLineToRelative(0f)
            lineToRelative(-4.95f, -2.41f)
            lineToRelative(-0.56f, -6.15f)
            curveToRelative(-0.07f, -0.93f, -0.65f, -1.75f, -1.5f, -2.13f)
            lineToRelative(-1.14f, -0.35f)
            curveToRelative(-1.46f, -0.44f, -2.93f, 0.64f, -2.94f, 2.17f)
            lineToRelative(-0.03f, 3.45f)
            lineToRelative(-0.97f, -0.47f)
            lineToRelative(-0.7f, -2.88f)
            curveToRelative(-0.19f, -0.75f, -0.65f, -1.39f, -1.31f, -1.79f)
            curveTo(5.06f, 0.03f, 3.97f, 0.01f, 3.06f, 0.51f)
            curveToRelative(-0.92f, 0.5f, -1.48f, 1.43f, -1.51f, 2.51f)
            verticalLineToRelative(6.22f)
            curveToRelative(0f, 1.33f, 0.74f, 2.53f, 1.93f, 3.13f)
            lineToRelative(12.8f, 6.41f)
            curveToRelative(0.6f, 0.3f, 1.25f, 0.45f, 1.89f, 0.45f)
            curveToRelative(1.53f, 0f, 3.02f, -0.82f, 3.78f, -2.25f)
            curveToRelative(0.55f, -1.03f, 0.65f, -2.21f, 0.29f, -3.32f)
            close()
            moveTo(19.31f, 15.57f)
            curveToRelative(-0.32f, 0.6f, -1.07f, 0.84f, -1.68f, 0.53f)
            lineTo(4.82f, 9.69f)
            curveToRelative(-0.17f, -0.09f, -0.28f, -0.26f, -0.28f, -0.45f)
            lineTo(4.54f, 3.86f)
            lineToRelative(0.68f, 2.78f)
            curveToRelative(0.1f, 0.43f, 0.4f, 0.8f, 0.8f, 0.99f)
            lineToRelative(12.72f, 6.21f)
            curveToRelative(0.31f, 0.15f, 0.54f, 0.42f, 0.65f, 0.74f)
            reflectiveCurveToRelative(0.08f, 0.68f, -0.09f, 0.98f)
            close()
        }
    }.also { _PlaneArrival = it }

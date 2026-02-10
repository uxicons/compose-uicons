package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RouteInterstate: ImageVector? = null

val Icons.Sc.RouteInterstate: ImageVector
    get() = _RouteInterstate ?: UXIcon(name = "RouteInterstate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6.5f)
                curveToRelative(3.85f, 0f, 7.15f, 1.12f, 8.99f, 1.91f)
                curveToRelative(0.0f, -0.45f, 0.01f, -0.92f, 0.01f, -1.41f)
                curveToRelative(0f, -2.48f, -2.33f, -4f, -4f, -4f)
                horizontalLineToRelative(-0.61f)
                curveToRelative(-1.06f, -0.92f, -2.39f, -2f, -4.39f, -2f)
                reflectiveCurveToRelative(-3.33f, 1.08f, -4.39f, 2f)
                horizontalLineToRelative(-0.61f)
                curveToRelative(-1.67f, 0f, -4f, 1.52f, -4f, 4f)
                curveToRelative(0f, 0.48f, 0.0f, 0.93f, 0.01f, 1.37f)
                curveToRelative(1.84f, -0.77f, 5.15f, -1.87f, 8.99f, -1.87f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 8.5f)
                curveToRelative(-4.12f, 0f, -7.55f, 1.38f, -8.96f, 2.04f)
                curveToRelative(0.19f, 7.11f, 0.97f, 7.89f, 1.25f, 8.16f)
                curveToRelative(2.36f, 2.36f, 7.16f, 4.16f, 7.36f, 4.23f)
                curveToRelative(0.11f, 0.04f, 0.23f, 0.06f, 0.35f, 0.06f)
                reflectiveCurveToRelative(0.23f, -0.02f, 0.35f, -0.06f)
                curveToRelative(0.2f, -0.07f, 5.0f, -1.87f, 7.36f, -4.23f)
                curveToRelative(0.28f, -0.28f, 1.05f, -1.05f, 1.25f, -8.13f)
                curveToRelative(-1.4f, -0.67f, -4.83f, -2.08f, -8.96f, -2.08f)
                close()
            }
        }.also { _RouteInterstate = it}

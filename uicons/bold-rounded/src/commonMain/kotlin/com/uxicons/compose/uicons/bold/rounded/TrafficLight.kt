package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrafficLight: ImageVector? = null

val Icons.Br.TrafficLight: ImageVector
    get() = _TrafficLight ?: UXIcon(name = "TrafficLight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 0f)
            horizontalLineToRelative(-6f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(6f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            lineTo(20f, 5f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            close()
            moveTo(13.28f, 15.25f)
            curveToRelative(1.3f, 0.51f, 2.22f, 1.77f, 2.22f, 3.25f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
            curveToRelative(0f, -1.48f, 0.92f, -2.74f, 2.22f, -3.25f)
            curveToRelative(-1.3f, -0.51f, -2.22f, -1.77f, -2.22f, -3.25f)
            reflectiveCurveToRelative(0.92f, -2.74f, 2.22f, -3.25f)
            curveToRelative(-1.3f, -0.51f, -2.22f, -1.77f, -2.22f, -3.25f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            curveToRelative(0f, 1.48f, -0.92f, 2.74f, -2.22f, 3.25f)
            curveToRelative(1.3f, 0.51f, 2.22f, 1.77f, 2.22f, 3.25f)
            reflectiveCurveToRelative(-0.92f, 2.74f, -2.22f, 3.25f)
            close()
        }
    }.also { _TrafficLight = it }

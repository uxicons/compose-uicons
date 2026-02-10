package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrafficLightSlow: ImageVector? = null

val Icons.Bs.TrafficLightSlow: ImageVector
    get() = _TrafficLightSlow ?: UXIcon(name = "TrafficLightSlow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 0f)
                lineTo(7.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(4f, 24f)
                lineTo(20f, 24f)
                lineTo(20f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
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
                moveTo(10.5f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(10.5f, 18.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _TrafficLightSlow = it}

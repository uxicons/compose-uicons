package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrafficCone: ImageVector? = null

val Icons.Br.TrafficCone: ImageVector
    get() = _TrafficCone ?: UXIcon(name = "TrafficCone") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 21f)
            horizontalLineToRelative(-0.45f)
            reflectiveCurveTo(15.16f, 2.25f, 15.16f, 2.25f)
            curveTo(14.67f, 0.91f, 13.43f, 0.04f, 12f, 0.04f)
            reflectiveCurveToRelative(-2.67f, 0.86f, -3.16f, 2.2f)
            lineTo(1.96f, 20.99f)
            horizontalLineToRelative(-0.53f)
            reflectiveCurveToRelative(0f, 0f, 0f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            lineToRelative(21.08f, 0.01f)
            horizontalLineToRelative(0f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(8.46f, 12f)
            horizontalLineToRelative(7.09f)
            lineToRelative(1.1f, 3f)
            lineTo(7.35f, 15f)
            lineToRelative(1.1f, -3f)
            close()
            moveTo(11.66f, 3.28f)
            curveToRelative(0.12f, -0.32f, 0.57f, -0.32f, 0.69f, 0f)
            lineToRelative(2.1f, 5.72f)
            horizontalLineToRelative(-4.88f)
            lineToRelative(2.1f, -5.72f)
            close()
            moveTo(6.25f, 18f)
            horizontalLineToRelative(11.5f)
            lineToRelative(1.1f, 3.0f)
            lineToRelative(-13.7f, -0.01f)
            lineToRelative(1.1f, -2.99f)
            close()
        }
    }.also { _TrafficCone = it }

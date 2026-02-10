package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrafficCone: ImageVector? = null

val Icons.Rr.TrafficCone: ImageVector
    get() = _TrafficCone ?: UXIcon(name = "TrafficCone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22f)
                horizontalLineToRelative(-0.87f)
                lineTo(14.77f, 1.98f)
                curveTo(14.34f, 0.81f, 13.25f, 0.04f, 12f, 0.04f)
                reflectiveCurveToRelative(-2.34f, 0.76f, -2.77f, 1.94f)
                lineTo(1.87f, 22f)
                horizontalLineToRelative(-0.87f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.54f)
                curveToRelative(0.02f, 0f, 0.05f, 0f, 0.07f, 0f)
                horizontalLineToRelative(20.39f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(7.68f, 12f)
                horizontalLineToRelative(8.65f)
                lineToRelative(1.47f, 4f)
                lineTo(6.21f, 16f)
                lineToRelative(1.47f, -4f)
                close()
                moveTo(11.1f, 2.67f)
                curveToRelative(0.21f, -0.58f, 0.74f, -0.63f, 0.9f, -0.63f)
                reflectiveCurveToRelative(0.68f, 0.04f, 0.9f, 0.62f)
                lineToRelative(2.69f, 7.33f)
                horizontalLineToRelative(-7.18f)
                lineToRelative(2.69f, -7.33f)
                close()
                moveTo(5.47f, 18f)
                horizontalLineToRelative(13.06f)
                lineToRelative(1.47f, 4f)
                lineTo(4.0f, 22f)
                lineToRelative(1.47f, -4f)
                close()
            }
        }.also { _TrafficCone = it}

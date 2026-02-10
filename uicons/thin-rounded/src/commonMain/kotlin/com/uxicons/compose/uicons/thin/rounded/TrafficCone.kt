package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrafficCone: ImageVector? = null

val Icons.Tr.TrafficCone: ImageVector
    get() = _TrafficCone ?: UXIcon(name = "TrafficCone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 23f)
                horizontalLineToRelative(-1.29f)
                lineToRelative(-5.4f, -14.69f)
                reflectiveCurveToRelative(0f, -0.0f, 0f, -0.0f)
                lineToRelative(-2.42f, -6.59f)
                curveTo(14.02f, 0.7f, 13.08f, 0.04f, 12f, 0.04f)
                reflectiveCurveToRelative(-2.02f, 0.65f, -2.39f, 1.67f)
                lineToRelative(-2.42f, 6.59f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                lineTo(1.79f, 23f)
                lineTo(0.5f, 23f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(23f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(6.16f, 14f)
                horizontalLineToRelative(11.67f)
                lineToRelative(1.47f, 4f)
                lineTo(4.69f, 18f)
                lineToRelative(1.47f, -4f)
                close()
                moveTo(8.0f, 9f)
                horizontalLineToRelative(8.0f)
                lineToRelative(1.47f, 4f)
                lineTo(6.53f, 13f)
                lineToRelative(1.47f, -4f)
                close()
                moveTo(10.55f, 2.06f)
                curveToRelative(0.27f, -0.74f, 0.93f, -1.01f, 1.45f, -1.01f)
                reflectiveCurveToRelative(1.18f, 0.27f, 1.45f, 1.01f)
                lineToRelative(2.18f, 5.94f)
                horizontalLineToRelative(-7.26f)
                lineToRelative(2.18f, -5.94f)
                close()
                moveTo(4.33f, 19f)
                horizontalLineToRelative(15.35f)
                lineToRelative(1.47f, 4f)
                lineTo(2.86f, 23f)
                lineToRelative(1.47f, -4f)
                close()
            }
        }.also { _TrafficCone = it}

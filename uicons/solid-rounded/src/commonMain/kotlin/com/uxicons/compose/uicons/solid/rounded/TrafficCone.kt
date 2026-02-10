package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrafficCone: ImageVector? = null

val Icons.Sr.TrafficCone: ImageVector
    get() = _TrafficCone ?: UXIcon(name = "TrafficCone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0.87f)
                lineToRelative(1.47f, -4f)
                horizontalLineToRelative(17.32f)
                lineToRelative(1.47f, 4f)
                horizontalLineToRelative(0.87f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(18.09f, 11f)
                lineTo(5.91f, 11f)
                lineToRelative(-1.84f, 5f)
                horizontalLineToRelative(15.85f)
                lineToRelative(-1.84f, -5f)
                close()
                moveTo(17.35f, 9f)
                lineToRelative(-2.58f, -7.02f)
                curveTo(14.34f, 0.81f, 13.25f, 0.04f, 12f, 0.04f)
                reflectiveCurveToRelative(-2.34f, 0.76f, -2.77f, 1.94f)
                lineToRelative(-2.58f, 7.02f)
                horizontalLineToRelative(10.7f)
                close()
            }
        }.also { _TrafficCone = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCheck: ImageVector? = null

val Icons.Ss.MapMarkerCheck: ImageVector
    get() = _MapMarkerCheck ?: UXIcon(name = "MapMarkerCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 2.94f)
                curveTo(17.18f, 1.05f, 14.67f, 0.01f, 12f, 0.01f)
                reflectiveCurveTo(6.82f, 1.05f, 4.93f, 2.94f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0.01f, 14.15f)
                lineToRelative(7.06f, 6.91f)
                lineToRelative(7.07f, -6.92f)
                curveToRelative(3.9f, -3.9f, 3.9f, -10.24f, 0f, -14.14f)
                close()
                moveTo(11.91f, 13.42f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.42f, -0.58f)
                lineToRelative(-2.78f, -2.7f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.79f, 2.71f)
                lineToRelative(5.81f, -5.7f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-5.79f, 5.71f)
                close()
            }
        }.also { _MapMarkerCheck = it}

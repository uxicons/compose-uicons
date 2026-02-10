package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCheck: ImageVector? = null

val Icons.Rs.MapMarkerCheck: ImageVector
    get() = _MapMarkerCheck ?: UXIcon(name = "MapMarkerCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23.99f)
                lineToRelative(-7.06f, -6.91f)
                curveToRelative(-3.91f, -3.91f, -3.91f, -10.25f, -0.01f, -14.15f)
                curveTo(6.82f, 1.05f, 9.33f, 0.01f, 12f, 0.01f)
                reflectiveCurveToRelative(5.18f, 1.04f, 7.07f, 2.93f)
                horizontalLineToRelative(0f)
                curveToRelative(3.9f, 3.9f, 3.9f, 10.24f, 0f, 14.14f)
                lineToRelative(-7.07f, 6.92f)
                close()
                moveTo(12f, 2.01f)
                curveToRelative(-2.14f, 0f, -4.15f, 0.83f, -5.66f, 2.34f)
                curveToRelative(-3.12f, 3.12f, -3.12f, 8.19f, 0f, 11.31f)
                lineToRelative(5.66f, 5.53f)
                lineToRelative(5.67f, -5.54f)
                curveToRelative(3.11f, -3.11f, 3.11f, -8.19f, -0.01f, -11.31f)
                curveToRelative(-1.51f, -1.51f, -3.52f, -2.34f, -5.66f, -2.34f)
                close()
                moveTo(11.91f, 13.42f)
                lineToRelative(5.79f, -5.71f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(-5.81f, 5.7f)
                lineToRelative(-2.79f, -2.71f)
                lineToRelative(-1.39f, 1.44f)
                lineToRelative(2.78f, 2.7f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.42f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.19f, 1.41f, -0.58f)
                close()
            }
        }.also { _MapMarkerCheck = it}

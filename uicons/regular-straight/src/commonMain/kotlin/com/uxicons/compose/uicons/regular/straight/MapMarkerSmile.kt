package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSmile: ImageVector? = null

val Icons.Rs.MapMarkerSmile: ImageVector
    get() = _MapMarkerSmile ?: UXIcon(name = "MapMarkerSmile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23.99f)
                lineToRelative(-7.06f, -6.91f)
                curveToRelative(-1.9f, -1.9f, -2.94f, -4.41f, -2.94f, -7.08f)
                reflectiveCurveToRelative(1.04f, -5.18f, 2.93f, -7.07f)
                curveTo(6.82f, 1.05f, 9.33f, 0.01f, 12f, 0.01f)
                reflectiveCurveToRelative(5.18f, 1.04f, 7.07f, 2.93f)
                horizontalLineToRelative(0f)
                curveToRelative(1.89f, 1.89f, 2.93f, 4.4f, 2.93f, 7.07f)
                reflectiveCurveToRelative(-1.04f, 5.18f, -2.93f, 7.07f)
                lineToRelative(-7.07f, 6.92f)
                close()
                moveTo(12f, 2.01f)
                curveToRelative(-2.14f, 0f, -4.15f, 0.83f, -5.66f, 2.34f)
                reflectiveCurveToRelative(-2.34f, 3.52f, -2.34f, 5.66f)
                reflectiveCurveToRelative(0.83f, 4.15f, 2.34f, 5.66f)
                lineToRelative(5.66f, 5.53f)
                lineToRelative(5.67f, -5.54f)
                curveToRelative(1.5f, -1.5f, 2.33f, -3.51f, 2.33f, -5.65f)
                reflectiveCurveToRelative(-0.83f, -4.15f, -2.34f, -5.66f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.51f, -1.51f, -3.52f, -2.34f, -5.66f, -2.34f)
                close()
                moveTo(16.71f, 12.05f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.88f, 0.88f, -2.05f, 1.36f, -3.29f, 1.36f)
                reflectiveCurveToRelative(-2.41f, -0.48f, -3.29f, -1.36f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(1.26f, 1.26f, 2.93f, 1.95f, 4.71f, 1.95f)
                reflectiveCurveToRelative(3.45f, -0.69f, 4.71f, -1.95f)
                close()
                moveTo(9.5f, 6.0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14.5f, 6.0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _MapMarkerSmile = it}

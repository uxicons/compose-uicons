package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSmile: ImageVector? = null

val Icons.Ss.MapMarkerSmile: ImageVector
    get() = _MapMarkerSmile ?: UXIcon(name = "MapMarkerSmile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 2.94f)
                curveTo(17.18f, 1.05f, 14.67f, 0.01f, 12f, 0.01f)
                reflectiveCurveTo(6.82f, 1.05f, 4.93f, 2.94f)
                curveToRelative(-1.89f, 1.89f, -2.93f, 4.4f, -2.93f, 7.07f)
                reflectiveCurveToRelative(1.04f, 5.18f, 2.94f, 7.08f)
                lineToRelative(7.06f, 6.91f)
                lineToRelative(7.07f, -6.92f)
                curveToRelative(1.89f, -1.89f, 2.93f, -4.4f, 2.93f, -7.07f)
                reflectiveCurveToRelative(-1.04f, -5.18f, -2.93f, -7.07f)
                close()
                moveTo(14.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(9.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-1.78f, 0f, -3.45f, -0.69f, -4.71f, -1.95f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(0.88f, 0.88f, 2.05f, 1.36f, 3.29f, 1.36f)
                reflectiveCurveToRelative(2.41f, -0.48f, 3.29f, -1.36f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(-1.26f, 1.26f, -2.93f, 1.95f, -4.71f, 1.95f)
                close()
            }
        }.also { _MapMarkerSmile = it}

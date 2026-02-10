package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSmile: ImageVector? = null

val Icons.Ts.MapMarkerSmile: ImageVector
    get() = _MapMarkerSmile ?: UXIcon(name = "MapMarkerSmile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 2.93f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                reflectiveCurveTo(6.82f, 1.04f, 4.93f, 2.93f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0.0f, 14.15f)
                lineToRelative(7.07f, 6.91f)
                lineToRelative(7.07f, -6.92f)
                curveToRelative(3.9f, -3.9f, 3.9f, -10.24f, 0f, -14.14f)
                close()
                moveTo(18.37f, 16.36f)
                lineToRelative(-6.37f, 6.23f)
                lineToRelative(-6.36f, -6.22f)
                curveToRelative(-3.51f, -3.51f, -3.51f, -9.22f, 0f, -12.73f)
                curveToRelative(1.7f, -1.7f, 3.96f, -2.64f, 6.36f, -2.64f)
                reflectiveCurveToRelative(4.66f, 0.94f, 6.36f, 2.64f)
                curveToRelative(3.51f, 3.51f, 3.51f, 9.22f, 0.0f, 12.72f)
                close()
                moveTo(15.65f, 11.49f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(-1.16f, 1.16f, -2.71f, 1.8f, -4.35f, 1.8f)
                reflectiveCurveToRelative(-3.19f, -0.64f, -4.35f, -1.8f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(0.97f, 0.97f, 2.27f, 1.51f, 3.65f, 1.51f)
                reflectiveCurveToRelative(2.67f, -0.54f, 3.65f, -1.51f)
                close()
                moveTo(8f, 8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(14f, 8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _MapMarkerSmile = it}

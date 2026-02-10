package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCross: ImageVector? = null

val Icons.Sc.MapMarkerCross: ImageVector
    get() = _MapMarkerCross ?: UXIcon(name = "MapMarkerCross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1.0f)
                curveTo(7.16f, 1.07f, 2.31f, 5.81f, 2.31f, 10.46f)
                curveToRelative(0f, 6.42f, 8.77f, 12.15f, 9.14f, 12.38f)
                curveToRelative(0.47f, 0.3f, 0.94f, 0.1f, 1.11f, -0.01f)
                curveToRelative(0.37f, -0.25f, 9.02f, -6.25f, 9.13f, -12.42f)
                curveToRelative(-0.15f, -4.77f, -4.85f, -9.34f, -9.71f, -9.41f)
                close()
                moveTo(14.43f, 11.61f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.02f, -1.02f)
                lineToRelative(-1.02f, 1.02f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.02f, -1.02f)
                lineToRelative(-1.02f, -1.02f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.02f, 1.02f)
                lineToRelative(1.02f, -1.02f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-1.02f, 1.02f)
                lineToRelative(1.02f, 1.02f)
                close()
            }
        }.also { _MapMarkerCross = it}

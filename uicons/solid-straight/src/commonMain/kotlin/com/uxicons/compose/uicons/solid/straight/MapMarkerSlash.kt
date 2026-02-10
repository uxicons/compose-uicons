package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSlash: ImageVector? = null

val Icons.Ss.MapMarkerSlash: ImageVector
    get() = _MapMarkerSlash ?: UXIcon(name = "MapMarkerSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.78f, 17.36f)
                lineToRelative(0.29f, -0.29f)
                curveToRelative(1.89f, -1.89f, 2.93f, -4.4f, 2.93f, -7.07f)
                reflectiveCurveToRelative(-1.04f, -5.18f, -2.93f, -7.07f)
                curveTo(17.18f, 1.05f, 14.67f, 0.01f, 12f, 0.01f)
                reflectiveCurveTo(6.82f, 1.05f, 4.93f, 2.94f)
                curveToRelative(-0.1f, 0.1f, -0.18f, 0.2f, -0.28f, 0.31f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-5.18f, -5.18f)
                close()
                moveTo(2.53f, 6.78f)
                lineToRelative(13.38f, 13.38f)
                lineToRelative(-3.92f, 3.83f)
                lineToRelative(-7.06f, -6.91f)
                curveToRelative(-2.78f, -2.78f, -3.61f, -6.79f, -2.4f, -10.31f)
                close()
            }
        }.also { _MapMarkerSlash = it}

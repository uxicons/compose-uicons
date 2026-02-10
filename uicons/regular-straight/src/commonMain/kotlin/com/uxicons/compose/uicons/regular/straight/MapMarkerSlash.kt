package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSlash: ImageVector? = null

val Icons.Rs.MapMarkerSlash: ImageVector
    get() = _MapMarkerSlash ?: UXIcon(name = "MapMarkerSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.78f, 17.36f)
                lineToRelative(0.29f, -0.29f)
                curveToRelative(1.89f, -1.89f, 2.93f, -4.4f, 2.93f, -7.07f)
                reflectiveCurveToRelative(-1.04f, -5.18f, -2.93f, -7.07f)
                curveTo(17.18f, 1.05f, 14.67f, 0.01f, 12f, 0.01f)
                reflectiveCurveTo(6.82f, 1.05f, 4.93f, 2.94f)
                curveToRelative(-0.1f, 0.1f, -0.19f, 0.2f, -0.28f, 0.3f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-5.18f, -5.18f)
                close()
                moveTo(6.34f, 4.35f)
                curveToRelative(1.51f, -1.51f, 3.52f, -2.34f, 5.66f, -2.34f)
                reflectiveCurveToRelative(4.14f, 0.83f, 5.66f, 2.34f)
                reflectiveCurveToRelative(2.34f, 3.52f, 2.34f, 5.66f)
                reflectiveCurveToRelative(-0.83f, 4.15f, -2.33f, 5.65f)
                lineToRelative(-0.3f, 0.29f)
                lineTo(6.06f, 4.65f)
                curveToRelative(0.09f, -0.1f, 0.18f, -0.2f, 0.28f, -0.3f)
                close()
                moveTo(14.5f, 18.75f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.92f, 3.83f)
                lineToRelative(-7.06f, -6.91f)
                curveToRelative(-2.78f, -2.78f, -3.61f, -6.79f, -2.4f, -10.31f)
                lineToRelative(1.62f, 1.62f)
                curveToRelative(-0.52f, 2.56f, 0.22f, 5.29f, 2.19f, 7.26f)
                lineToRelative(5.66f, 5.53f)
                lineToRelative(2.5f, -2.45f)
                close()
            }
        }.also { _MapMarkerSlash = it}

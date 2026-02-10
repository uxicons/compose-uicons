package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSlash: ImageVector? = null

val Icons.Ts.MapMarkerSlash: ImageVector
    get() = _MapMarkerSlash ?: UXIcon(name = "MapMarkerSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.42f, 17.71f)
                lineToRelative(0.65f, -0.64f)
                curveToRelative(3.9f, -3.9f, 3.9f, -10.24f, 0f, -14.14f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                reflectiveCurveTo(6.82f, 1.04f, 4.93f, 2.93f)
                curveToRelative(-0.22f, 0.22f, -0.42f, 0.44f, -0.62f, 0.68f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                lineTo(23.25f, 23.95f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-5.54f, -5.54f)
                close()
                moveTo(5.64f, 3.64f)
                curveToRelative(1.7f, -1.7f, 3.96f, -2.64f, 6.36f, -2.64f)
                reflectiveCurveToRelative(4.66f, 0.94f, 6.36f, 2.64f)
                curveToRelative(3.51f, 3.51f, 3.51f, 9.22f, 0.0f, 12.72f)
                lineToRelative(-0.66f, 0.64f)
                lineTo(5.02f, 4.32f)
                curveToRelative(0.19f, -0.23f, 0.4f, -0.46f, 0.61f, -0.68f)
                close()
                moveTo(15.56f, 19.1f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.27f, 4.18f)
                lineToRelative(-7.07f, -6.91f)
                curveToRelative(-2.9f, -2.9f, -3.67f, -7.18f, -2.21f, -10.82f)
                lineToRelative(0.78f, 0.78f)
                curveToRelative(-1.1f, 3.18f, -0.37f, 6.83f, 2.13f, 9.32f)
                lineToRelative(6.36f, 6.22f)
                lineToRelative(3.57f, -3.49f)
                close()
            }
        }.also { _MapMarkerSlash = it}

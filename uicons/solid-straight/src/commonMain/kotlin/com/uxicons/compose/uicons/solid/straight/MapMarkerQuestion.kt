package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerQuestion: ImageVector? = null

val Icons.Ss.MapMarkerQuestion: ImageVector
    get() = _MapMarkerQuestion ?: UXIcon(name = "MapMarkerQuestion") {
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
                moveTo(13f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13.93f, 11.51f)
                curveToRelative(-0.47f, 0.26f, -0.93f, 1.13f, -0.93f, 1.75f)
                verticalLineToRelative(0.74f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.74f)
                curveToRelative(0f, -1.19f, 0.73f, -2.83f, 1.96f, -3.5f)
                curveToRelative(0.76f, -0.42f, 1.16f, -1.25f, 1.0f, -2.12f)
                curveToRelative(-0.14f, -0.79f, -0.81f, -1.46f, -1.6f, -1.6f)
                curveToRelative(-0.6f, -0.11f, -1.2f, 0.05f, -1.66f, 0.43f)
                curveToRelative(-0.46f, 0.38f, -0.71f, 0.94f, -0.71f, 1.53f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.19f, 0.52f, -2.3f, 1.43f, -3.06f)
                curveToRelative(0.91f, -0.76f, 2.11f, -1.08f, 3.29f, -0.87f)
                curveToRelative(1.61f, 0.28f, 2.94f, 1.61f, 3.22f, 3.22f)
                curveToRelative(0.3f, 1.7f, -0.51f, 3.4f, -2.01f, 4.22f)
                close()
            }
        }.also { _MapMarkerQuestion = it}

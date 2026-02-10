package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoseReel: ImageVector? = null

val Icons.Ss.HoseReel: ImageVector
    get() = _HoseReel ?: UXIcon(name = "HoseReel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 4f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(11f, 16f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(13f, 11f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(23.99f, 16.14f)
                lineToRelative(-1.46f, 7.87f)
                horizontalLineToRelative(-3f)
                lineToRelative(-1.46f, -7.87f)
                curveToRelative(-0.1f, -0.59f, 0.36f, -1.14f, 0.96f, -1.14f)
                horizontalLineToRelative(0.97f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(2f, 6.04f, 2f, 11f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                curveToRelative(2.03f, 0f, 3.9f, -0.68f, 5.41f, -1.82f)
                lineToRelative(0.4f, 2.15f)
                curveToRelative(-1.69f, 1.05f, -3.67f, 1.68f, -5.81f, 1.68f)
                curveTo(4.93f, 22f, 0f, 17.07f, 0f, 11f)
                reflectiveCurveTo(4.93f, 0f, 11f, 0f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1.02f)
                curveToRelative(0.6f, 0f, 1.06f, 0.54f, 0.96f, 1.14f)
                close()
            }
        }.also { _HoseReel = it}

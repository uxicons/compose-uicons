package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoseReel: ImageVector? = null

val Icons.Rr.HoseReel: ImageVector
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
                moveTo(23.97f, 17.21f)
                lineToRelative(-1.3f, 6.0f)
                curveToRelative(-0.1f, 0.46f, -0.51f, 0.79f, -0.98f, 0.79f)
                horizontalLineToRelative(-1.39f)
                curveToRelative(-0.47f, 0f, -0.88f, -0.33f, -0.98f, -0.79f)
                lineToRelative(-1.3f, -5.99f)
                curveToRelative(-0.22f, -1.16f, 0.67f, -2.23f, 1.84f, -2.23f)
                horizontalLineToRelative(0.12f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(2f, 6.04f, 2f, 11f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                curveToRelative(1.25f, 0f, 2.46f, -0.25f, 3.6f, -0.75f)
                curveToRelative(0.51f, -0.23f, 1.1f, 0.01f, 1.32f, 0.52f)
                curveToRelative(0.22f, 0.51f, -0.01f, 1.1f, -0.52f, 1.32f)
                curveToRelative(-1.39f, 0.61f, -2.87f, 0.92f, -4.4f, 0.92f)
                curveTo(4.93f, 22f, 0f, 17.07f, 0f, 11f)
                reflectiveCurveTo(4.93f, 0f, 11f, 0f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(0.12f)
                curveToRelative(1.17f, 0f, 2.05f, 1.06f, 1.84f, 2.21f)
                close()
            }
        }.also { _HoseReel = it}

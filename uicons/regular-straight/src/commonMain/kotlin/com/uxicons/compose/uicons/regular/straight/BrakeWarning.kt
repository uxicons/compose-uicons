package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrakeWarning: ImageVector? = null

val Icons.Rs.BrakeWarning: ImageVector
    get() = _BrakeWarning ?: UXIcon(name = "BrakeWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.93f, 19.07f)
                lineToRelative(-1.41f, 1.41f)
                curveTo(-1.16f, 15.81f, -1.16f, 8.19f, 3.52f, 3.52f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0f, 14.14f)
                close()
                moveTo(20.48f, 3.52f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(3.9f, 3.9f, 3.9f, 10.24f, 0f, 14.14f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(4.68f, -4.68f, 4.68f, -12.29f, 0f, -16.97f)
                close()
                moveTo(12f, 13.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                close()
                moveTo(18f, 12f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
                moveTo(13f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                lineTo(13f, 7f)
                close()
            }
        }.also { _BrakeWarning = it}

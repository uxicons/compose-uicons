package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrakeWarning: ImageVector? = null

val Icons.Ss.BrakeWarning: ImageVector
    get() = _BrakeWarning ?: UXIcon(name = "BrakeWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.52f, 20.48f)
                curveTo(-1.16f, 15.81f, -1.16f, 8.19f, 3.52f, 3.52f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0f, 14.14f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(20.48f, 3.52f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(3.9f, 3.9f, 3.9f, 10.24f, 0f, 14.14f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(4.68f, -4.68f, 4.68f, -12.29f, 0f, -16.97f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                close()
                moveTo(11f, 13f)
                horizontalLineToRelative(2f)
                lineTo(13f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                close()
                moveTo(13.5f, 16f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _BrakeWarning = it}

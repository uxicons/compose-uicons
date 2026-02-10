package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrakeWarning: ImageVector? = null

val Icons.Bs.BrakeWarning: ImageVector
    get() = _BrakeWarning ?: UXIcon(name = "BrakeWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.64f, 18.36f)
                lineToRelative(-2.12f, 2.12f)
                curveTo(-1.16f, 15.81f, -1.16f, 8.19f, 3.52f, 3.52f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(-3.51f, 3.51f, -3.51f, 9.22f, 0f, 12.73f)
                close()
                moveTo(20.48f, 3.52f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(3.51f, 3.51f, 3.51f, 9.22f, 0f, 12.73f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(4.68f, -4.68f, 4.68f, -12.29f, 0f, -16.97f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(11f, 12f)
                horizontalLineToRelative(2f)
                lineTo(13f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                close()
                moveTo(13.5f, 15f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _BrakeWarning = it}

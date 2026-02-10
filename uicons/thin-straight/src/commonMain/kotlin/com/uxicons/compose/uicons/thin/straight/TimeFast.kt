package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeFast: ImageVector? = null

val Icons.Ts.TimeFast: ImageVector
    get() = _TimeFast ?: UXIcon(name = "TimeFast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 23f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                close()
                moveTo(8f, 19f)
                lineTo(0f, 19f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                close()
                moveTo(6f, 15f)
                lineTo(0f, 15f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                close()
                moveTo(11f, 5f)
                verticalLineToRelative(7.28f)
                lineToRelative(5.24f, 3.15f)
                lineToRelative(0.51f, -0.86f)
                lineToRelative(-4.76f, -2.85f)
                verticalLineToRelative(-6.72f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 0.34f, 0.02f, 0.67f, 0.05f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(-0.03f, -0.33f, -0.05f, -0.66f, -0.05f, -1f)
                curveTo(1f, 5.93f, 5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                verticalLineToRelative(1f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
            }
        }.also { _TimeFast = it}

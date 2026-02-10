package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeForward: ImageVector? = null

val Icons.Ts.TimeForward: ImageVector
    get() = _TimeForward ?: UXIcon(name = "TimeForward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 8f)
                horizontalLineToRelative(4.24f)
                curveToRelative(-1.64f, -4.19f, -5.73f, -7f, -10.24f, -7f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                curveToRelative(4.77f, 0f, 9.11f, 2.88f, 11f, 7.22f)
                lineTo(23f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.5f)
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
            }
        }.also { _TimeForward = it}

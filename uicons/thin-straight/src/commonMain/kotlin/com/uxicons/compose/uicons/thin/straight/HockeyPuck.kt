package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyPuck: ImageVector? = null

val Icons.Ts.HockeyPuck: ImageVector
    get() = _HockeyPuck ?: UXIcon(name = "HockeyPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.99f, 8.34f)
                curveToRelative(-0.12f, -4.61f, -5.45f, -8.34f, -11.99f, -8.34f)
                reflectiveCurveTo(0.13f, 3.73f, 0.01f, 8.34f)
                horizontalLineToRelative(-0.01f)
                verticalLineToRelative(7.32f)
                curveToRelative(0f, 4.6f, 5.38f, 8.34f, 12f, 8.34f)
                reflectiveCurveToRelative(12f, -3.74f, 12f, -8.34f)
                verticalLineToRelative(-7.32f)
                horizontalLineToRelative(-0.01f)
                close()
                moveTo(12f, 1f)
                curveToRelative(6.07f, 0f, 11f, 3.36f, 11f, 7.5f)
                reflectiveCurveToRelative(-4.93f, 7.5f, -11f, 7.5f)
                reflectiveCurveTo(1f, 12.64f, 1f, 8.5f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                close()
                moveTo(23f, 15.66f)
                curveToRelative(0f, 4.05f, -4.93f, 7.34f, -11f, 7.34f)
                reflectiveCurveTo(1f, 19.71f, 1f, 15.66f)
                verticalLineToRelative(-3.77f)
                curveToRelative(1.85f, 3.0f, 6.08f, 5.11f, 11f, 5.11f)
                reflectiveCurveToRelative(9.15f, -2.11f, 11f, -5.11f)
                verticalLineToRelative(3.77f)
                close()
            }
        }.also { _HockeyPuck = it}

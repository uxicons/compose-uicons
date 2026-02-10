package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyPuck: ImageVector? = null

val Icons.Tr.HockeyPuck: ImageVector
    get() = _HockeyPuck ?: UXIcon(name = "HockeyPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 3.81f, 0f, 8.5f)
                verticalLineToRelative(7.18f)
                curveToRelative(0f, 4.61f, 5.38f, 8.32f, 12f, 8.32f)
                reflectiveCurveToRelative(12f, -3.71f, 12f, -8.32f)
                verticalLineToRelative(-7.18f)
                curveTo(24f, 3.81f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 1f)
                curveToRelative(6.07f, 0f, 11f, 3.36f, 11f, 7.5f)
                reflectiveCurveToRelative(-4.93f, 7.5f, -11f, 7.5f)
                reflectiveCurveTo(1f, 12.64f, 1f, 8.5f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                close()
                moveTo(23f, 15.68f)
                curveToRelative(0f, 4.05f, -4.93f, 7.35f, -11f, 7.35f)
                reflectiveCurveTo(1f, 19.74f, 1f, 15.68f)
                verticalLineToRelative(-3.79f)
                curveToRelative(1.85f, 3.0f, 6.09f, 5.11f, 11f, 5.11f)
                reflectiveCurveToRelative(9.15f, -2.1f, 11f, -5.11f)
                verticalLineToRelative(3.79f)
                close()
            }
        }.also { _HockeyPuck = it}

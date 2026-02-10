package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyPuck: ImageVector? = null

val Icons.Bs.HockeyPuck: ImageVector
    get() = _HockeyPuck ?: UXIcon(name = "HockeyPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.5f)
                curveTo(24f, 3.73f, 18.73f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 3.73f, 0f, 8.5f)
                verticalLineToRelative(6.84f)
                curveTo(0f, 20.2f, 5.27f, 24f, 12f, 24f)
                reflectiveCurveToRelative(12f, -3.8f, 12f, -8.66f)
                close()
                moveTo(12f, 3f)
                curveToRelative(4.88f, 0f, 9f, 2.52f, 9f, 5.5f)
                reflectiveCurveTo(16.88f, 14f, 12f, 14f)
                reflectiveCurveTo(3f, 11.48f, 3f, 8.5f)
                reflectiveCurveTo(7.12f, 3f, 12f, 3f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.88f, 0f, -9f, -2.59f, -9f, -5.66f)
                lineTo(3f, 14.18f)
                arcTo(14.51f, 14.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                arcToRelative(14.51f, 14.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, -2.82f)
                verticalLineToRelative(1.16f)
                curveTo(21f, 18.41f, 16.88f, 21f, 12f, 21f)
                close()
            }
        }.also { _HockeyPuck = it}

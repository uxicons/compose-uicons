package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyPuck: ImageVector? = null

val Icons.Rr.HockeyPuck: ImageVector
    get() = _HockeyPuck ?: UXIcon(name = "HockeyPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 3.81f, 0f, 8.5f)
                verticalLineToRelative(7f)
                curveTo(0f, 20.19f, 5.38f, 24f, 12f, 24f)
                reflectiveCurveToRelative(12f, -3.81f, 12f, -8.5f)
                verticalLineToRelative(-7f)
                curveTo(24f, 3.81f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 2f)
                curveToRelative(5.51f, 0f, 10f, 2.92f, 10f, 6.5f)
                reflectiveCurveTo(17.51f, 15f, 12f, 15f)
                reflectiveCurveTo(2f, 12.08f, 2f, 8.5f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                close()
                moveTo(22f, 15.5f)
                curveToRelative(0f, 3.58f, -4.49f, 6.5f, -10f, 6.5f)
                reflectiveCurveTo(2f, 19.08f, 2f, 15.5f)
                lineTo(2f, 13.19f)
                arcTo(13.81f, 13.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                arcToRelative(13.81f, 13.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, -3.81f)
                close()
            }
        }.also { _HockeyPuck = it}

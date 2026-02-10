package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeasuringTape: ImageVector? = null

val Icons.Ss.MeasuringTape: ImageVector
    get() = _MeasuringTape ?: UXIcon(name = "MeasuringTape") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 1f)
                curveTo(4.25f, 1f, 0f, 3.02f, 0f, 5.5f)
                reflectiveCurveToRelative(4.25f, 4.5f, 9.5f, 4.5f)
                reflectiveCurveToRelative(9.5f, -2.02f, 9.5f, -4.5f)
                reflectiveCurveTo(14.75f, 1f, 9.5f, 1f)
                close()
                moveTo(9.5f, 6.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -0.45f, -2.5f, -1f)
                reflectiveCurveToRelative(1.12f, -1f, 2.5f, -1f)
                reflectiveCurveToRelative(2.5f, 0.45f, 2.5f, 1f)
                reflectiveCurveToRelative(-1.12f, 1f, -2.5f, 1f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.99f)
                curveToRelative(-5.08f, -0.12f, -9f, -2.58f, -9f, -5.7f)
                verticalLineToRelative(-7.98f)
                curveToRelative(2.02f, 1.67f, 5.41f, 2.7f, 9.5f, 2.7f)
                horizontalLineToRelative(14.5f)
                close()
            }
        }.also { _MeasuringTape = it}

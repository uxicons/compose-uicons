package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockOne: ImageVector? = null

val Icons.Bs.ClockOne: ImageVector
    get() = _ClockOne ?: UXIcon(name = "ClockOne") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 3f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 3f, 12f, 3f)
                close()
                moveTo(16.01f, 10.14f)
                lineToRelative(-2.25f, -1.98f)
                lineToRelative(-0.76f, 0.86f)
                verticalLineToRelative(-3.02f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(10.97f)
                lineToRelative(6.01f, -6.83f)
                close()
            }
        }.also { _ClockOne = it}

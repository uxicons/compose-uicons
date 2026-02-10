package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockEightThirty: ImageVector? = null

val Icons.Bs.ClockEightThirty: ImageVector
    get() = _ClockEightThirty ?: UXIcon(name = "ClockEightThirty") {
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
                moveTo(14f, 8.9f)
                lineToRelative(-6.26f, 3.63f)
                lineToRelative(1.5f, 2.6f)
                lineToRelative(1.76f, -1.02f)
                verticalLineToRelative(3.9f)
                horizontalLineToRelative(3f)
                lineTo(14f, 8.9f)
                close()
            }
        }.also { _ClockEightThirty = it}

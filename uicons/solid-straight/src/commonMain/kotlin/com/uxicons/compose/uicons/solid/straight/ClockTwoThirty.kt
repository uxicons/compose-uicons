package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTwoThirty: ImageVector? = null

val Icons.Ss.ClockTwoThirty: ImageVector
    get() = _ClockTwoThirty ?: UXIcon(name = "ClockTwoThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(13f, 12.57f)
                lineToRelative(3.82f, -2.23f)
                lineToRelative(-1.01f, -1.73f)
                lineToRelative(-4.81f, 2.81f)
                verticalLineToRelative(7.57f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.43f)
                close()
            }
        }.also { _ClockTwoThirty = it}

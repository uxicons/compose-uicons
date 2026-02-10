package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockEightThirty: ImageVector? = null

val Icons.Ss.ClockEightThirty: ImageVector
    get() = _ClockEightThirty ?: UXIcon(name = "ClockEightThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.26f)
                lineToRelative(-2.51f, 1.46f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(5.51f, -3.2f)
                verticalLineToRelative(8.73f)
                close()
            }
        }.also { _ClockEightThirty = it}

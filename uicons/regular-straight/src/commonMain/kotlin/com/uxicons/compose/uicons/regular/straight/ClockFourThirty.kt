package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockFourThirty: ImageVector? = null

val Icons.Rs.ClockFourThirty: ImageVector
    get() = _ClockFourThirty ?: UXIcon(name = "ClockFourThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                close()
                moveTo(13f, 13.74f)
                lineToRelative(2.81f, 1.64f)
                lineToRelative(1.01f, -1.73f)
                lineToRelative(-5.82f, -3.4f)
                verticalLineToRelative(8.74f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.26f)
                close()
            }
        }.also { _ClockFourThirty = it}

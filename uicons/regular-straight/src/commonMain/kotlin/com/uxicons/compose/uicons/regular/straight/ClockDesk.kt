package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockDesk: ImageVector? = null

val Icons.Rs.ClockDesk: ImageVector
    get() = _ClockDesk ?: UXIcon(name = "ClockDesk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.53f, 13.35f)
                lineToRelative(-1.06f, -1.7f)
                lineToRelative(3.53f, -2.21f)
                verticalLineToRelative(-4.45f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.55f)
                lineToRelative(-4.47f, 2.79f)
                close()
                moveTo(22f, 9.5f)
                verticalLineToRelative(14.5f)
                lineTo(2f, 24f)
                verticalLineToRelative(-14.5f)
                horizontalLineToRelative(0.01f)
                curveTo(2.27f, 4.22f, 6.65f, 0f, 12f, 0f)
                reflectiveCurveToRelative(9.73f, 4.22f, 9.99f, 9.5f)
                horizontalLineToRelative(0.01f)
                close()
                moveTo(4f, 10f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                reflectiveCurveTo(16.41f, 2f, 12f, 2f)
                reflectiveCurveTo(4f, 5.59f, 4f, 10f)
                close()
                moveTo(20f, 15.99f)
                curveToRelative(-1.83f, 2.43f, -4.73f, 4.01f, -8f, 4.01f)
                reflectiveCurveToRelative(-6.17f, -1.58f, -8f, -4.01f)
                verticalLineToRelative(6.01f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-6.01f)
                close()
            }
        }.also { _ClockDesk = it}

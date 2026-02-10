package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockDesk: ImageVector? = null

val Icons.Ts.ClockDesk: ImageVector
    get() = _ClockDesk ?: UXIcon(name = "ClockDesk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.26f, 13.43f)
                lineToRelative(-0.51f, -0.86f)
                lineToRelative(4.76f, -2.85f)
                verticalLineToRelative(-5.72f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6.28f)
                lineToRelative(-5.24f, 3.15f)
                close()
                moveTo(22f, 9.47f)
                verticalLineToRelative(14.53f)
                lineTo(2f, 24f)
                verticalLineToRelative(-14.53f)
                horizontalLineToRelative(0.01f)
                curveTo(2.29f, 4.2f, 6.66f, 0f, 12f, 0f)
                reflectiveCurveToRelative(9.71f, 4.2f, 9.99f, 9.47f)
                horizontalLineToRelative(0.01f)
                close()
                moveTo(3f, 10f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 1f, 12f, 1f)
                reflectiveCurveTo(3f, 5.04f, 3f, 10f)
                close()
                moveTo(21f, 14.36f)
                curveToRelative(-1.62f, 3.34f, -5.05f, 5.64f, -9f, 5.64f)
                reflectiveCurveToRelative(-7.38f, -2.31f, -9f, -5.64f)
                verticalLineToRelative(8.64f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-8.64f)
                close()
            }
        }.also { _ClockDesk = it}

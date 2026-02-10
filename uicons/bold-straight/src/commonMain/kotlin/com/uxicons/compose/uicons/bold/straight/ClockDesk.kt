package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockDesk: ImageVector? = null

val Icons.Bs.ClockDesk: ImageVector
    get() = _ClockDesk ?: UXIcon(name = "ClockDesk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(6.49f, 0f, 2f, 4.49f, 2f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-14f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                close()
                moveTo(12f, 3f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                close()
                moveTo(5f, 21f)
                verticalLineToRelative(-3.87f)
                curveToRelative(1.8f, 1.77f, 4.28f, 2.87f, 7f, 2.87f)
                reflectiveCurveToRelative(5.2f, -1.09f, 7f, -2.87f)
                verticalLineToRelative(3.87f)
                lineTo(5f, 21f)
                close()
                moveTo(9.24f, 13.3f)
                lineToRelative(-1.49f, -2.6f)
                lineToRelative(2.74f, -1.57f)
                verticalLineToRelative(-4.13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5.87f)
                lineToRelative(-4.26f, 2.43f)
                close()
            }
        }.also { _ClockDesk = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarSwap: ImageVector? = null

val Icons.Bs.CalendarSwap: ImageVector
    get() = _CalendarSwap ?: UXIcon(name = "CalendarSwap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 2f)
                horizontalLineToRelative(-2.5f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(15f, 2f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 2f)
                lineTo(3.5f, 2f)
                curveTo(1.57f, 2f, 0f, 3.57f, 0f, 5.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 21f)
                lineTo(3f, 9f)
                lineTo(21f, 9f)
                verticalLineToRelative(12f)
                lineTo(3f, 21f)
                close()
                moveTo(12.96f, 9.79f)
                lineToRelative(4.21f, 4.21f)
                lineTo(7f, 14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.34f)
                lineToRelative(-0.79f, -0.79f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(6.84f, 16f)
                horizontalLineToRelative(10.16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.34f)
                lineToRelative(0.79f, 0.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-4.21f, -4.21f)
                close()
            }
        }.also { _CalendarSwap = it}

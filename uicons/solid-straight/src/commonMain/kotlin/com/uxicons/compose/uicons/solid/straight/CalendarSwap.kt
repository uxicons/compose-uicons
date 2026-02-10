package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarSwap: ImageVector? = null

val Icons.Ss.CalendarSwap: ImageVector
    get() = _CalendarSwap ?: UXIcon(name = "CalendarSwap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                lineTo(8f, 2f)
                horizontalLineToRelative(8f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                lineTo(18f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                lineTo(0f, 8f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(14f)
                lineTo(0f, 24f)
                lineTo(0f, 10f)
                lineTo(24f, 10f)
                close()
                moveTo(17f, 18.21f)
                lineTo(6.84f, 18.21f)
                lineToRelative(4.21f, 4.21f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-0.79f, -0.79f)
                horizontalLineToRelative(5.34f)
                verticalLineToRelative(-2f)
                close()
                moveTo(17.16f, 16.21f)
                lineToRelative(-4.21f, -4.21f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(0.79f, 0.79f)
                lineTo(7f, 14.21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10.16f)
                close()
            }
        }.also { _CalendarSwap = it}

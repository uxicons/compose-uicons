package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarShiftSwap: ImageVector? = null

val Icons.Bs.CalendarShiftSwap: ImageVector
    get() = _CalendarShiftSwap ?: UXIcon(name = "CalendarShiftSwap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3f)
                lineToRelative(3.79f, -3.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(3.79f, 3.71f)
                close()
                moveTo(3.79f, 8.71f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(3.79f, -3.71f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineTo(0f, 5f)
                lineToRelative(3.79f, 3.71f)
                close()
                moveTo(24f, 3f)
                lineTo(24f, 13f)
                lineTo(10f, 13f)
                lineTo(10f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(21f, 10f)
                lineTo(21f, 5f)
                lineTo(13f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(8f)
                close()
                moveTo(11f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                lineTo(3f, 11f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(10f)
                lineTo(14f, 24f)
                lineTo(14f, 15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _CalendarShiftSwap = it}

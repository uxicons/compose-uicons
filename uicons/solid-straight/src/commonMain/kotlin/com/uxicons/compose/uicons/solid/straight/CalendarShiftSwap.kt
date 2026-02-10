package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarShiftSwap: ImageVector? = null

val Icons.Ss.CalendarShiftSwap: ImageVector
    get() = _CalendarShiftSwap ?: UXIcon(name = "CalendarShiftSwap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                verticalLineToRelative(1f)
                lineTo(11f, 3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(11f, 12f)
                horizontalLineToRelative(13f)
                lineTo(24f, 5f)
                lineTo(11f, 5f)
                verticalLineToRelative(7f)
                close()
                moveTo(18.59f, 15.58f)
                lineToRelative(-2.51f, 2.51f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.5f, -1.51f)
                verticalLineToRelative(3.01f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3.0f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.51f, -2.51f)
                curveToRelative(-0.77f, -0.77f, -2.04f, -0.77f, -2.81f, 0f)
                close()
                moveTo(4f, 9f)
                curveToRelative(0.51f, 0f, 1.02f, -0.19f, 1.41f, -0.58f)
                lineToRelative(2.51f, -2.51f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.5f, 1.51f)
                lineTo(5f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.08f, -0.73f, 0.32f, -1.42f, 0.71f, -2f)
                horizontalLineToRelative(-3.76f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3.0f)
                lineToRelative(-1.5f, -1.5f)
                lineTo(0.09f, 5.91f)
                lineToRelative(2.51f, 2.51f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                close()
                moveTo(9f, 12f)
                lineTo(2.5f, 12f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(9f, 15f)
                verticalLineToRelative(-3f)
                close()
                moveTo(0f, 24f)
                lineTo(13f, 24f)
                verticalLineToRelative(-7f)
                lineTo(0f, 17f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _CalendarShiftSwap = it}

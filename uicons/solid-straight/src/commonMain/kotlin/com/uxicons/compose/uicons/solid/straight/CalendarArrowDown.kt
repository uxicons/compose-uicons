package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarArrowDown: ImageVector? = null

val Icons.Ss.CalendarArrowDown: ImageVector
    get() = _CalendarArrowDown ?: UXIcon(name = "CalendarArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                lineTo(0f, 8f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(14f)
                lineTo(0f, 24f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(24f)
                close()
                moveTo(16.48f, 17.44f)
                lineToRelative(-1.39f, -1.44f)
                lineToRelative(-2.08f, 2.02f)
                verticalLineToRelative(-5.02f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.03f)
                lineToRelative(-2.08f, -2.02f)
                lineToRelative(-1.4f, 1.43f)
                lineToRelative(3.07f, 2.98f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                curveToRelative(0.51f, 0f, 1.01f, -0.19f, 1.39f, -0.57f)
                lineToRelative(3.08f, -2.99f)
                close()
            }
        }.also { _CalendarArrowDown = it}

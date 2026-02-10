package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarArrowUp: ImageVector? = null

val Icons.Ss.CalendarArrowUp: ImageVector
    get() = _CalendarArrowUp ?: UXIcon(name = "CalendarArrowUp") {
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
                moveTo(16.5f, 16.68f)
                lineToRelative(-3.09f, -3.1f)
                curveToRelative(-0.78f, -0.77f, -2.04f, -0.77f, -2.81f, 0f)
                lineToRelative(-3.08f, 3.08f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.08f, -2.09f)
                verticalLineToRelative(5.01f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.0f)
                lineToRelative(2.08f, 2.09f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _CalendarArrowUp = it}

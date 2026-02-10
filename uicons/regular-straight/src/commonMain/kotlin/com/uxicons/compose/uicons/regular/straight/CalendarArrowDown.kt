package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarArrowDown: ImageVector? = null

val Icons.Rs.CalendarArrowDown: ImageVector
    get() = _CalendarArrowDown ?: UXIcon(name = "CalendarArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 4f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                lineTo(2f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 22f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(12f)
                lineTo(2f, 22f)
                close()
                moveTo(15.08f, 15.0f)
                lineToRelative(1.39f, 1.44f)
                lineToRelative(-3.08f, 2.99f)
                curveToRelative(-0.38f, 0.38f, -0.89f, 0.57f, -1.39f, 0.57f)
                curveToRelative(-0.51f, 0f, -1.02f, -0.19f, -1.41f, -0.58f)
                lineToRelative(-3.07f, -2.98f)
                lineToRelative(1.4f, -1.43f)
                lineToRelative(2.08f, 2.02f)
                verticalLineToRelative(-5.03f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.02f)
                lineToRelative(2.08f, -2.02f)
                close()
            }
        }.also { _CalendarArrowDown = it}

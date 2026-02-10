package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarStar: ImageVector? = null

val Icons.Rs.CalendarStar: ImageVector
    get() = _CalendarStar ?: UXIcon(name = "CalendarStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2.03f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 0.03f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 0.03f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5.03f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 4.03f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                lineTo(2f, 8.03f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 22.03f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(12f)
                lineTo(2f, 22.03f)
                close()
                moveTo(16.82f, 15.36f)
                lineToRelative(-2.41f, 1.78f)
                lineToRelative(0.92f, 2.82f)
                lineToRelative(-0.88f, 0.6f)
                lineToRelative(-2.44f, -1.65f)
                lineToRelative(-2.46f, 1.67f)
                lineToRelative(-0.82f, -0.63f)
                lineToRelative(0.87f, -2.83f)
                lineToRelative(-2.36f, -1.71f)
                lineToRelative(0.16f, -0.87f)
                horizontalLineToRelative(3.1f)
                lineToRelative(0.89f, -3.1f)
                horizontalLineToRelative(1.17f)
                lineToRelative(0.94f, 3.1f)
                horizontalLineToRelative(3.09f)
                lineToRelative(0.23f, 0.83f)
                close()
            }
        }.also { _CalendarStar = it}

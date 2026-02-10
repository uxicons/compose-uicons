package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarStar: ImageVector? = null

val Icons.Ss.CalendarStar: ImageVector
    get() = _CalendarStar ?: UXIcon(name = "CalendarStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 24f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13f)
                lineTo(0f, 11f)
                verticalLineToRelative(13f)
                close()
                moveTo(7.44f, 15.5f)
                horizontalLineToRelative(3.1f)
                lineToRelative(0.89f, -3.1f)
                horizontalLineToRelative(1.17f)
                lineToRelative(0.94f, 3.1f)
                horizontalLineToRelative(3.09f)
                lineToRelative(0.23f, 0.83f)
                lineToRelative(-2.41f, 1.78f)
                lineToRelative(0.92f, 2.82f)
                lineToRelative(-0.88f, 0.6f)
                lineToRelative(-2.44f, -1.65f)
                lineToRelative(-2.46f, 1.67f)
                lineToRelative(-0.82f, -0.63f)
                lineToRelative(0.87f, -2.83f)
                lineToRelative(-2.36f, -1.71f)
                lineToRelative(0.16f, -0.87f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(4f)
                lineTo(0f, 9f)
                verticalLineToRelative(-4f)
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
                close()
            }
        }.also { _CalendarStar = it}

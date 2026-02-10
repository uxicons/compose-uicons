package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarStar: ImageVector? = null

val Icons.Ts.CalendarStar: ImageVector
    get() = _CalendarStar ?: UXIcon(name = "CalendarStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 2f)
                horizontalLineToRelative(-3.5f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                lineTo(7f, 2f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 3f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(1f, 8f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 23f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(14f)
                lineTo(1f, 23f)
                close()
                moveTo(16.95f, 13.99f)
                horizontalLineToRelative(-3.1f)
                lineToRelative(-0.94f, -3.1f)
                horizontalLineToRelative(-1.91f)
                lineToRelative(-0.89f, 3.1f)
                horizontalLineToRelative(-3.14f)
                lineToRelative(-0.3f, 1.59f)
                lineToRelative(2.33f, 1.69f)
                lineToRelative(-0.87f, 2.82f)
                lineToRelative(1.38f, 1.06f)
                lineToRelative(2.48f, -1.68f)
                lineToRelative(2.44f, 1.65f)
                lineToRelative(1.47f, -1.01f)
                lineToRelative(-0.92f, -2.83f)
                lineToRelative(2.39f, -1.77f)
                lineToRelative(-0.41f, -1.53f)
                close()
                moveTo(13.79f, 16.92f)
                lineToRelative(0.91f, 2.81f)
                lineToRelative(-0.29f, 0.2f)
                lineToRelative(-2.44f, -1.65f)
                lineToRelative(-2.44f, 1.65f)
                lineToRelative(-0.26f, -0.2f)
                lineToRelative(0.87f, -2.84f)
                lineToRelative(-2.39f, -1.74f)
                lineToRelative(0.03f, -0.15f)
                horizontalLineToRelative(3.06f)
                lineToRelative(0.89f, -3.1f)
                horizontalLineToRelative(0.42f)
                lineToRelative(0.94f, 3.1f)
                horizontalLineToRelative(3.07f)
                lineToRelative(0.04f, 0.14f)
                lineToRelative(-2.42f, 1.79f)
                close()
            }
        }.also { _CalendarStar = it}

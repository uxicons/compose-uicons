package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarHeart: ImageVector? = null

val Icons.Ts.CalendarHeart: ImageVector
    get() = _CalendarHeart ?: UXIcon(name = "CalendarHeart") {
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
                moveTo(14.25f, 12f)
                curveToRelative(-0.95f, 0f, -1.76f, 0.43f, -2.25f, 1.13f)
                curveToRelative(-0.49f, -0.69f, -1.3f, -1.13f, -2.25f, -1.13f)
                curveToRelative(-1.52f, 0f, -2.75f, 1.31f, -2.75f, 2.93f)
                curveToRelative(0f, 2.79f, 4.54f, 5.74f, 4.73f, 5.87f)
                lineToRelative(0.27f, 0.17f)
                lineToRelative(0.27f, -0.17f)
                curveToRelative(0.19f, -0.12f, 4.73f, -3.08f, 4.73f, -5.87f)
                curveToRelative(0f, -1.62f, -1.23f, -2.93f, -2.75f, -2.93f)
                close()
                moveTo(12f, 19.77f)
                curveToRelative(-1.33f, -0.91f, -4f, -3.11f, -4f, -4.84f)
                curveToRelative(0f, -1.06f, 0.79f, -1.93f, 1.75f, -1.93f)
                curveToRelative(1.01f, 0f, 1.75f, 0.74f, 1.75f, 1.75f)
                verticalLineToRelative(0.25f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.25f)
                curveToRelative(0f, -1.01f, 0.74f, -1.75f, 1.75f, -1.75f)
                curveToRelative(0.96f, 0f, 1.75f, 0.87f, 1.75f, 1.93f)
                curveToRelative(0f, 1.73f, -2.67f, 3.93f, -4f, 4.84f)
                close()
            }
        }.also { _CalendarHeart = it}

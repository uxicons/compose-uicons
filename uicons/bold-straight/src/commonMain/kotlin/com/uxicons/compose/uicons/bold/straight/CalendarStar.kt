package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarStar: ImageVector? = null

val Icons.Bs.CalendarStar: ImageVector
    get() = _CalendarStar ?: UXIcon(name = "CalendarStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 2f)
                horizontalLineToRelative(-2.5f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(12f)
                lineTo(3f, 21f)
                close()
                moveTo(13.42f, 13.51f)
                horizontalLineToRelative(2.88f)
                verticalLineToRelative(1.26f)
                lineToRelative(-2.04f, 1.18f)
                lineToRelative(0.84f, 2.57f)
                lineToRelative(-1.0f, 0.7f)
                lineToRelative(-2.09f, -1.61f)
                lineToRelative(-2.11f, 1.63f)
                lineToRelative(-0.97f, -0.73f)
                lineToRelative(0.83f, -2.58f)
                lineToRelative(-2.05f, -1.14f)
                verticalLineToRelative(-1.27f)
                horizontalLineToRelative(2.9f)
                lineToRelative(0.76f, -2.91f)
                horizontalLineToRelative(1.29f)
                lineToRelative(0.76f, 2.91f)
                close()
            }
        }.also { _CalendarStar = it}

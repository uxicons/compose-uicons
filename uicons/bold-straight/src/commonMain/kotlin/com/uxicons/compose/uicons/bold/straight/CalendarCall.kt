package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarCall: ImageVector? = null

val Icons.Bs.CalendarCall: ImageVector
    get() = _CalendarCall ?: UXIcon(name = "CalendarCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5.5f)
                verticalLineToRelative(13.5f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(-7.0f)
                lineTo(3f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(9.2f)
                curveToRelative(0.86f, 1.14f, 1.92f, 2.17f, 3.07f, 3f)
                lineTo(0f, 24f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.5f)
                lineTo(6f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                lineTo(15f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.29f, 19.11f)
                lineToRelative(-1.77f, 1.77f)
                curveToRelative(-2.03f, -0.77f, -3.52f, -2.21f, -4.4f, -4.4f)
                lineToRelative(1.77f, -1.77f)
                lineToRelative(-2.71f, -2.71f)
                lineToRelative(-1.38f, 1.38f)
                curveToRelative(-0.54f, 0.54f, -0.8f, 1.25f, -0.8f, 1.96f)
                curveToRelative(0f, 3.91f, 5.03f, 8.66f, 8.66f, 8.66f)
                curveToRelative(0.71f, 0f, 1.42f, -0.26f, 1.96f, -0.8f)
                lineToRelative(1.38f, -1.38f)
                lineToRelative(-2.71f, -2.71f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _CalendarCall = it}

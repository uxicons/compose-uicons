package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarCall: ImageVector? = null

val Icons.Ss.CalendarCall: ImageVector
    get() = _CalendarCall ?: UXIcon(name = "CalendarCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.29f, 19.11f)
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
                horizontalLineToRelative(-0.0f)
                close()
                moveTo(0f, 8f)
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
                moveTo(15.0f, 10f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(9.0f)
                lineToRelative(-9.0f, -9.0f)
                close()
                moveTo(15.27f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(13.34f)
                lineToRelative(-1.96f, 1.96f)
                curveToRelative(-0.89f, 0.89f, -1.38f, 2.09f, -1.38f, 3.37f)
                curveToRelative(0f, 3.1f, 2.33f, 6.55f, 5.27f, 8.66f)
                close()
            }
        }.also { _CalendarCall = it}

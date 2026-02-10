package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarCall: ImageVector? = null

val Icons.Ts.CalendarCall: ImageVector
    get() = _CalendarCall ?: UXIcon(name = "CalendarCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 23f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(8.66f)
                lineToRelative(1f, 1f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
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
                horizontalLineToRelative(14.66f)
                curveToRelative(-0.44f, -0.31f, -0.87f, -0.64f, -1.28f, -1f)
                lineTo(1f, 23f)
                close()
                moveTo(2.5f, 3f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(1f, 8f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(20.84f, 18.49f)
                lineToRelative(-1.57f, 1.57f)
                curveToRelative(-1.58f, -0.7f, -2.67f, -1.79f, -3.33f, -3.32f)
                lineToRelative(1.58f, -1.58f)
                lineToRelative(-3.19f, -3.19f)
                lineToRelative(-1.45f, 1.45f)
                curveToRelative(-0.56f, 0.56f, -0.87f, 1.32f, -0.87f, 2.15f)
                curveToRelative(0f, 3.7f, 4.73f, 8.43f, 8.43f, 8.43f)
                curveToRelative(0.82f, 0f, 1.58f, -0.31f, 2.15f, -0.88f)
                lineToRelative(1.45f, -1.45f)
                lineToRelative(-3.19f, -3.19f)
                close()
                moveTo(21.87f, 22.42f)
                curveToRelative(-0.37f, 0.38f, -0.89f, 0.58f, -1.44f, 0.58f)
                curveToRelative(-3.19f, 0f, -7.43f, -4.24f, -7.43f, -7.43f)
                curveToRelative(0f, -0.55f, 0.21f, -1.06f, 0.58f, -1.44f)
                lineToRelative(0.74f, -0.74f)
                lineToRelative(1.77f, 1.77f)
                lineToRelative(-1.33f, 1.33f)
                lineToRelative(0.12f, 0.3f)
                curveToRelative(0.77f, 2.03f, 2.22f, 3.48f, 4.31f, 4.32f)
                lineToRelative(0.31f, 0.12f)
                lineToRelative(1.34f, -1.34f)
                lineToRelative(1.77f, 1.78f)
                lineToRelative(-0.74f, 0.74f)
                close()
            }
        }.also { _CalendarCall = it}

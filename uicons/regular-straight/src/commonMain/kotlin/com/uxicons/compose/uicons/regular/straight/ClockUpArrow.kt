package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockUpArrow: ImageVector? = null

val Icons.Rs.ClockUpArrow: ImageVector
    get() = _ClockUpArrow ?: UXIcon(name = "ClockUpArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.44f)
                lineToRelative(-4.89f, 2.99f)
                lineToRelative(-1.04f, -1.71f)
                lineToRelative(3.93f, -2.4f)
                verticalLineToRelative(-5.32f)
                close()
                moveTo(2f, 12f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                curveToRelative(3.56f, 0f, 6.88f, 1.92f, 8.66f, 5.0f)
                curveToRelative(0.71f, 1.22f, 1.13f, 2.59f, 1.27f, 4.0f)
                horizontalLineToRelative(2f)
                curveToRelative(-0.15f, -1.76f, -0.66f, -3.47f, -1.54f, -5.0f)
                curveTo(20.25f, 2.3f, 16.27f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 3.08f, 1.16f, 6.0f, 3.27f, 8.24f)
                curveToRelative(0.45f, 0.47f, 0.94f, 0.9f, 1.44f, 1.29f)
                lineToRelative(1.42f, -1.42f)
                curveToRelative(-0.5f, -0.36f, -0.98f, -0.77f, -1.41f, -1.24f)
                curveToRelative(-1.76f, -1.86f, -2.73f, -4.3f, -2.73f, -6.86f)
                close()
                moveTo(22f, 13f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.57f)
                lineToRelative(-4.69f, 4.69f)
                lineToRelative(-3.25f, -3.25f)
                lineToRelative(-6.06f, 6.06f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.65f, -4.65f)
                lineToRelative(3.25f, 3.25f)
                lineToRelative(6.12f, -6.12f)
                verticalLineToRelative(2.6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _ClockUpArrow = it}

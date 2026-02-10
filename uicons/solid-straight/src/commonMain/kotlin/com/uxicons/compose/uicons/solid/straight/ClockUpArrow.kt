package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockUpArrow: ImageVector? = null

val Icons.Ss.ClockUpArrow: ImageVector
    get() = _ClockUpArrow ?: UXIcon(name = "ClockUpArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 17f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(7.93f)
                curveToRelative(-0.15f, -1.76f, -0.66f, -3.47f, -1.54f, -5.0f)
                curveTo(19.45f, 0.92f, 13.05f, -1.52f, 7.19f, 1.0f)
                curveTo(3.73f, 2.49f, 1.13f, 5.59f, 0.31f, 9.27f)
                curveToRelative(-0.91f, 4.03f, 0.24f, 8.08f, 2.97f, 10.97f)
                curveToRelative(0.45f, 0.47f, 0.94f, 0.9f, 1.44f, 1.29f)
                lineToRelative(6.49f, -6.49f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f)
                lineToRelative(1.96f, 1.97f)
                close()
                moveTo(7.07f, 13.72f)
                lineToRelative(3.93f, -2.4f)
                verticalLineToRelative(-5.32f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.44f)
                lineToRelative(-4.89f, 2.99f)
                lineToRelative(-1.04f, -1.71f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.6f)
                lineToRelative(-6.12f, 6.12f)
                lineToRelative(-3.25f, -3.25f)
                lineToRelative(-4.65f, 4.65f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(6.06f, -6.06f)
                lineToRelative(3.25f, 3.25f)
                lineToRelative(4.69f, -4.69f)
                horizontalLineToRelative(-2.57f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _ClockUpArrow = it}

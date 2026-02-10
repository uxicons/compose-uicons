package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockUpArrow: ImageVector? = null

val Icons.Ts.ClockUpArrow: ImageVector
    get() = _ClockUpArrow ?: UXIcon(name = "ClockUpArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.1f, 19.65f)
                curveToRelative(0.54f, 0.55f, 1.12f, 1.04f, 1.74f, 1.46f)
                lineToRelative(-0.72f, 0.72f)
                curveToRelative(-0.62f, -0.43f, -1.2f, -0.93f, -1.74f, -1.48f)
                curveTo(1.2f, 18.1f, 0f, 15.13f, 0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                curveToRelative(5.42f, 0f, 10.18f, 3.65f, 11.59f, 8.87f)
                curveToRelative(0.22f, 0.8f, 0.32f, 1.63f, 0.37f, 2.46f)
                curveToRelative(-0.32f, -0.15f, -0.66f, -0.25f, -1.02f, -0.29f)
                curveToRelative(-0.06f, -0.65f, -0.15f, -1.29f, -0.32f, -1.91f)
                curveToRelative(-1.29f, -4.79f, -5.66f, -8.13f, -10.62f, -8.13f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                curveToRelative(0f, 2.87f, 1.1f, 5.59f, 3.1f, 7.65f)
                close()
                moveTo(11.5f, 11.6f)
                lineToRelative(-4.17f, 2.55f)
                lineToRelative(0.52f, 0.85f)
                lineToRelative(4.65f, -2.84f)
                verticalLineToRelative(-6.16f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5.6f)
                close()
                moveTo(22.5f, 13.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.28f)
                lineToRelative(-6.4f, 6.4f)
                lineToRelative(-3.25f, -3.25f)
                lineToRelative(-5.99f, 5.99f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(5.28f, -5.28f)
                lineToRelative(3.25f, 3.25f)
                lineToRelative(7.12f, -7.12f)
                verticalLineToRelative(4.31f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ClockUpArrow = it}

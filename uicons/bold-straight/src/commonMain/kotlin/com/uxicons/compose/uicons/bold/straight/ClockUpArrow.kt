package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockUpArrow: ImageVector? = null

val Icons.Bs.ClockUpArrow: ImageVector
    get() = _ClockUpArrow ?: UXIcon(name = "ClockUpArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6.72f)
                lineToRelative(-5.13f, 3.13f)
                lineToRelative(-1.56f, -2.56f)
                lineToRelative(3.69f, -2.26f)
                verticalLineToRelative(-5.04f)
                close()
                moveTo(4.33f, 16.71f)
                curveToRelative(-0.87f, -1.41f, -1.33f, -3.04f, -1.33f, -4.71f)
                curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
                curveToRelative(2.77f, 0f, 5.35f, 1.25f, 7.07f, 3.43f)
                curveToRelative(1.05f, 1.34f, 1.69f, 2.9f, 1.87f, 4.57f)
                horizontalLineToRelative(3.02f)
                curveToRelative(-0.19f, -2.35f, -1.06f, -4.56f, -2.53f, -6.43f)
                curveTo(19.13f, 1.67f, 15.7f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 2.23f, 0.61f, 4.4f, 1.78f, 6.29f)
                curveToRelative(0.7f, 1.13f, 1.57f, 2.1f, 2.55f, 2.92f)
                lineToRelative(2.13f, -2.13f)
                curveToRelative(-0.82f, -0.65f, -1.55f, -1.44f, -2.12f, -2.37f)
                close()
                moveTo(22.91f, 13f)
                horizontalLineToRelative(-4.91f)
                lineToRelative(1.93f, 1.93f)
                lineToRelative(-4.06f, 4.05f)
                lineToRelative(-3.25f, -3.25f)
                lineToRelative(-6.19f, 6.2f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.07f, -4.07f)
                lineToRelative(3.25f, 3.25f)
                lineToRelative(6.18f, -6.18f)
                lineToRelative(1.95f, 1.95f)
                verticalLineToRelative(-4.91f)
                curveToRelative(0f, -0.6f, -0.49f, -1.09f, -1.09f, -1.09f)
                close()
            }
        }.also { _ClockUpArrow = it}

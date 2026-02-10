package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockFuturePast: ImageVector? = null

val Icons.Ss.ClockFuturePast: ImageVector
    get() = _ClockFuturePast ?: UXIcon(name = "ClockFuturePast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 6f)
                lineToRelative(0f, 6.53f)
                lineToRelative(5.06f, 3.06f)
                lineToRelative(1.03f, -1.71f)
                lineToRelative(-4.09f, -2.48f)
                lineToRelative(0f, -5.4f)
                lineToRelative(-2f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 2f)
                verticalLineToRelative(3.36f)
                curveTo(19.81f, 2.04f, 16.11f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                horizontalLineTo(2f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                curveToRelative(3.64f, 0f, 6.9f, 1.92f, 8.66f, 5f)
                horizontalLineToRelative(-3.67f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(2f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22f)
                curveToRelative(-3.64f, 0f, -6.9f, -1.92f, -8.66f, -5f)
                horizontalLineToRelative(3.67f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineTo(2f)
                verticalLineToRelative(-3.36f)
                curveToRelative(2.19f, 3.32f, 5.89f, 5.36f, 10f, 5.36f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _ClockFuturePast = it}

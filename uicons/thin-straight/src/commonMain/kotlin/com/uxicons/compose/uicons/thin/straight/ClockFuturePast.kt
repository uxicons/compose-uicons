package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockFuturePast: ImageVector? = null

val Icons.Ts.ClockFuturePast: ImageVector
    get() = _ClockFuturePast ?: UXIcon(name = "ClockFuturePast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                lineTo(24f, 7.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.24f)
                curveToRelative(-1.64f, -4.19f, -5.73f, -7f, -10.24f, -7f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                lineTo(0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                curveToRelative(4.77f, 0f, 9.11f, 2.88f, 11f, 7.22f)
                lineTo(23f, 3f)
                horizontalLineToRelative(1f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-4.51f, 0f, -8.61f, -2.81f, -10.24f, -7f)
                lineTo(6f, 16f)
                verticalLineToRelative(-1f)
                lineTo(1.5f, 15f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                lineTo(1f, 21f)
                verticalLineToRelative(-4.22f)
                curveToRelative(1.89f, 4.34f, 6.23f, 7.22f, 11f, 7.22f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 6.07f, -4.93f, 11f, -11f, 11f)
                close()
                moveTo(11f, 5f)
                verticalLineToRelative(7.28f)
                lineToRelative(5.24f, 3.15f)
                lineToRelative(0.51f, -0.86f)
                lineToRelative(-4.76f, -2.85f)
                lineTo(12f, 5f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _ClockFuturePast = it}

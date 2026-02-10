package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockFuturePast: ImageVector? = null

val Icons.Bs.ClockFuturePast: ImageVector
    get() = _ClockFuturePast ?: UXIcon(name = "ClockFuturePast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 12f)
                lineTo(0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                curveToRelative(3.25f, 0f, 6.27f, 1.3f, 8.48f, 3.52f)
                lineToRelative(2.52f, -2.52f)
                lineTo(23f, 6.91f)
                curveToRelative(0f, 0.6f, -0.49f, 1.09f, -1.09f, 1.09f)
                horizontalLineToRelative(-5.91f)
                lineToRelative(2.36f, -2.36f)
                curveToRelative(-1.66f, -1.66f, -3.92f, -2.64f, -6.36f, -2.64f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                curveToRelative(-2.44f, 0f, -4.7f, -0.98f, -6.36f, -2.64f)
                lineToRelative(2.36f, -2.36f)
                lineTo(2.09f, 16f)
                curveToRelative(-0.6f, 0f, -1.09f, 0.49f, -1.09f, 1.09f)
                verticalLineToRelative(5.91f)
                lineToRelative(2.52f, -2.52f)
                curveToRelative(2.21f, 2.22f, 5.24f, 3.52f, 8.48f, 3.52f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(10.5f, 6f)
                verticalLineToRelative(6.57f)
                lineToRelative(5.21f, 3.21f)
                lineToRelative(1.57f, -2.56f)
                lineToRelative(-3.79f, -2.33f)
                lineTo(13.5f, 6f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _ClockFuturePast = it}

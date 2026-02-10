package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClapperOpen: ImageVector? = null

val Icons.Sr.ClapperOpen: ImageVector
    get() = _ClapperOpen ?: UXIcon(name = "ClapperOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(6f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(1f, 11f)
                horizontalLineToRelative(1.14f)
                lineTo(7.16f, 3.2f)
                lineToRelative(3.08f, -0.83f)
                lineTo(4.97f, 10.59f)
                lineToRelative(-1.47f, 0.39f)
                lineToRelative(-0.04f, 0.02f)
                lineTo(22f, 11f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(16.98f, 7.46f)
                lineTo(21.25f, 0.61f)
                curveToRelative(-0.59f, -0.45f, -1.34f, -0.68f, -2.14f, -0.6f)
                lineToRelative(-5.26f, 8.26f)
                lineToRelative(3.13f, -0.82f)
                close()
                moveTo(21.61f, 6.25f)
                curveToRelative(0.86f, -0.23f, 1.39f, -1.1f, 1.2f, -1.97f)
                lineToRelative(-0.4f, -1.74f)
                lineToRelative(-2.61f, 4.18f)
                lineToRelative(1.81f, -0.47f)
                close()
                moveTo(11f, 9.02f)
                lineTo(16.29f, 0.72f)
                lineToRelative(-3.18f, 0.86f)
                lineTo(7.82f, 9.85f)
                lineToRelative(3.18f, -0.83f)
                close()
                moveTo(2.35f, 4.5f)
                curveTo(0.74f, 4.86f, -0.29f, 6.46f, 0.07f, 8.08f)
                lineToRelative(0.42f, 1.83f)
                lineTo(4.28f, 3.98f)
                lineToRelative(-1.93f, 0.52f)
                close()
            }
        }.also { _ClapperOpen = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClapperOpen: ImageVector? = null

val Icons.Ss.ClapperOpen: ImageVector
    get() = _ClapperOpen ?: UXIcon(name = "ClapperOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.85f, 8.3f)
                lineTo(19.11f, 0.04f)
                curveToRelative(0.8f, -0.08f, 1.55f, 0.15f, 2.14f, 0.6f)
                lineToRelative(-4.27f, 6.84f)
                lineToRelative(-3.13f, 0.82f)
                close()
                moveTo(11.0f, 9.04f)
                lineTo(16.29f, 0.75f)
                lineToRelative(-3.18f, 0.86f)
                lineTo(7.82f, 9.87f)
                lineToRelative(3.18f, -0.83f)
                close()
                moveTo(23.16f, 5.86f)
                lineToRelative(-0.76f, -3.31f)
                lineToRelative(-2.61f, 4.18f)
                lineToRelative(3.36f, -0.88f)
                close()
                moveTo(2.35f, 4.52f)
                curveTo(0.74f, 4.88f, -0.28f, 6.48f, 0.07f, 8.11f)
                lineToRelative(0.42f, 1.83f)
                lineToRelative(3.79f, -5.93f)
                lineToRelative(-1.93f, 0.52f)
                close()
                moveTo(3.5f, 11f)
                lineToRelative(1.47f, -0.39f)
                lineTo(10.23f, 2.39f)
                lineToRelative(-3.08f, 0.83f)
                lineTo(2.18f, 11f)
                lineTo(1f, 11f)
                verticalLineToRelative(13f)
                lineTo(24f, 24f)
                lineTo(24f, 11f)
                lineTo(3.5f, 11f)
                close()
            }
        }.also { _ClapperOpen = it}

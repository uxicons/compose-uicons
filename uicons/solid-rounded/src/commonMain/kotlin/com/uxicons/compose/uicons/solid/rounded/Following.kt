package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Following: ImageVector? = null

val Icons.Sr.Following: ImageVector
    get() = _Following ?: UXIcon(name = "Following", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 128.02f)
                moveToRelative(-128f, 0f)
                arcToRelative(128f, 128f, 0f, isMoreThanHalf = true, isPositiveArc = true, 256f, 0f)
                arcToRelative(128f, 128f, 0f, isMoreThanHalf = true, isPositiveArc = true, -256f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 298.69f)
                curveTo(86.01f, 298.82f, 0.13f, 384.7f, 0f, 490.69f)
                curveToRelative(0f, 11.78f, 9.55f, 21.33f, 21.33f, 21.33f)
                horizontalLineToRelative(341.33f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                curveTo(383.87f, 384.7f, 297.98f, 298.82f, 192f, 298.69f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(469.33f, 168.02f)
                curveToRelative(-24.72f, 1.23f, -43.79f, 22.21f, -42.67f, 46.93f)
                curveToRelative(1.12f, -24.72f, -17.95f, -45.7f, -42.67f, -46.93f)
                curveToRelative(-24.72f, 1.23f, -43.79f, 22.21f, -42.67f, 46.93f)
                curveToRelative(0f, 36.91f, 48.13f, 80.15f, 72.11f, 99.39f)
                curveToRelative(7.73f, 6.19f, 18.72f, 6.19f, 26.45f, 0f)
                curveToRelative(23.98f, -19.2f, 72.11f, -62.49f, 72.11f, -99.39f)
                curveTo(513.12f, 190.23f, 494.05f, 169.26f, 469.33f, 168.02f)
                close()
            }
        }.also { _Following = it}

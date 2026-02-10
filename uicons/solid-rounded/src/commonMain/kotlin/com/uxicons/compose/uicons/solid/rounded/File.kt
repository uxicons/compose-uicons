package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _File: ImageVector? = null

val Icons.Sr.File: ImageVector
    get() = _File ?: UXIcon(name = "File", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(320f, 170.67f)
                horizontalLineToRelative(139.52f)
                curveToRelative(-7.45f, -19.74f, -19.02f, -37.66f, -33.94f, -52.56f)
                lineToRelative(-74.32f, -74.37f)
                curveToRelative(-14.93f, -14.9f, -32.85f, -26.47f, -52.59f, -33.92f)
                verticalLineToRelative(139.52f)
                curveTo(298.67f, 161.12f, 308.22f, 170.67f, 320f, 170.67f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(468.82f, 213.33f)
                horizontalLineTo(320f)
                curveToRelative(-35.35f, 0f, -64f, -28.65f, -64f, -64f)
                verticalLineTo(0.51f)
                curveTo(252.57f, 0.28f, 249.13f, 0f, 245.65f, 0f)
                horizontalLineToRelative(-96.32f)
                curveTo(90.45f, 0.07f, 42.74f, 47.79f, 42.67f, 106.67f)
                verticalLineToRelative(298.67f)
                curveTo(42.74f, 464.21f, 90.45f, 511.93f, 149.33f, 512f)
                horizontalLineToRelative(213.33f)
                curveToRelative(58.88f, -0.07f, 106.6f, -47.79f, 106.67f, -106.67f)
                verticalLineTo(223.68f)
                curveTo(469.33f, 220.2f, 469.06f, 216.77f, 468.82f, 213.33f)
                close()
            }
        }.also { _File = it}

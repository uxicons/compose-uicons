package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Folder: ImageVector? = null

val Icons.Sr.Folder: ImageVector
    get() = _Folder ?: UXIcon(name = "Folder", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 191.81f)
                verticalLineTo(384f)
                curveToRelative(0.07f, 58.88f, 47.79f, 106.6f, 106.67f, 106.67f)
                horizontalLineToRelative(298.67f)
                curveTo(464.21f, 490.6f, 511.93f, 442.88f, 512f, 384f)
                verticalLineTo(189.44f)
                lineTo(0f, 191.81f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(405.33f, 64f)
                horizontalLineTo(266.07f)
                curveToRelative(-3.3f, 0.02f, -6.56f, -0.71f, -9.54f, -2.13f)
                lineToRelative(-67.33f, -33.79f)
                curveToRelative(-8.89f, -4.43f, -18.68f, -6.73f, -28.61f, -6.74f)
                horizontalLineToRelative(-53.93f)
                curveTo(47.79f, 21.4f, 0.07f, 69.12f, 0f, 128f)
                verticalLineToRelative(21.14f)
                lineToRelative(509.08f, -2.37f)
                curveTo(497.96f, 98.41f, 454.96f, 64.1f, 405.33f, 64f)
                close()
            }
        }.also { _Folder = it}

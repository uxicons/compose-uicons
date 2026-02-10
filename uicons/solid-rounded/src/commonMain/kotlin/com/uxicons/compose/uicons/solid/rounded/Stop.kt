package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stop: ImageVector? = null

val Icons.Sr.Stop: ImageVector
    get() = _Stop ?: UXIcon(name = "Stop", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(106.67f, 0f)
                horizontalLineToRelative(298.67f)
                curveTo(464.24f, 0f, 512f, 47.76f, 512f, 106.67f)
                verticalLineToRelative(298.67f)
                curveTo(512f, 464.24f, 464.24f, 512f, 405.33f, 512f)
                horizontalLineTo(106.67f)
                curveTo(47.76f, 512f, 0f, 464.24f, 0f, 405.33f)
                verticalLineTo(106.67f)
                curveTo(0f, 47.76f, 47.76f, 0f, 106.67f, 0f)
                close()
            }
        }.also { _Stop = it}

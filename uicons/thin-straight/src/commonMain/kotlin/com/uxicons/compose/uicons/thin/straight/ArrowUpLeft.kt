package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeft: ImageVector? = null

val Icons.Ts.ArrowUpLeft: ImageVector
    get() = _ArrowUpLeft ?: UXIcon(name = "ArrowUpLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.99f, 23.29f)
                lineTo(1.71f, 1f)
                horizontalLineTo(14f)
                verticalLineTo(0f)
                horizontalLineTo(1.5f)
                curveTo(0.67f, 0f, 0f, 0.67f, 0f, 1.5f)
                verticalLineTo(14f)
                horizontalLineTo(1f)
                verticalLineTo(1.71f)
                lineTo(23.29f, 23.99f)
                lineToRelative(0.71f, -0.71f)
                close()
            }
        }.also { _ArrowUpLeft = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeft: ImageVector? = null

val Icons.Bs.ArrowUpLeft: ImageVector
    get() = _ArrowUpLeft ?: UXIcon(name = "ArrowUpLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.97f, 21.85f)
                lineTo(5.12f, 3f)
                horizontalLineTo(15f)
                verticalLineTo(0f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(5.12f)
                lineTo(21.85f, 23.97f)
                lineToRelative(2.12f, -2.12f)
                close()
            }
        }.also { _ArrowUpLeft = it}

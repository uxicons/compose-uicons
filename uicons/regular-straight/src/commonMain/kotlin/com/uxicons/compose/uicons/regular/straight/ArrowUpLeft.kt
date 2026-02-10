package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeft: ImageVector? = null

val Icons.Rs.ArrowUpLeft: ImageVector
    get() = _ArrowUpLeft ?: UXIcon(name = "ArrowUpLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 22.54f)
                lineTo(3.41f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(0f)
                horizontalLineTo(2f)
                curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                verticalLineTo(3.41f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _ArrowUpLeft = it}

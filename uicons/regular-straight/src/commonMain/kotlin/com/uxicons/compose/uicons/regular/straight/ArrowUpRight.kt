package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRight: ImageVector? = null

val Icons.Rs.ArrowUpRight: ImageVector
    get() = _ArrowUpRight ?: UXIcon(name = "ArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                horizontalLineToRelative(10.59f)
                lineTo(0.04f, 22.54f)
                lineToRelative(1.41f, 1.41f)
                lineTo(22f, 3.41f)
                verticalLineTo(14f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _ArrowUpRight = it}

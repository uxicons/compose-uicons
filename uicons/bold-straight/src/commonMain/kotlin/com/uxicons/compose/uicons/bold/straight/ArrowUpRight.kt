package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRight: ImageVector? = null

val Icons.Bs.ArrowUpRight: ImageVector
    get() = _ArrowUpRight ?: UXIcon(name = "ArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineToRelative(9.88f)
                lineTo(0.03f, 21.85f)
                lineToRelative(2.12f, 2.12f)
                lineTo(21f, 5.12f)
                verticalLineTo(15f)
                horizontalLineToRelative(3f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _ArrowUpRight = it}

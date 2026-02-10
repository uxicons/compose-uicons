package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRight: ImageVector? = null

val Icons.Ss.ArrowUpRight: ImageVector
    get() = _ArrowUpRight ?: UXIcon(name = "ArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                verticalLineTo(14f)
                horizontalLineToRelative(-2f)
                verticalLineTo(3.41f)
                lineTo(1.46f, 23.96f)
                lineTo(0.04f, 22.54f)
                lineTo(20.59f, 2f)
                horizontalLineTo(10f)
                verticalLineTo(0f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _ArrowUpRight = it}

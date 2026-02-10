package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRight: ImageVector? = null

val Icons.Ts.ArrowUpRight: ImageVector
    get() = _ArrowUpRight ?: UXIcon(name = "ArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 0f)
                horizontalLineTo(10f)
                verticalLineTo(1f)
                horizontalLineToRelative(12.29f)
                lineTo(0.01f, 23.29f)
                lineToRelative(0.71f, 0.71f)
                lineTo(23f, 1.71f)
                verticalLineTo(14f)
                horizontalLineToRelative(1f)
                verticalLineTo(1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ArrowUpRight = it}

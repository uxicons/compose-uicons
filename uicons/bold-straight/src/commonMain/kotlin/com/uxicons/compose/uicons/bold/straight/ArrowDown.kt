package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDown: ImageVector? = null

val Icons.Bs.ArrowDown: ImageVector
    get() = _ArrowDown ?: UXIcon(name = "ArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.3f, 16.93f)
                lineToRelative(-2.78f, 2.78f)
                lineTo(13.5f, 0f)
                lineToRelative(-3f, 0f)
                lineToRelative(0.03f, 19.7f)
                lineTo(7.76f, 16.93f)
                lineTo(5.64f, 19.06f)
                lineToRelative(3.92f, 3.92f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0f)
                lineToRelative(3.92f, -3.92f)
                close()
            }
        }.also { _ArrowDown = it}

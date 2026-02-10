package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeft: ImageVector? = null

val Icons.Bs.ArrowLeft: ImageVector
    get() = _ArrowLeft ?: UXIcon(name = "ArrowLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.07f, 7.73f)
                lineToRelative(-2.78f, 2.78f)
                lineTo(24f, 10.53f)
                lineToRelative(0f, 3f)
                lineTo(4.3f, 13.51f)
                lineToRelative(2.77f, 2.76f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(1.02f, 14.47f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.95f)
                lineTo(4.94f, 5.61f)
                close()
            }
        }.also { _ArrowLeft = it}

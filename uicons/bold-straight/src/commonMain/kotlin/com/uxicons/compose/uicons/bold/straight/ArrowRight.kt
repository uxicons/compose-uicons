package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowRight: ImageVector? = null

val Icons.Bs.ArrowRight: ImageVector
    get() = _ArrowRight ?: UXIcon(name = "ArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.93f, 16.27f)
                lineToRelative(2.78f, -2.78f)
                lineTo(0f, 13.47f)
                lineToRelative(0f, -3f)
                lineToRelative(19.7f, 0.03f)
                lineTo(16.93f, 7.73f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(3.92f, 3.92f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.95f)
                lineToRelative(-3.92f, 3.92f)
                close()
            }
        }.also { _ArrowRight = it}

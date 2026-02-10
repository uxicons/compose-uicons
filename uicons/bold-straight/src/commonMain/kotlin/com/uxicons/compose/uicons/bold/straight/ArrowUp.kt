package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUp: ImageVector? = null

val Icons.Bs.ArrowUp: ImageVector
    get() = _ArrowUp ?: UXIcon(name = "ArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.3f, 7.07f)
                lineToRelative(-2.78f, -2.78f)
                lineTo(13.5f, 24f)
                lineToRelative(-3f, 0f)
                lineToRelative(0.03f, -19.7f)
                lineTo(7.76f, 7.07f)
                lineTo(5.64f, 4.94f)
                lineTo(9.56f, 1.02f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.95f, 0f)
                lineToRelative(3.92f, 3.92f)
                close()
            }
        }.also { _ArrowUp = it}

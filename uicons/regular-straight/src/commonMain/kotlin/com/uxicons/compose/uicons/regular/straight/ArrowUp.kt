package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUp: ImageVector? = null

val Icons.Rs.ArrowUp: ImageVector
    get() = _ArrowUp ?: UXIcon(name = "ArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.07f, 4.77f)
                lineTo(14.15f, 0.85f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineTo(5.99f, 4.77f)
                lineTo(7.41f, 6.18f)
                lineToRelative(3.63f, -3.63f)
                lineTo(11.06f, 24f)
                lineToRelative(2f, 0f)
                lineTo(13.04f, 2.56f)
                lineToRelative(3.62f, 3.62f)
                close()
            }
        }.also { _ArrowUp = it}

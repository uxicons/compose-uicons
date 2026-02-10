package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallUp: ImageVector? = null

val Icons.Ss.ArrowSmallUp: ImageVector
    get() = _ArrowSmallUp ?: UXIcon(name = "ArrowSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.71f, 9.88f)
                lineTo(13.41f, 5.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 0f)
                lineTo(6.29f, 9.88f)
                lineToRelative(1.41f, 1.41f)
                lineTo(11f, 8f)
                verticalLineTo(19f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                lineToRelative(3.29f, 3.29f)
                close()
            }
        }.also { _ArrowSmallUp = it}

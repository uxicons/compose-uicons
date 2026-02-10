package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallLeft: ImageVector? = null

val Icons.Rs.ArrowSmallLeft: ImageVector
    get() = _ArrowSmallLeft ?: UXIcon(name = "ArrowSmallLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 11f)
                horizontalLineTo(9f)
                lineToRelative(3.29f, -3.29f)
                lineTo(10.88f, 6.29f)
                lineTo(6.59f, 10.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.83f)
                lineToRelative(4.29f, 4.29f)
                lineToRelative(1.41f, -1.41f)
                lineTo(9f, 13f)
                horizontalLineTo(19f)
                close()
            }
        }.also { _ArrowSmallLeft = it}

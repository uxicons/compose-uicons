package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallLeft: ImageVector? = null

val Icons.Bs.ArrowSmallLeft: ImageVector
    get() = _ArrowSmallLeft ?: UXIcon(name = "ArrowSmallLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10.5f)
                horizontalLineTo(10.21f)
                lineToRelative(2.44f, -2.44f)
                lineTo(10.53f, 5.94f)
                lineTo(6.23f, 10.23f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.54f)
                lineToRelative(4.29f, 4.29f)
                lineToRelative(2.12f, -2.12f)
                lineTo(10.21f, 13.5f)
                horizontalLineTo(19f)
                close()
            }
        }.also { _ArrowSmallLeft = it}

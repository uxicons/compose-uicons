package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallLeft: ImageVector? = null

val Icons.Br.ArrowSmallLeft: ImageVector
    get() = _ArrowSmallLeft ?: UXIcon(name = "ArrowSmallLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 10.5f)
            horizontalLineTo(10.21f)
            lineToRelative(2.44f, -2.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
            lineTo(6.94f, 9.53f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.95f)
            lineToRelative(3.59f, 3.59f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -2.12f)
            lineTo(10.21f, 13.5f)
            horizontalLineTo(19f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
    }.also { _ArrowSmallLeft = it }

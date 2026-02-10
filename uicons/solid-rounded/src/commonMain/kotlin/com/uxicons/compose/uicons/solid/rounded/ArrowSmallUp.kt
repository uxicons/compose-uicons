package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallUp: ImageVector? = null

val Icons.Sr.ArrowSmallUp: ImageVector
    get() = _ArrowSmallUp ?: UXIcon(name = "ArrowSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.06f, 9.53f)
                lineTo(14.47f, 5.94f)
                arcToRelative(3.58f, 3.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.95f, 0f)
                lineTo(5.94f, 9.53f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
                lineTo(10.5f, 9.21f)
                verticalLineTo(19f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
                verticalLineTo(9.21f)
                lineToRelative(2.44f, 2.44f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -2.12f)
                close()
            }
        }.also { _ArrowSmallUp = it}

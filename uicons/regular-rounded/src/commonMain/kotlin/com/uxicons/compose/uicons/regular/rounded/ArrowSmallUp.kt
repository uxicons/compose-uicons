package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallUp: ImageVector? = null

val Icons.Rr.ArrowSmallUp: ImageVector
    get() = _ArrowSmallUp ?: UXIcon(name = "ArrowSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.71f, 9.88f)
                lineToRelative(-4.3f, -4.29f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.82f, 0f)
                lineTo(6.29f, 9.88f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.41f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, 0f)
                lineTo(11f, 8f)
                verticalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(8f)
                lineToRelative(3.29f, 3.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.42f, -1.41f)
                close()
            }
        }.also { _ArrowSmallUp = it}

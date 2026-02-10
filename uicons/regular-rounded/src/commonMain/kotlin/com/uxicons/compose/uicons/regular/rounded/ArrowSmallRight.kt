package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallRight: ImageVector? = null

val Icons.Rr.ArrowSmallRight: ImageVector
    get() = _ArrowSmallRight ?: UXIcon(name = "ArrowSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                horizontalLineToRelative(0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.59f, -1.4f)
                lineToRelative(-4.29f, -4.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.42f)
                lineTo(15f, 11f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(15f)
                lineToRelative(-3.29f, 3.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 1.42f)
                lineToRelative(4.29f, -4.3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 12f)
                close()
            }
        }.also { _ArrowSmallRight = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallRight: ImageVector? = null

val Icons.Sr.ArrowSmallRight: ImageVector
    get() = _ArrowSmallRight ?: UXIcon(name = "ArrowSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.06f, 9.53f)
                lineTo(13.47f, 5.94f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 2.12f)
                lineTo(13.79f, 10.5f)
                horizontalLineTo(5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                horizontalLineToRelative(8.79f)
                lineToRelative(-2.44f, 2.44f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
                lineToRelative(3.59f, -3.59f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.06f, 9.53f)
                close()
            }
        }.also { _ArrowSmallRight = it}

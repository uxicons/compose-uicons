package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallRight: ImageVector? = null

val Icons.Ss.ArrowSmallRight: ImageVector
    get() = _ArrowSmallRight ?: UXIcon(name = "ArrowSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.41f, 10.59f)
                lineTo(13.12f, 6.29f)
                lineTo(11.71f, 7.71f)
                lineTo(15f, 11f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(15f)
                lineToRelative(-3.29f, 3.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.29f, -4.29f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.41f, 10.59f)
                close()
            }
        }.also { _ArrowSmallRight = it}

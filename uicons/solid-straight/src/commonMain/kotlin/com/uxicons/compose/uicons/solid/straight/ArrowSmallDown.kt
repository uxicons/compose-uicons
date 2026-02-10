package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallDown: ImageVector? = null

val Icons.Ss.ArrowSmallDown: ImageVector
    get() = _ArrowSmallDown ?: UXIcon(name = "ArrowSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.29f, 12.71f)
                lineTo(13f, 16f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                lineTo(7.71f, 12.71f)
                lineTo(6.29f, 14.12f)
                lineToRelative(4.29f, 4.29f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, 0f)
                lineToRelative(4.29f, -4.29f)
                close()
            }
        }.also { _ArrowSmallDown = it}

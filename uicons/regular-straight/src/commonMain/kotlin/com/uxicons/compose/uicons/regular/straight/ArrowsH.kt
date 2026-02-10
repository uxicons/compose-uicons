package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsH: ImageVector? = null

val Icons.Rs.ArrowsH: ImageVector
    get() = _ArrowsH ?: UXIcon(name = "ArrowsH") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.41f, 10.59f)
                lineTo(20.17f, 7.34f)
                lineTo(18.76f, 8.76f)
                lineTo(21f, 11f)
                horizontalLineTo(3f)
                lineTo(5.24f, 8.76f)
                lineTo(3.83f, 7.34f)
                lineTo(0.59f, 10.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.83f)
                lineToRelative(3.24f, 3.24f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3f, 13f)
                horizontalLineTo(21f)
                lineToRelative(-2.24f, 2.24f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.24f, -3.24f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.41f, 10.59f)
                close()
            }
        }.also { _ArrowsH = it}

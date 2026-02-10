package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsH: ImageVector? = null

val Icons.Bs.ArrowsH: ImageVector
    get() = _ArrowsH ?: UXIcon(name = "ArrowsH") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.27f, 10.23f)
                lineToRelative(-3.75f, -3.75f)
                lineTo(17.4f, 8.6f)
                lineToRelative(1.9f, 1.9f)
                horizontalLineTo(4.71f)
                lineTo(6.6f, 8.6f)
                lineTo(4.48f, 6.48f)
                lineToRelative(-3.75f, 3.75f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.54f)
                lineToRelative(3.75f, 3.75f)
                lineTo(6.6f, 15.4f)
                lineToRelative(-1.9f, -1.9f)
                horizontalLineTo(19.29f)
                lineToRelative(-1.9f, 1.9f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.75f, -3.75f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.27f, 10.23f)
                close()
            }
        }.also { _ArrowsH = it}

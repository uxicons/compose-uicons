package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallUp: ImageVector? = null

val Icons.Bs.ArrowSmallUp: ImageVector
    get() = _ArrowSmallUp ?: UXIcon(name = "ArrowSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.06f, 9.53f)
                lineTo(13.77f, 5.23f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 0f)
                lineTo(5.94f, 9.53f)
                lineToRelative(2.12f, 2.12f)
                lineTo(10.5f, 9.21f)
                verticalLineTo(19f)
                horizontalLineToRelative(3f)
                verticalLineTo(9.21f)
                lineToRelative(2.44f, 2.44f)
                close()
            }
        }.also { _ArrowSmallUp = it}

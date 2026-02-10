package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallDown: ImageVector? = null

val Icons.Bs.ArrowSmallDown: ImageVector
    get() = _ArrowSmallDown ?: UXIcon(name = "ArrowSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.94f, 12.35f)
                lineTo(13.5f, 14.79f)
                verticalLineTo(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8.79f)
                lineTo(8.06f, 12.35f)
                lineTo(5.94f, 14.47f)
                lineToRelative(4.29f, 4.29f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.54f, 0f)
                lineToRelative(4.29f, -4.29f)
                close()
            }
        }.also { _ArrowSmallDown = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChatArrowDown: ImageVector? = null

val Icons.Bs.ChatArrowDown: ImageVector
    get() = _ChatArrowDown ?: UXIcon(name = "ChatArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 20.5f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineTo(20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 24f)
                horizontalLineTo(24f)
                verticalLineTo(21f)
                horizontalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.56f, 12.44f)
                lineTo(16f, 6.88f)
                lineToRelative(-2.5f, 2.5f)
                lineTo(8.56f, 4.44f)
                lineTo(6.44f, 6.56f)
                lineToRelative(7.06f, 7.06f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(3.44f, 3.44f)
                lineTo(17f, 17f)
                horizontalLineToRelative(5.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 15.5f)
                verticalLineTo(10f)
                close()
            }
        }.also { _ChatArrowDown = it}

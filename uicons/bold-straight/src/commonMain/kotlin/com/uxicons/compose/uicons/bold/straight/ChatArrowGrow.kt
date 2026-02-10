package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChatArrowGrow: ImageVector? = null

val Icons.Bs.ChatArrowGrow: ImageVector
    get() = _ChatArrowGrow ?: UXIcon(name = "ChatArrowGrow") {
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
                moveTo(22.5f, 5f)
                horizontalLineTo(17f)
                lineToRelative(2.44f, 2.44f)
                lineTo(16f, 10.88f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-7.06f, 7.06f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.94f, -4.94f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(5.56f, -5.56f)
                lineTo(24f, 12f)
                verticalLineTo(6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 5f)
                close()
            }
        }.also { _ChatArrowGrow = it}

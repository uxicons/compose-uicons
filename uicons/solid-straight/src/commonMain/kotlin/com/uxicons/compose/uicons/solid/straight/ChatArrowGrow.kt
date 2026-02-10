package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChatArrowGrow: ImageVector? = null

val Icons.Ss.ChatArrowGrow: ImageVector
    get() = _ChatArrowGrow ?: UXIcon(name = "ChatArrowGrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 20.98f)
                verticalLineToRelative(-21f)
                horizontalLineTo(0f)
                verticalLineToRelative(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(24f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 3.98f)
                horizontalLineTo(17f)
                lineToRelative(2.79f, 2.79f)
                lineTo(15.5f, 11.06f)
                lineToRelative(-2f, -2f)
                lineTo(6.28f, 16.28f)
                lineTo(7.7f, 17.7f)
                lineToRelative(5.8f, -5.8f)
                lineToRelative(2f, 2f)
                lineToRelative(5.71f, -5.71f)
                lineTo(24f, 10.98f)
                verticalLineToRelative(-5.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 3.98f)
                close()
            }
        }.also { _ChatArrowGrow = it}

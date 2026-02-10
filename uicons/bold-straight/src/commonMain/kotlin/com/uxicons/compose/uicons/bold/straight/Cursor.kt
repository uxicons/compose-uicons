package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cursor: ImageVector? = null

val Icons.Bs.Cursor: ImageVector
    get() = _Cursor ?: UXIcon(name = "Cursor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.81f, 13.29f)
                lineToRelative(-14.8f, -12.78f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.01f, 1.99f)
                verticalLineToRelative(19.31f)
                lineToRelative(6.31f, -5.56f)
                lineToRelative(3.89f, 7.76f)
                lineToRelative(4.35f, -2.17f)
                lineToRelative(-3.77f, -7.64f)
                close()
                moveTo(7f, 3.6f)
                lineTo(15.65f, 11.07f)
                lineTo(10.71f, 11.61f)
                lineTo(7f, 15.16f)
                close()
            }
        }.also { _Cursor = it}

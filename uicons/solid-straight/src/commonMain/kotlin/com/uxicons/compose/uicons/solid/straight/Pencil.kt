package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pencil: ImageVector? = null

val Icons.Ss.Pencil: ImageVector
    get() = _Pencil ?: UXIcon(name = "Pencil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.6f, 5.69f)
                lineToRelative(-14.6f, 14.6f)
                lineToRelative(0f, 3.71f)
                lineToRelative(3.71f, 0f)
                lineToRelative(14.6f, -14.6f)
                lineToRelative(-3.71f, -3.71f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.23f, 0.77f)
                arcToRelative(2.62f, 2.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.71f, 0f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(3.5f, -3.5f)
                arcTo(2.62f, 2.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.23f, 0.77f)
                close()
            }
        }.also { _Pencil = it}

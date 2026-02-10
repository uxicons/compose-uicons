package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cursor: ImageVector? = null

val Icons.Ss.Cursor: ImageVector
    get() = _Cursor ?: UXIcon(name = "Cursor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.28f, 23.98f)
                lineToRelative(-4.2f, -8.24f)
                lineToRelative(-5.08f, 4.48f)
                verticalLineToRelative(-18.2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.21f, -1.59f)
                lineToRelative(13.9f, 12.01f)
                lineToRelative(-6.62f, 0.73f)
                lineToRelative(4.14f, 8.13f)
                close()
            }
        }.also { _Cursor = it}

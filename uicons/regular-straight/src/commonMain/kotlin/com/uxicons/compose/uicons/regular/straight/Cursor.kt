package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cursor: ImageVector? = null

val Icons.Rs.Cursor: ImageVector
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
                moveTo(9.68f, 12.53f)
                lineTo(14.16f, 21.3f)
                lineTo(15.95f, 20.41f)
                lineTo(11.4f, 11.5f)
                lineTo(16.34f, 10.95f)
                lineTo(5.95f, 1.98f)
                lineTo(5.99f, 15.79f)
                close()
            }
        }.also { _Cursor = it}

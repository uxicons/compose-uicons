package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H1: ImageVector? = null

val Icons.Ss.H1: ImageVector
    get() = _H1 ?: UXIcon(name = "H1") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                lineTo(4f, 13f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                lineTo(2f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-7f)
                close()
                moveTo(20.49f, 4f)
                lineToRelative(-3.71f, 3.8f)
                lineToRelative(1.43f, 1.4f)
                lineToRelative(1.78f, -1.83f)
                verticalLineToRelative(12.63f)
                horizontalLineToRelative(2f)
                lineTo(22f, 4f)
                horizontalLineToRelative(-1.51f)
                close()
            }
        }.also { _H1 = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H1: ImageVector? = null

val Icons.Bs.H1: ImageVector
    get() = _H1 ?: UXIcon(name = "H1") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                lineTo(2f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(19.78f, 4f)
                lineToRelative(-3.85f, 3.95f)
                lineToRelative(2.15f, 2.09f)
                lineToRelative(0.93f, -0.95f)
                verticalLineToRelative(10.9f)
                horizontalLineToRelative(3f)
                lineTo(22f, 4f)
                horizontalLineToRelative(-2.22f)
                close()
            }
        }.also { _H1 = it}

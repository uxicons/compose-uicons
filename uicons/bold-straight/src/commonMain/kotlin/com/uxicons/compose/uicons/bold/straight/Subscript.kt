package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subscript: ImageVector? = null

val Icons.Bs.Subscript: ImageVector
    get() = _Subscript ?: UXIcon(name = "Subscript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.8f, 0f)
                lineToRelative(-6.6f, 9f)
                lineToRelative(6.6f, 9f)
                horizontalLineToRelative(-3.72f)
                lineToRelative(-4.74f, -6.46f)
                lineToRelative(-4.74f, 6.46f)
                lineTo(0.88f, 18f)
                lineToRelative(6.6f, -9f)
                lineTo(0.88f, 0f)
                horizontalLineToRelative(3.72f)
                lineToRelative(4.74f, 6.46f)
                lineTo(14.08f, 0f)
                horizontalLineToRelative(3.72f)
                close()
                moveTo(21.78f, 13f)
                lineToRelative(-2.66f, 2.72f)
                lineToRelative(1.88f, 1.84f)
                verticalLineToRelative(6.44f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-2.22f)
                close()
            }
        }.also { _Subscript = it}

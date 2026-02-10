package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Superscript: ImageVector? = null

val Icons.Bs.Superscript: ImageVector
    get() = _Superscript ?: UXIcon(name = "Superscript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6.44f)
                lineToRelative(-1.88f, -1.84f)
                lineToRelative(2.66f, -2.72f)
                horizontalLineToRelative(2.22f)
                close()
                moveTo(14.08f, 6f)
                lineToRelative(-4.74f, 6.46f)
                lineToRelative(-4.74f, -6.46f)
                lineTo(0.88f, 6f)
                lineToRelative(6.6f, 9f)
                lineTo(0.88f, 24f)
                horizontalLineToRelative(3.72f)
                lineToRelative(4.74f, -6.46f)
                lineToRelative(4.74f, 6.46f)
                horizontalLineToRelative(3.72f)
                lineToRelative(-6.6f, -9f)
                lineToRelative(6.6f, -9f)
                horizontalLineToRelative(-3.72f)
                close()
            }
        }.also { _Superscript = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarChristmas: ImageVector? = null

val Icons.Bs.StarChristmas: ImageVector
    get() = _StarChristmas ?: UXIcon(name = "StarChristmas") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.91f, 14.89f)
                lineToRelative(7.03f, -2.89f)
                lineToRelative(-7.03f, -2.89f)
                lineToRelative(3.59f, -5.61f)
                lineToRelative(-5.61f, 3.59f)
                lineTo(12f, 0.06f)
                lineToRelative(-2.89f, 7.03f)
                lineTo(3.5f, 3.5f)
                lineToRelative(3.59f, 5.61f)
                lineTo(0.06f, 12f)
                lineToRelative(7.03f, 2.89f)
                lineToRelative(-3.59f, 5.61f)
                lineToRelative(5.61f, -3.59f)
                lineToRelative(2.89f, 7.03f)
                lineToRelative(2.89f, -7.03f)
                lineToRelative(5.61f, 3.59f)
                lineToRelative(-3.59f, -5.61f)
                close()
                moveTo(12f, 16.06f)
                lineToRelative(-1.18f, -2.88f)
                lineToRelative(-2.88f, -1.19f)
                lineToRelative(2.88f, -1.19f)
                lineToRelative(1.18f, -2.88f)
                lineToRelative(1.18f, 2.88f)
                lineToRelative(2.88f, 1.19f)
                lineToRelative(-2.88f, 1.19f)
                lineToRelative(-1.18f, 2.88f)
                close()
            }
        }.also { _StarChristmas = it}

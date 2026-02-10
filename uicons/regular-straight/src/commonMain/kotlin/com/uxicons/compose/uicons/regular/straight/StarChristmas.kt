package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarChristmas: ImageVector? = null

val Icons.Rs.StarChristmas: ImageVector
    get() = _StarChristmas ?: UXIcon(name = "StarChristmas") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.18f, 14.82f)
                lineToRelative(6.85f, -2.82f)
                lineToRelative(-6.85f, -2.82f)
                lineToRelative(4.82f, -7.18f)
                lineToRelative(-7.18f, 4.82f)
                lineTo(12f, -0.04f)
                lineToRelative(-2.8f, 6.8f)
                lineTo(2f, 2f)
                lineToRelative(4.76f, 7.2f)
                lineTo(-0.04f, 12f)
                lineToRelative(6.85f, 2.82f)
                lineToRelative(-4.82f, 7.18f)
                lineToRelative(7.18f, -4.82f)
                lineToRelative(2.82f, 6.85f)
                lineToRelative(2.82f, -6.85f)
                lineToRelative(7.18f, 4.82f)
                lineToRelative(-4.82f, -7.18f)
                close()
                moveTo(10.02f, 13.98f)
                lineToRelative(-4.81f, -1.98f)
                lineToRelative(4.81f, -1.98f)
                lineToRelative(1.98f, -4.81f)
                lineToRelative(1.98f, 4.81f)
                lineToRelative(4.81f, 1.98f)
                lineToRelative(-4.81f, 1.98f)
                lineToRelative(-1.98f, 4.81f)
                lineToRelative(-1.98f, -4.81f)
                close()
            }
        }.also { _StarChristmas = it}

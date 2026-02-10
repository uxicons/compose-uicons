package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarChristmas: ImageVector? = null

val Icons.Ss.StarChristmas: ImageVector
    get() = _StarChristmas ?: UXIcon(name = "StarChristmas") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24.04f)
                lineToRelative(-3.51f, -8.53f)
                lineTo(-0.04f, 12f)
                lineToRelative(8.53f, -3.51f)
                lineTo(12f, -0.04f)
                lineToRelative(3.51f, 8.53f)
                lineToRelative(8.53f, 3.51f)
                lineToRelative(-8.53f, 3.51f)
                lineToRelative(-3.51f, 8.53f)
                close()
                moveTo(6.96f, 6.96f)
                lineToRelative(0.54f, -1.32f)
                lineTo(2f, 2f)
                lineToRelative(3.63f, 5.5f)
                lineToRelative(1.32f, -0.55f)
                close()
                moveTo(17.04f, 6.96f)
                lineToRelative(1.28f, 0.53f)
                lineToRelative(3.68f, -5.48f)
                lineToRelative(-5.48f, 3.68f)
                lineToRelative(0.53f, 1.28f)
                close()
                moveTo(17.04f, 17.04f)
                lineToRelative(-0.53f, 1.28f)
                lineToRelative(5.48f, 3.68f)
                lineToRelative(-3.68f, -5.48f)
                lineToRelative(-1.28f, 0.53f)
                close()
                moveTo(6.96f, 17.04f)
                lineToRelative(-1.28f, -0.53f)
                lineToRelative(-3.68f, 5.48f)
                lineToRelative(5.48f, -3.68f)
                lineToRelative(-0.53f, -1.28f)
                close()
            }
        }.also { _StarChristmas = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarChristmas: ImageVector? = null

val Icons.Sr.StarChristmas: ImageVector
    get() = _StarChristmas ?: UXIcon(name = "StarChristmas") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.94f, 23.37f)
                curveToRelative(-0.34f, 0.84f, -1.53f, 0.84f, -1.88f, 0f)
                lineToRelative(-2.89f, -7.54f)
                lineTo(0.63f, 12.94f)
                curveToRelative(-0.84f, -0.34f, -0.84f, -1.53f, 0f, -1.88f)
                lineToRelative(7.54f, -2.89f)
                lineTo(11.06f, 0.63f)
                curveToRelative(0.34f, -0.84f, 1.53f, -0.84f, 1.88f, 0f)
                lineToRelative(2.89f, 7.54f)
                lineToRelative(7.54f, 2.89f)
                curveToRelative(0.84f, 0.34f, 0.84f, 1.53f, 0f, 1.88f)
                lineToRelative(-7.54f, 2.89f)
                lineToRelative(-2.89f, 7.54f)
                close()
                moveTo(4.78f, 7.41f)
                lineToRelative(1.86f, -0.77f)
                lineToRelative(0.77f, -1.87f)
                lineToRelative(-3.92f, -2.6f)
                curveToRelative(-0.87f, -0.57f, -1.89f, 0.46f, -1.32f, 1.32f)
                lineToRelative(2.61f, 3.92f)
                close()
                moveTo(17.36f, 6.64f)
                lineToRelative(1.86f, 0.77f)
                lineToRelative(2.61f, -3.92f)
                curveToRelative(0.57f, -0.87f, -0.46f, -1.89f, -1.32f, -1.32f)
                lineToRelative(-3.92f, 2.6f)
                lineToRelative(0.77f, 1.87f)
                close()
                moveTo(19.23f, 16.59f)
                lineToRelative(-1.87f, 0.77f)
                lineToRelative(-0.77f, 1.86f)
                lineToRelative(3.92f, 2.6f)
                curveToRelative(0.87f, 0.57f, 1.89f, -0.46f, 1.32f, -1.32f)
                lineToRelative(-2.61f, -3.91f)
                close()
                moveTo(6.64f, 17.36f)
                lineToRelative(-1.87f, -0.77f)
                lineToRelative(-2.61f, 3.91f)
                curveToRelative(-0.57f, 0.87f, 0.46f, 1.89f, 1.32f, 1.32f)
                lineToRelative(3.92f, -2.6f)
                lineToRelative(-0.77f, -1.86f)
                close()
            }
        }.also { _StarChristmas = it}

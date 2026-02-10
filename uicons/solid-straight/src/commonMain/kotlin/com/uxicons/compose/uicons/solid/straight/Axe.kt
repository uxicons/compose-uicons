package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Axe: ImageVector? = null

val Icons.Ss.Axe: ImageVector
    get() = _Axe ?: UXIcon(name = "Axe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7.01f)
                curveToRelative(0f, 5.29f, -3.7f, 8.99f, -8.99f, 8.99f)
                horizontalLineToRelative(-1.05f)
                lineToRelative(0.05f, -1.05f)
                curveToRelative(0.04f, -0.8f, -0.08f, -3.08f, -1.09f, -4.1f)
                lineToRelative(-4.75f, -4.77f)
                lineTo(14.09f, 0.16f)
                lineToRelative(3.66f, 3.67f)
                lineToRelative(2.04f, -2.04f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.01f, 2.01f)
                curveToRelative(1.13f, 0.76f, 3.04f, 0.83f, 3.74f, 0.79f)
                lineToRelative(1.06f, -0.06f)
                lineToRelative(0.0f, 1.06f)
                close()
                moveTo(0.05f, 21.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(10.49f, -10.49f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(0.05f, 21.54f)
                close()
            }
        }.also { _Axe = it}

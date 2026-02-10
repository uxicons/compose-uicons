package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MenuDots: ImageVector? = null

val Icons.Sc.MenuDots: ImageVector
    get() = _MenuDots ?: UXIcon(name = "MenuDots") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.3f, 8.66f)
                curveToRelative(-2f, 0.01f, -3.3f, 1.34f, -3.3f, 3.31f)
                curveToRelative(0f, 2.01f, 1.3f, 3.35f, 3.32f, 3.37f)
                curveToRelative(2f, -0.01f, 3.27f, -1.28f, 3.3f, -3.37f)
                curveToRelative(-0.03f, -2f, -1.33f, -3.3f, -3.32f, -3.31f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 8.66f)
                curveToRelative(-2f, 0.01f, -3.3f, 1.34f, -3.3f, 3.31f)
                curveToRelative(0f, 2.01f, 1.3f, 3.35f, 3.32f, 3.37f)
                curveToRelative(2f, -0.01f, 3.27f, -1.28f, 3.3f, -3.37f)
                curveToRelative(-0.03f, -2f, -1.33f, -3.3f, -3.32f, -3.31f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.68f, 8.66f)
                curveToRelative(-2f, 0.01f, -3.3f, 1.34f, -3.3f, 3.31f)
                curveToRelative(0f, 2.01f, 1.3f, 3.35f, 3.32f, 3.37f)
                curveToRelative(2f, -0.01f, 3.27f, -1.28f, 3.3f, -3.37f)
                curveToRelative(-0.03f, -2f, -1.33f, -3.3f, -3.32f, -3.31f)
                close()
            }
        }.also { _MenuDots = it}

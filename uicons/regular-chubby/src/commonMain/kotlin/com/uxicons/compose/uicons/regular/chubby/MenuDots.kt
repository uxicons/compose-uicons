package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MenuDots: ImageVector? = null

val Icons.Rc.MenuDots: ImageVector
    get() = _MenuDots ?: UXIcon(name = "MenuDots") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.9f, 8.98f)
                curveToRelative(-1.78f, 0.01f, -2.9f, 1.21f, -2.9f, 3f)
                curveToRelative(0f, 1.89f, 1.09f, 3.02f, 2.91f, 3.03f)
                curveToRelative(1.81f, -0.01f, 2.87f, -1.1f, 2.9f, -3.03f)
                curveToRelative(-0.03f, -1.84f, -1.14f, -2.99f, -2.91f, -3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 8.98f)
                curveToRelative(-1.78f, 0.01f, -2.9f, 1.21f, -2.9f, 3f)
                curveToRelative(0f, 1.89f, 1.09f, 3.02f, 2.91f, 3.03f)
                curveToRelative(1.81f, -0.01f, 2.87f, -1.1f, 2.9f, -3.03f)
                curveToRelative(-0.03f, -1.84f, -1.14f, -2.99f, -2.91f, -3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.09f, 8.98f)
                curveToRelative(-1.78f, 0.01f, -2.9f, 1.21f, -2.9f, 3f)
                curveToRelative(0f, 1.89f, 1.09f, 3.02f, 2.91f, 3.03f)
                curveToRelative(1.81f, -0.01f, 2.87f, -1.1f, 2.9f, -3.03f)
                curveToRelative(-0.03f, -1.84f, -1.14f, -2.99f, -2.91f, -3f)
                close()
            }
        }.also { _MenuDots = it}

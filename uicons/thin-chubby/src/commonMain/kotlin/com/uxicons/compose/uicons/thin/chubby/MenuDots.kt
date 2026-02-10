package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MenuDots: ImageVector? = null

val Icons.Tc.MenuDots: ImageVector
    get() = _MenuDots ?: UXIcon(name = "MenuDots") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 9.36f)
                curveToRelative(-1.58f, 0.01f, -2.5f, 0.99f, -2.5f, 2.65f)
                curveToRelative(0f, 1.65f, 0.92f, 2.62f, 2.5f, 2.63f)
                curveToRelative(1.58f, -0.01f, 2.47f, -0.95f, 2.5f, -2.65f)
                curveToRelative(-0.03f, -1.66f, -0.94f, -2.62f, -2.51f, -2.63f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 9.36f)
                curveToRelative(-1.58f, 0.01f, -2.5f, 0.99f, -2.5f, 2.65f)
                curveToRelative(0f, 1.65f, 0.92f, 2.62f, 2.5f, 2.63f)
                curveToRelative(1.58f, -0.01f, 2.47f, -0.95f, 2.5f, -2.65f)
                curveToRelative(-0.03f, -1.66f, -0.94f, -2.62f, -2.51f, -2.63f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.49f, 9.36f)
                curveToRelative(-1.58f, 0.01f, -2.5f, 0.99f, -2.5f, 2.65f)
                curveToRelative(0f, 1.65f, 0.92f, 2.62f, 2.5f, 2.63f)
                curveToRelative(1.58f, -0.01f, 2.47f, -0.95f, 2.5f, -2.65f)
                curveToRelative(-0.03f, -1.66f, -0.94f, -2.62f, -2.51f, -2.63f)
                close()
            }
        }.also { _MenuDots = it}

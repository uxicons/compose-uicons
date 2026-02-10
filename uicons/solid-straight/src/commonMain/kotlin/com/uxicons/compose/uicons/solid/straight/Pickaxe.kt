package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pickaxe: ImageVector? = null

val Icons.Ss.Pickaxe: ImageVector
    get() = _Pickaxe ?: UXIcon(name = "Pickaxe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.98f, 18.98f)
                curveToRelative(0f, -5.69f, -1.48f, -10.14f, -4.24f, -13.31f)
                lineToRelative(1.71f, -1.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.71f, 1.71f)
                curveTo(15.16f, 1.49f, 10.7f, 0f, 5f, 0f)
                verticalLineToRelative(2.0f)
                curveToRelative(3.65f, 0.69f, 7.3f, 2.63f, 10.29f, 5.3f)
                lineTo(0.07f, 22.51f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(15.21f, -15.21f)
                curveToRelative(2.66f, 2.99f, 4.6f, 6.62f, 5.29f, 10.27f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }.also { _Pickaxe = it}

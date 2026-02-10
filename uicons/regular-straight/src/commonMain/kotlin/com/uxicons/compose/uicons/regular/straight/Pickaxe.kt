package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pickaxe: ImageVector? = null

val Icons.Rs.Pickaxe: ImageVector
    get() = _Pickaxe ?: UXIcon(name = "Pickaxe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.98f, 18.98f)
                curveToRelative(-0.68f, -3.65f, -2.63f, -7.28f, -5.29f, -10.27f)
                lineTo(1.49f, 23.93f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(15.29f, 7.3f)
                curveToRelative(-2.99f, -2.67f, -6.63f, -4.61f, -10.29f, -5.3f)
                verticalLineTo(0f)
                curveTo(10.7f, 0f, 15.16f, 1.49f, 18.33f, 4.25f)
                lineToRelative(1.71f, -1.71f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(2.76f, 3.17f, 4.24f, 7.63f, 4.24f, 13.31f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }.also { _Pickaxe = it}

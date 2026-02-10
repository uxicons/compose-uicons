package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pickaxe: ImageVector? = null

val Icons.Bs.Pickaxe: ImageVector
    get() = _Pickaxe ?: UXIcon(name = "Pickaxe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.98f, 18.98f)
                curveToRelative(-0.66f, -3.5f, -2.46f, -6.99f, -4.95f, -9.9f)
                lineTo(2.15f, 23.97f)
                lineTo(0.03f, 21.85f)
                lineTo(14.92f, 6.96f)
                curveToRelative(-2.92f, -2.5f, -6.42f, -4.3f, -9.92f, -4.96f)
                verticalLineTo(0f)
                curveTo(10.47f, 0f, 14.82f, 1.36f, 17.96f, 3.92f)
                lineToRelative(1.73f, -1.73f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-1.73f, 1.73f)
                curveToRelative(2.55f, 3.15f, 3.9f, 7.49f, 3.9f, 12.95f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }.also { _Pickaxe = it}

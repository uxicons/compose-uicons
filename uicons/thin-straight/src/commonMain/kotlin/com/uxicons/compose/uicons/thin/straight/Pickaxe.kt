package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pickaxe: ImageVector? = null

val Icons.Ts.Pickaxe: ImageVector
    get() = _Pickaxe ?: UXIcon(name = "Pickaxe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.55f, 5.16f)
                lineToRelative(1.55f, -1.55f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-1.55f, 1.55f)
                curveTo(15.67f, 1.49f, 11.18f, -0.01f, 5.5f, -0.01f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.93f)
                lineToRelative(0.41f, 0.08f)
                curveToRelative(3.38f, 0.64f, 7.41f, 2.79f, 10.38f, 5.52f)
                lineTo(0.13f, 23.17f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(15.65f, -15.65f)
                curveToRelative(2.74f, 2.97f, 4.88f, 6.99f, 5.52f, 10.37f)
                lineToRelative(0.08f, 0.41f)
                lineToRelative(1.91f, -0.03f)
                verticalLineToRelative(-0.49f)
                curveToRelative(0f, -5.67f, -1.49f, -10.14f, -4.45f, -13.33f)
                close()
                moveTo(22.91f, 17.99f)
                curveToRelative(-0.79f, -3.61f, -3.13f, -7.82f, -6.06f, -10.85f)
                curveTo(13.83f, 4.22f, 9.62f, 1.88f, 6f, 1.09f)
                verticalLineToRelative(-0.1f)
                curveToRelative(5.33f, 0.09f, 9.57f, 1.65f, 12.49f, 4.51f)
                curveToRelative(2.9f, 2.91f, 4.42f, 7.11f, 4.5f, 12.49f)
                horizontalLineToRelative(-0.09f)
                close()
            }
        }.also { _Pickaxe = it}

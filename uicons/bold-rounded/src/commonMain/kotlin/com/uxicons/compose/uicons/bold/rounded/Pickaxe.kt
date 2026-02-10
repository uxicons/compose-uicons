package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pickaxe: ImageVector? = null

val Icons.Br.Pickaxe: ImageVector
    get() = _Pickaxe ?: UXIcon(name = "Pickaxe") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.87f, 18.98f)
            curveToRelative(-0.52f, 0f, -0.95f, -0.36f, -1.07f, -0.86f)
            curveToRelative(-0.77f, -3.2f, -2.48f, -6.37f, -4.76f, -9.04f)
            lineTo(2.56f, 23.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            lineTo(14.92f, 6.96f)
            curveToRelative(-2.68f, -2.29f, -5.85f, -4.0f, -9.06f, -4.78f)
            curveToRelative(-0.5f, -0.12f, -0.86f, -0.55f, -0.86f, -1.07f)
            curveTo(5f, 0.51f, 5.51f, -0.0f, 6.12f, 0.02f)
            curveToRelative(4.95f, 0.17f, 8.91f, 1.52f, 11.84f, 3.9f)
            lineToRelative(1.48f, -1.48f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            reflectiveCurveToRelative(0.59f, 1.53f, 0f, 2.12f)
            lineToRelative(-1.48f, 1.48f)
            curveToRelative(2.37f, 2.93f, 3.71f, 6.89f, 3.88f, 11.83f)
            curveToRelative(0.02f, 0.61f, -0.48f, 1.12f, -1.1f, 1.12f)
            close()
        }
    }.also { _Pickaxe = it }

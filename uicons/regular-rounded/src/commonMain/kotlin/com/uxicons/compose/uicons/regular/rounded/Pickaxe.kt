package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pickaxe: ImageVector? = null

val Icons.Rr.Pickaxe: ImageVector
    get() = _Pickaxe ?: UXIcon(name = "Pickaxe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.87f, 18.98f)
                curveToRelative(-0.52f, 0f, -0.95f, -0.36f, -1.07f, -0.86f)
                curveToRelative(-0.81f, -3.36f, -2.64f, -6.67f, -5.09f, -9.42f)
                lineTo(1.71f, 23.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineTo(15.29f, 7.29f)
                curveToRelative(-2.75f, -2.46f, -6.07f, -4.3f, -9.43f, -5.11f)
                curveToRelative(-0.5f, -0.12f, -0.86f, -0.55f, -0.86f, -1.07f)
                curveTo(5f, 0.51f, 5.51f, -0.0f, 6.12f, 0.02f)
                curveToRelative(5.17f, 0.18f, 9.27f, 1.64f, 12.23f, 4.22f)
                lineToRelative(0.94f, -0.94f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-0.95f, 0.95f)
                curveToRelative(2.57f, 2.96f, 4.02f, 7.05f, 4.2f, 12.21f)
                curveToRelative(0.02f, 0.61f, -0.48f, 1.12f, -1.1f, 1.12f)
                close()
            }
        }.also { _Pickaxe = it}

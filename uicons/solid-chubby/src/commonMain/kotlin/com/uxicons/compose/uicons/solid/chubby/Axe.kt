package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Axe: ImageVector? = null

val Icons.Sc.Axe: ImageVector
    get() = _Axe ?: UXIcon(name = "Axe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 6.34f)
                curveToRelative(0f, 2.94f, -0.9f, 5.38f, -2.6f, 7.08f)
                curveToRelative(-1.68f, 1.67f, -4.09f, 2.56f, -6.98f, 2.56f)
                curveToRelative(-0.58f, 0.04f, -1.08f, -0.41f, -1.08f, -1f)
                curveToRelative(0f, -0.78f, -0.04f, -1.45f, -0.13f, -2.05f)
                lineToRelative(-8.64f, 8.64f)
                curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
                lineToRelative(9.65f, -9.65f)
                curveToRelative(-0.48f, -0.71f, -1.99f, -2.82f, -1.96f, -2.91f)
                curveToRelative(-0.09f, -0.15f, -0.13f, -0.32f, -0.13f, -0.5f)
                curveToRelative(0f, -0.17f, 0.04f, -1.66f, 1.38f, -3.0f)
                reflectiveCurveToRelative(2.83f, -1.38f, 3.0f, -1.38f)
                curveToRelative(0.17f, 0f, 0.35f, 0.05f, 0.5f, 0.13f)
                curveToRelative(0.1f, -0.02f, 2.2f, 1.47f, 2.89f, 1.98f)
                lineToRelative(0.68f, -0.68f)
                curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
                curveToRelative(0.48f, 0.48f, 0.55f, 1.19f, 0.24f, 1.76f)
                curveToRelative(0.63f, 0.09f, 1.35f, 0.14f, 2.2f, 0.14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Axe = it}

package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBag: ImageVector? = null

val Icons.Sc.ShoppingBag: ImageVector
    get() = _ShoppingBag ?: UXIcon(name = "ShoppingBag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.2f, 8.38f)
                curveToRelative(-0.24f, -1.08f, -1.09f, -1.92f, -2.16f, -2.15f)
                curveToRelative(-0.37f, -0.08f, -0.74f, -0.15f, -1.12f, -0.22f)
                curveToRelative(-0.03f, -0.61f, -0.08f, -1.23f, -0.13f, -1.81f)
                curveToRelative(-0.15f, -1.57f, -1.34f, -2.82f, -2.91f, -3.05f)
                curveToRelative(-1.35f, -0.2f, -2.41f, -0.2f, -3.77f, 0f)
                curveToRelative(-1.56f, 0.23f, -2.76f, 1.48f, -2.91f, 3.05f)
                curveToRelative(-0.06f, 0.58f, -0.1f, 1.2f, -0.13f, 1.81f)
                curveToRelative(-0.37f, 0.07f, -0.75f, 0.14f, -1.12f, 0.22f)
                curveToRelative(-1.08f, 0.23f, -1.93f, 1.08f, -2.16f, 2.15f)
                curveToRelative(-0.88f, 3.98f, -0.88f, 7.84f, 0f, 11.82f)
                curveToRelative(0.24f, 1.08f, 1.08f, 1.92f, 2.16f, 2.15f)
                curveToRelative(2.0f, 0.43f, 4.02f, 0.65f, 6.04f, 0.65f)
                reflectiveCurveToRelative(4.04f, -0.22f, 6.04f, -0.65f)
                curveToRelative(1.08f, -0.23f, 1.92f, -1.08f, 2.16f, -2.15f)
                curveToRelative(0.88f, -3.98f, 0.88f, -7.84f, 0f, -11.82f)
                close()
                moveTo(10.1f, 5.64f)
                curveToRelative(0.03f, -0.4f, 0.06f, -0.79f, 0.09f, -1.16f)
                curveToRelative(0.02f, -0.18f, 0.17f, -0.34f, 0.35f, -0.36f)
                curveToRelative(1.06f, -0.15f, 1.85f, -0.15f, 2.91f, 0f)
                curveToRelative(0.18f, 0.03f, 0.33f, 0.18f, 0.35f, 0.36f)
                curveToRelative(0.04f, 0.37f, 0.07f, 0.76f, 0.09f, 1.16f)
                curveToRelative(-1.26f, -0.09f, -2.53f, -0.09f, -3.79f, 0f)
                close()
            }
        }.also { _ShoppingBag = it}

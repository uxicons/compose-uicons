package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Panorama: ImageVector? = null

val Icons.Sc.Panorama: ImageVector
    get() = _Panorama ?: UXIcon(name = "Panorama") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.46f, 18.16f)
                curveToRelative(0.55f, 0.54f, 1.89f, 1.96f, 3.03f, 3.4f)
                curveToRelative(-1.7f, -0.27f, -4.12f, -0.56f, -6.48f, -0.56f)
                curveToRelative(-4.28f, 0f, -8.74f, 0.97f, -8.79f, 0.98f)
                curveToRelative(-0.54f, 0.11f, -1.07f, -0.22f, -1.19f, -0.76f)
                curveToRelative(-0.02f, -0.1f, -0.31f, -1.45f, -0.58f, -3.37f)
                curveToRelative(2.46f, -2.56f, 5.14f, -4.21f, 6.13f, -4.77f)
                curveToRelative(1.9f, 0.6f, 4.7f, 1.98f, 7.88f, 5.08f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 4.5f, -0.98f, 9.02f, -1.02f, 9.21f)
                curveToRelative(-0.08f, 0.38f, -0.38f, 0.65f, -0.73f, 0.74f)
                curveToRelative(-1.4f, -2.12f, -3.78f, -4.63f, -4.4f, -5.23f)
                curveToRelative(-3.71f, -3.61f, -7.0f, -5.09f, -9.12f, -5.69f)
                curveToRelative(-0.25f, -0.07f, -0.51f, -0.04f, -0.74f, 0.08f)
                curveToRelative(-0.36f, 0.19f, -3.08f, 1.66f, -5.84f, 4.2f)
                curveToRelative(-0.09f, -1.06f, -0.15f, -2.19f, -0.15f, -3.32f)
                curveToRelative(-0.0f, -4.5f, 0.98f, -9.03f, 1.02f, -9.21f)
                curveToRelative(0.12f, -0.54f, 0.66f, -0.88f, 1.19f, -0.76f)
                curveToRelative(0.04f, 0.01f, 4.51f, 0.98f, 8.79f, 0.98f)
                reflectiveCurveToRelative(8.74f, -0.97f, 8.79f, -0.98f)
                curveToRelative(0.54f, -0.12f, 1.07f, 0.22f, 1.19f, 0.76f)
                curveToRelative(0.04f, 0.19f, 1.02f, 4.71f, 1.02f, 9.21f)
                close()
                moveTo(18f, 8.5f)
                curveToRelative(0f, -1.07f, -0.43f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.43f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.43f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.43f, 1.5f, -1.5f)
                close()
            }
        }.also { _Panorama = it}

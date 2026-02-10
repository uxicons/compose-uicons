package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bulb: ImageVector? = null

val Icons.Tc.Bulb: ImageVector
    get() = _Bulb ?: UXIcon(name = "Bulb") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 1f)
                curveTo(6.52f, 1f, 3.38f, 4.15f, 3.38f, 9.65f)
                curveToRelative(0f, 4.69f, 2.79f, 6.57f, 4.46f, 7.27f)
                curveToRelative(0.37f, 0.15f, 0.6f, 0.5f, 0.6f, 0.9f)
                curveToRelative(0f, 3.04f, 0.26f, 5.18f, 3.58f, 5.18f)
                reflectiveCurveToRelative(3.58f, -2.15f, 3.58f, -5.19f)
                curveToRelative(0f, -0.4f, 0.23f, -0.74f, 0.59f, -0.9f)
                curveToRelative(1.66f, -0.7f, 4.44f, -2.58f, 4.44f, -7.27f)
                curveToRelative(0f, -5.5f, -3.14f, -8.65f, -8.61f, -8.65f)
                close()
                moveTo(12.01f, 22f)
                curveToRelative(-1.95f, 0f, -2.5f, -0.63f, -2.57f, -3.41f)
                curveToRelative(0.75f, 0.14f, 1.6f, 0.21f, 2.57f, 0.21f)
                reflectiveCurveToRelative(1.82f, -0.07f, 2.57f, -0.21f)
                curveToRelative(-0.07f, 2.78f, -0.62f, 3.41f, -2.57f, 3.41f)
                close()
                moveTo(15.79f, 15.99f)
                curveToRelative(-0.65f, 0.28f, -1.1f, 0.88f, -1.19f, 1.57f)
                curveToRelative(-0.61f, 0.13f, -1.29f, 0.21f, -2.08f, 0.23f)
                verticalLineToRelative(-6.25f)
                curveToRelative(0.65f, -0.14f, 1.29f, -0.53f, 2.0f, -1.24f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                curveToRelative(-0.64f, 0.64f, -1.17f, 0.95f, -1.68f, 0.99f)
                curveToRelative(-0.6f, 0.04f, -1.22f, -0.28f, -1.93f, -0.99f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.69f, 0.69f, 1.36f, 1.1f, 2.03f, 1.24f)
                verticalLineToRelative(6.25f)
                curveToRelative(-0.8f, -0.02f, -1.5f, -0.1f, -2.12f, -0.23f)
                curveToRelative(-0.09f, -0.69f, -0.54f, -1.29f, -1.19f, -1.57f)
                curveToRelative(-1.76f, -0.74f, -3.85f, -2.45f, -3.85f, -6.35f)
                curveToRelative(0f, -6.66f, 4.78f, -7.65f, 7.64f, -7.65f)
                reflectiveCurveToRelative(7.61f, 0.99f, 7.61f, 7.65f)
                curveToRelative(0f, 3.9f, -2.08f, 5.6f, -3.83f, 6.35f)
                close()
            }
        }.also { _Bulb = it}

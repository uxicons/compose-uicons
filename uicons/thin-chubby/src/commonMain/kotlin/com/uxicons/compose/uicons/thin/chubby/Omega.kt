package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Omega: ImageVector? = null

val Icons.Tc.Omega: ImageVector
    get() = _Omega ?: UXIcon(name = "Omega") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.98f, 22.63f)
                curveToRelative(-0.07f, 0.27f, -0.34f, 0.43f, -0.61f, 0.35f)
                curveToRelative(-0.03f, -0.01f, -2.52f, -0.65f, -6.91f, -0.98f)
                curveToRelative(-0.26f, -0.02f, -0.46f, -0.24f, -0.46f, -0.5f)
                verticalLineToRelative(-2.15f)
                curveToRelative(0f, -0.25f, 0.19f, -0.47f, 0.44f, -0.5f)
                curveToRelative(4.66f, -0.58f, 6.56f, -3f, 6.56f, -8.36f)
                curveToRelative(0f, -6.12f, -2.52f, -8.5f, -9f, -8.5f)
                reflectiveCurveToRelative(-9f, 2.38f, -9f, 8.5f)
                curveToRelative(0f, 5.36f, 1.9f, 7.78f, 6.56f, 8.36f)
                curveToRelative(0.25f, 0.03f, 0.44f, 0.24f, 0.44f, 0.5f)
                verticalLineToRelative(2.15f)
                curveToRelative(0f, 0.26f, -0.2f, 0.48f, -0.46f, 0.5f)
                curveToRelative(-3.92f, 0.33f, -6.91f, 0.98f, -6.93f, 0.99f)
                curveToRelative(-0.26f, 0.06f, -0.54f, -0.11f, -0.6f, -0.38f)
                curveToRelative(-0.06f, -0.27f, 0.11f, -0.54f, 0.38f, -0.6f)
                curveToRelative(0.03f, -0.01f, 2.85f, -0.62f, 6.61f, -0.97f)
                verticalLineToRelative(-1.25f)
                curveToRelative(-4.84f, -0.75f, -7f, -3.63f, -7f, -9.29f)
                curveToRelative(0.0f, -6.75f, 2.9f, -9.5f, 10.0f, -9.5f)
                reflectiveCurveToRelative(10f, 2.75f, 10f, 9.5f)
                curveToRelative(0f, 5.66f, -2.16f, 8.54f, -7f, 9.29f)
                verticalLineToRelative(1.25f)
                curveToRelative(4.2f, 0.35f, 6.53f, 0.95f, 6.63f, 0.98f)
                curveToRelative(0.27f, 0.07f, 0.43f, 0.34f, 0.35f, 0.61f)
                close()
            }
        }.also { _Omega = it}

package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Omega: ImageVector? = null

val Icons.Rc.Omega: ImageVector
    get() = _Omega ?: UXIcon(name = "Omega") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.95f, 22.32f)
                curveToRelative(-0.14f, 0.42f, -0.53f, 0.68f, -0.95f, 0.68f)
                curveToRelative(-0.7f, -0.08f, -1.36f, -0.48f, -6.08f, -0.84f)
                curveToRelative(-0.52f, -0.04f, -0.93f, -0.47f, -0.93f, -1.0f)
                verticalLineToRelative(-2.39f)
                curveToRelative(0f, -0.49f, 0.35f, -0.9f, 0.83f, -0.98f)
                curveToRelative(3.72f, -0.64f, 5.17f, -2.68f, 5.17f, -7.28f)
                curveToRelative(0f, -5.54f, -2.09f, -7.5f, -8f, -7.5f)
                reflectiveCurveToRelative(-8f, 1.96f, -8f, 7.5f)
                curveToRelative(0f, 4.6f, 1.45f, 6.64f, 5.17f, 7.28f)
                curveToRelative(0.48f, 0.08f, 0.83f, 0.5f, 0.83f, 0.98f)
                verticalLineToRelative(2.39f)
                curveToRelative(0f, 0.52f, -0.4f, 0.95f, -0.92f, 1.0f)
                curveToRelative(-3.85f, 0.33f, -5.82f, 0.81f, -5.84f, 0.81f)
                curveToRelative(-0.54f, 0.13f, -1.08f, -0.19f, -1.21f, -0.73f)
                curveToRelative(-0.13f, -0.54f, 0.19f, -1.08f, 0.73f, -1.21f)
                curveToRelative(0.08f, -0.02f, 1.81f, -0.45f, 5.24f, -0.78f)
                verticalLineToRelative(-0.67f)
                curveToRelative(-4.09f, -1.0f, -6f, -3.91f, -6f, -9.08f)
                curveToRelative(0f, -6.66f, 2.99f, -9.5f, 10f, -9.5f)
                reflectiveCurveToRelative(10f, 2.84f, 10f, 9.5f)
                curveToRelative(0f, 5.17f, -1.91f, 8.08f, -6f, 9.08f)
                verticalLineToRelative(0.66f)
                curveToRelative(3.87f, 0.34f, 5.25f, 0.79f, 5.32f, 0.81f)
                curveToRelative(0.52f, 0.17f, 0.81f, 0.74f, 0.63f, 1.26f)
                close()
            }
        }.also { _Omega = it}

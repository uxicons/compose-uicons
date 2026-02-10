package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Omega: ImageVector? = null

val Icons.Sc.Omega: ImageVector
    get() = _Omega ?: UXIcon(name = "Omega") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 23f)
                curveToRelative(-0.11f, 0f, -0.22f, -0.01f, -0.33f, -0.04f)
                curveToRelative(-0.69f, -0.16f, -2.8f, -0.47f, -5.78f, -0.7f)
                curveToRelative(-0.78f, -0.06f, -1.39f, -0.71f, -1.39f, -1.5f)
                verticalLineToRelative(-2.44f)
                curveToRelative(0f, -0.74f, 0.55f, -1.38f, 1.28f, -1.48f)
                curveToRelative(2.89f, -0.42f, 4.68f, -1.62f, 4.68f, -6.34f)
                curveToRelative(0f, -4.87f, -1.76f, -6.51f, -6.96f, -6.51f)
                reflectiveCurveToRelative(-6.96f, 1.64f, -6.96f, 6.49f)
                curveToRelative(0f, 4.73f, 1.79f, 5.93f, 4.68f, 6.35f)
                curveToRelative(0.74f, 0.11f, 1.28f, 0.74f, 1.28f, 1.48f)
                verticalLineToRelative(2.44f)
                curveToRelative(0f, 0.78f, -0.6f, 1.43f, -1.37f, 1.5f)
                curveToRelative(-2.78f, 0.23f, -5.08f, 0.55f, -5.83f, 0.7f)
                curveToRelative(-0.82f, 0.16f, -1.6f, -0.36f, -1.77f, -1.17f)
                reflectiveCurveToRelative(0.36f, -1.6f, 1.17f, -1.77f)
                curveToRelative(0.76f, -0.15f, 2.39f, -0.38f, 4.37f, -0.58f)
                curveToRelative(-3.77f, -1.12f, -5.53f, -4.0f, -5.53f, -8.94f)
                curveToRelative(0.0f, -6.58f, 3.07f, -9.51f, 9.96f, -9.51f)
                reflectiveCurveToRelative(9.96f, 2.93f, 9.96f, 9.49f)
                curveToRelative(0f, 4.93f, -1.76f, 7.81f, -5.5f, 8.94f)
                curveToRelative(2.06f, 0.2f, 3.64f, 0.44f, 4.37f, 0.6f)
                curveToRelative(0.81f, 0.18f, 1.31f, 0.99f, 1.13f, 1.79f)
                curveToRelative(-0.16f, 0.7f, -0.78f, 1.17f, -1.46f, 1.17f)
                close()
            }
        }.also { _Omega = it}

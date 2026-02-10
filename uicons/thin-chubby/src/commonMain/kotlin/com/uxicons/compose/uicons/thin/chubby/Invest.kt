package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Invest: ImageVector? = null

val Icons.Tc.Invest: ImageVector
    get() = _Invest ?: UXIcon(name = "Invest") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.12f, 7.31f)
                curveToRelative(-0.27f, -0.07f, -0.54f, 0.1f, -0.6f, 0.37f)
                curveToRelative(-0.06f, 0.27f, 0.1f, 0.54f, 0.37f, 0.6f)
                curveToRelative(2.89f, 0.69f, 4.12f, 2.7f, 4.12f, 6.71f)
                curveToRelative(0f, 1.92f, -0.27f, 3.38f, -0.87f, 4.47f)
                curveToRelative(-1.68f, -1.29f, -4f, -3.23f, -5.63f, -5.62f)
                verticalLineToRelative(-11.27f)
                curveToRelative(0.77f, 0.67f, 1.49f, 1.4f, 2.1f, 2.22f)
                curveToRelative(0.17f, 0.22f, 0.48f, 0.27f, 0.7f, 0.1f)
                curveToRelative(0.22f, -0.17f, 0.27f, -0.48f, 0.1f, -0.7f)
                curveToRelative(-0.88f, -1.17f, -1.92f, -2.22f, -3.1f, -3.1f)
                curveToRelative(-0.18f, -0.12f, -0.42f, -0.12f, -0.6f, 0f)
                curveToRelative(-1.18f, 0.88f, -2.22f, 1.93f, -3.1f, 3.1f)
                curveToRelative(-0.17f, 0.22f, -0.12f, 0.53f, 0.1f, 0.7f)
                reflectiveCurveToRelative(0.53f, 0.12f, 0.7f, -0.1f)
                curveToRelative(0.61f, -0.82f, 1.33f, -1.55f, 2.1f, -2.22f)
                verticalLineToRelative(4.43f)
                curveToRelative(-5.25f, 0.14f, -7.5f, 2.55f, -7.5f, 7.99f)
                curveToRelative(0f, 5.61f, 2.39f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -2.39f, 8.0f, -8.0f)
                curveToRelative(0f, -4.51f, -1.51f, -6.88f, -4.88f, -7.69f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.1f, 0f, -7.0f, -1.9f, -7.0f, -7.0f)
                curveToRelative(0f, -4.93f, 1.78f, -6.86f, 6.5f, -6.99f)
                verticalLineToRelative(5.99f)
                curveToRelative(0f, 0.1f, 0.03f, 0.2f, 0.08f, 0.28f)
                curveToRelative(1.72f, 2.58f, 4.18f, 4.64f, 5.95f, 6.0f)
                curveToRelative(-1.1f, 1.21f, -2.88f, 1.73f, -5.54f, 1.73f)
                close()
            }
        }.also { _Invest = it}

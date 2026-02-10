package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Invest: ImageVector? = null

val Icons.Sc.Invest: ImageVector
    get() = _Invest ?: UXIcon(name = "Invest") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 14.72f)
                verticalLineToRelative(-4.72f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.18f, 0.05f, 0.35f, 0.14f, 0.51f)
                curveToRelative(1.11f, 1.89f, 3.47f, 3.87f, 6.28f, 6.12f)
                curveToRelative(-1.29f, 0.93f, -3.08f, 1.38f, -5.42f, 1.38f)
                curveToRelative(-5.53f, 0f, -8f, -2.47f, -8f, -8f)
                curveToRelative(0f, -5.0f, 2.03f, -7.49f, 6.5f, -7.92f)
                verticalLineToRelative(-0.96f)
                curveToRelative(-0.52f, 0.47f, -1.32f, 0.52f, -1.9f, 0.08f)
                curveToRelative(-0.66f, -0.5f, -0.8f, -1.44f, -0.3f, -2.1f)
                curveToRelative(0.8f, -1.06f, 1.74f, -2.0f, 2.8f, -2.8f)
                curveToRelative(0.26f, -0.18f, 0.57f, -0.3f, 0.9f, -0.3f)
                curveToRelative(0.33f, 0.0f, 0.64f, 0.12f, 0.9f, 0.3f)
                curveToRelative(1.06f, 0.8f, 2.0f, 1.74f, 2.8f, 2.8f)
                curveToRelative(0.5f, 0.66f, 0.36f, 1.6f, -0.3f, 2.1f)
                curveToRelative(-0.57f, 0.43f, -1.37f, 0.39f, -1.9f, -0.09f)
                verticalLineToRelative(0.97f)
                curveToRelative(4.47f, 0.43f, 6.5f, 2.92f, 6.5f, 7.92f)
                curveToRelative(0f, 2.19f, -0.39f, 3.89f, -1.21f, 5.16f)
                curveToRelative(-2.5f, -2.0f, -4.77f, -3.88f, -5.79f, -5.44f)
                close()
            }
        }.also { _Invest = it}

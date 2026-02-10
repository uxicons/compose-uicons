package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plug: ImageVector? = null

val Icons.Sc.Plug: ImageVector
    get() = _Plug ?: UXIcon(name = "Plug") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.73f, 6.74f)
                curveToRelative(-1.22f, -0.19f, -2.47f, -0.34f, -3.73f, -0.45f)
                verticalLineToRelative(-3.79f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.58f)
                curveToRelative(-2.0f, -0.09f, -4.0f, -0.09f, -6f, 0f)
                verticalLineToRelative(-3.58f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.79f)
                curveToRelative(-1.26f, 0.12f, -2.51f, 0.26f, -3.73f, 0.45f)
                curveToRelative(-0.82f, 0.13f, -1.38f, 0.9f, -1.25f, 1.71f)
                curveToRelative(0.13f, 0.82f, 0.89f, 1.38f, 1.71f, 1.25f)
                curveToRelative(0.09f, -0.01f, 0.18f, -0.02f, 0.27f, -0.04f)
                verticalLineToRelative(1.33f)
                curveToRelative(0f, 5.7f, 2.33f, 8.5f, 7.5f, 8.93f)
                verticalLineToRelative(1.57f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.57f)
                curveToRelative(5.17f, -0.43f, 7.5f, -3.23f, 7.5f, -8.93f)
                curveToRelative(0.0f, -0.39f, 0.01f, -0.96f, 0.01f, -1.33f)
                curveToRelative(0.16f, 0.02f, 0.33f, 0.05f, 0.49f, 0.05f)
                curveToRelative(0.73f, 0f, 1.36f, -0.53f, 1.48f, -1.27f)
                curveToRelative(0.13f, -0.82f, -0.43f, -1.59f, -1.25f, -1.71f)
                close()
            }
        }.also { _Plug = it}

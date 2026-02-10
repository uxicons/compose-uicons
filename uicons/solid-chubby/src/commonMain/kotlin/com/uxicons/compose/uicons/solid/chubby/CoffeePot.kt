package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeePot: ImageVector? = null

val Icons.Sc.CoffeePot: ImageVector
    get() = _CoffeePot ?: UXIcon(name = "CoffeePot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.83f, 6.59f)
                curveToRelative(1.22f, -0.28f, 3.25f, -0.6f, 6.17f, -0.6f)
                curveToRelative(2.29f, 0f, 4.03f, 0.2f, 5.26f, 0.42f)
                lineToRelative(0.31f, -1.77f)
                curveToRelative(0.82f, 0.79f, 1.31f, 1.88f, 1.31f, 3.06f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -2.36f, -1.3f, -4.48f, -3.4f, -5.55f)
                curveToRelative(0f, 0f, -2.19f, -1.14f, -6.19f, -1.14f)
                curveToRelative(-3.86f, 0f, -6.46f, 0.97f, -6.57f, 1.01f)
                curveToRelative(-0.27f, 0.1f, -0.48f, 0.31f, -0.58f, 0.58f)
                curveToRelative(-0.1f, 0.27f, -0.09f, 0.56f, 0.05f, 0.82f)
                lineToRelative(1.65f, 3.19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.07f, 13.83f)
                curveToRelative(-0.53f, -2.31f, -1.42f, -3.91f, -2.25f, -4.97f)
                curveToRelative(-0.01f, -0.0f, -2.18f, -0.87f, -6.82f, -0.87f)
                reflectiveCurveToRelative(-6.82f, 0.87f, -6.82f, 0.87f)
                curveToRelative(-0.65f, 0.83f, -1.33f, 1.99f, -1.85f, 3.57f)
                horizontalLineTo(13.21f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(2.81f)
                curveToRelative(-0.59f, 3.34f, 0.2f, 6.67f, 0.24f, 6.82f)
                curveToRelative(0.09f, 0.37f, 0.38f, 0.65f, 0.74f, 0.74f)
                curveToRelative(0.18f, 0.04f, 4.38f, 1.02f, 8.2f, 1.02f)
                reflectiveCurveToRelative(8.03f, -0.98f, 8.2f, -1.02f)
                curveToRelative(0.37f, -0.09f, 0.65f, -0.37f, 0.74f, -0.74f)
                curveToRelative(0.04f, -0.16f, 0.93f, -3.89f, 0.12f, -7.42f)
                close()
            }
        }.also { _CoffeePot = it}

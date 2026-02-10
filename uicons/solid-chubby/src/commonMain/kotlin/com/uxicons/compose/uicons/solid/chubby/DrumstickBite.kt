package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrumstickBite: ImageVector? = null

val Icons.Sc.DrumstickBite: ImageVector
    get() = _DrumstickBite ?: UXIcon(name = "DrumstickBite") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.8f, 10.34f)
                curveToRelative(-0.13f, 0.46f, -0.58f, 0.76f, -1.06f, 0.72f)
                curveToRelative(-0.39f, -0.04f, -0.8f, -0.06f, -1.24f, -0.06f)
                curveToRelative(-4.11f, 0f, -5.5f, 1.39f, -5.5f, 5.5f)
                curveToRelative(0.01f, 0.46f, -0.29f, 0.94f, -0.73f, 1.07f)
                curveToRelative(-1.02f, 0.28f, -1.99f, 0.42f, -2.88f, 0.42f)
                curveToRelative(-1.02f, 0f, -1.92f, -0.21f, -2.69f, -0.57f)
                lineToRelative(-3.09f, 3.09f)
                curveToRelative(0.24f, 0.27f, 0.39f, 0.61f, 0.39f, 0.99f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -0.24f, 0.06f, -0.46f, 0.16f, -0.66f)
                curveToRelative(-0.2f, 0.1f, -0.42f, 0.16f, -0.66f, 0.16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.38f, 0f, 0.73f, 0.15f, 0.99f, 0.39f)
                lineToRelative(3.06f, -3.06f)
                curveToRelative(-0.65f, -1.36f, -0.74f, -3.17f, -0.22f, -5.24f)
                curveToRelative(0.59f, -2.38f, 1.91f, -4.77f, 3.52f, -6.37f)
                curveToRelative(1.85f, -1.85f, 3.51f, -2.71f, 5.22f, -2.71f)
                reflectiveCurveToRelative(3.37f, 0.86f, 5.22f, 2.71f)
                curveToRelative(1.47f, 1.47f, 3.33f, 3.76f, 2.51f, 6.63f)
                close()
            }
        }.also { _DrumstickBite = it}

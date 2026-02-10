package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWinter: ImageVector? = null

val Icons.Sc.HatWinter: ImageVector
    get() = _HatWinter ?: UXIcon(name = "HatWinter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 3f)
                curveToRelative(0f, 1.43f, -0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                curveToRelative(0f, -1.43f, 0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                close()
                moveTo(20.07f, 17.32f)
                curveToRelative(-1.59f, -0.15f, -4.27f, -0.32f, -8.07f, -0.32f)
                reflectiveCurveToRelative(-6.48f, 0.18f, -8.07f, 0.32f)
                curveToRelative(-1.66f, 0.16f, -2.92f, 1.5f, -2.93f, 3.18f)
                curveToRelative(0f, 0.42f, 0.04f, 0.82f, 0.13f, 1.24f)
                reflectiveCurveToRelative(0.44f, 0.73f, 0.86f, 0.78f)
                curveToRelative(1.2f, 0.14f, 4.58f, 0.48f, 10.01f, 0.48f)
                reflectiveCurveToRelative(8.81f, -0.33f, 10.01f, -0.48f)
                curveToRelative(0.42f, -0.05f, 0.77f, -0.36f, 0.86f, -0.78f)
                reflectiveCurveToRelative(0.13f, -0.82f, 0.13f, -1.24f)
                curveToRelative(-0.01f, -1.63f, -1.27f, -3.02f, -2.93f, -3.18f)
                close()
                moveTo(15.25f, 5.58f)
                curveToRelative(-0.67f, 0.91f, -1.77f, 1.42f, -3.25f, 1.42f)
                curveToRelative(-1.46f, 0f, -2.55f, -0.5f, -3.22f, -1.39f)
                curveToRelative(-2.72f, 2.19f, -6.57f, 6f, -6.76f, 10.2f)
                curveToRelative(0.53f, -0.25f, 1.11f, -0.42f, 1.73f, -0.48f)
                curveToRelative(1.63f, -0.15f, 4.38f, -0.33f, 8.26f, -0.33f)
                reflectiveCurveToRelative(6.63f, 0.18f, 8.25f, 0.33f)
                curveToRelative(0.62f, 0.06f, 1.2f, 0.23f, 1.73f, 0.48f)
                curveToRelative(-0.11f, -4.33f, -3.92f, -8.04f, -6.74f, -10.23f)
                close()
            }
        }.also { _HatWinter = it}

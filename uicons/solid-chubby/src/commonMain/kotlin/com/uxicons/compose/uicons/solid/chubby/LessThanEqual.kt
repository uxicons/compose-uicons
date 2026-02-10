package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThanEqual: ImageVector? = null

val Icons.Sc.LessThanEqual: ImageVector
    get() = _LessThanEqual ?: UXIcon(name = "LessThanEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.94f, 21.92f)
                curveToRelative(-0.19f, 0.66f, -0.79f, 1.08f, -1.44f, 1.08f)
                curveToRelative(-1.69f, -0.32f, -3.8f, -1.02f, -7.5f, -1f)
                curveToRelative(-3.33f, 0f, -5.87f, 0.59f, -7.08f, 0.94f)
                curveToRelative(-0.8f, 0.23f, -1.63f, -0.23f, -1.86f, -1.02f)
                curveToRelative(-0.23f, -0.8f, 0.23f, -1.63f, 1.02f, -1.86f)
                curveToRelative(1.37f, -0.4f, 4.21f, -1.06f, 7.92f, -1.06f)
                reflectiveCurveToRelative(6.55f, 0.66f, 7.92f, 1.06f)
                curveToRelative(0.8f, 0.23f, 1.25f, 1.06f, 1.02f, 1.86f)
                close()
                moveTo(19.38f, 18.0f)
                curveToRelative(0.81f, 0.07f, 1.55f, -0.55f, 1.62f, -1.37f)
                curveToRelative(0.07f, -0.82f, -0.55f, -1.55f, -1.37f, -1.62f)
                curveToRelative(-5.84f, -0.47f, -10.66f, -3.77f, -12.83f, -5.5f)
                curveToRelative(2.17f, -1.74f, 6.99f, -5.03f, 12.83f, -5.5f)
                curveToRelative(0.83f, -0.07f, 1.44f, -0.79f, 1.37f, -1.62f)
                curveToRelative(-0.07f, -0.83f, -0.79f, -1.43f, -1.62f, -1.37f)
                curveToRelative(-9.07f, 0.74f, -15.66f, 7.16f, -15.93f, 7.43f)
                curveToRelative(-0.28f, 0.28f, -0.45f, 0.67f, -0.45f, 1.07f)
                reflectiveCurveToRelative(0.16f, 0.79f, 0.45f, 1.07f)
                curveToRelative(0.28f, 0.27f, 6.87f, 6.69f, 15.93f, 7.43f)
                close()
            }
        }.also { _LessThanEqual = it}

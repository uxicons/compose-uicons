package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SteeringWheel: ImageVector? = null

val Icons.Sc.SteeringWheel: ImageVector
    get() = _SteeringWheel ?: UXIcon(name = "SteeringWheel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.07f)
                curveTo(7.28f, 1.07f, 1f, 2.21f, 1f, 12f)
                reflectiveCurveToRelative(6.28f, 10.93f, 11f, 10.93f)
                reflectiveCurveToRelative(11f, -1.13f, 11f, -10.93f)
                reflectiveCurveTo(16.72f, 1.07f, 12f, 1.07f)
                close()
                moveTo(12f, 4.08f)
                curveToRelative(3.22f, 0f, 5.64f, 0.56f, 6.93f, 2.78f)
                curveToRelative(-1.44f, 0.74f, -4.06f, 1.15f, -7.17f, 1.07f)
                curveToRelative(-3.08f, -0.08f, -5.45f, -0.6f, -6.67f, -1.12f)
                curveToRelative(1.3f, -2.18f, 3.71f, -2.74f, 6.91f, -2.74f)
                close()
                moveTo(4.01f, 12.7f)
                curveToRelative(2.1f, 0.86f, 4.02f, 2.98f, 4.41f, 6.85f)
                curveToRelative(-2.65f, -0.7f, -4.25f, -2.55f, -4.41f, -6.85f)
                close()
                moveTo(15.58f, 19.55f)
                curveToRelative(0.41f, -3.85f, 2.32f, -5.96f, 4.41f, -6.83f)
                curveToRelative(-0.16f, 4.29f, -1.76f, 6.13f, -4.41f, 6.83f)
                close()
            }
        }.also { _SteeringWheel = it}

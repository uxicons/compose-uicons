package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleN: ImageVector? = null

val Icons.Sc.CircleN: ImageVector
    get() = _CircleN ?: UXIcon(name = "CircleN") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(16.47f, 6.76f)
                curveToRelative(0.02f, 0.09f, 0.53f, 2.15f, 0.53f, 5.24f)
                reflectiveCurveToRelative(-0.51f, 5.16f, -0.53f, 5.24f)
                curveToRelative(-0.1f, 0.38f, -0.4f, 0.67f, -0.79f, 0.74f)
                curveToRelative(-0.38f, 0.07f, -0.78f, -0.09f, -1.0f, -0.41f)
                lineToRelative(-5.57f, -7.96f)
                curveToRelative(-0.06f, 0.68f, -0.11f, 1.49f, -0.11f, 2.38f)
                curveToRelative(0f, 2.82f, 0.47f, 4.74f, 0.47f, 4.76f)
                curveToRelative(0.13f, 0.54f, -0.19f, 1.08f, -0.73f, 1.21f)
                curveToRelative(-0.54f, 0.14f, -1.08f, -0.19f, -1.21f, -0.73f)
                curveToRelative(-0.02f, -0.09f, -0.53f, -2.15f, -0.53f, -5.24f)
                reflectiveCurveToRelative(0.51f, -5.16f, 0.53f, -5.24f)
                curveToRelative(0.1f, -0.38f, 0.4f, -0.67f, 0.79f, -0.74f)
                curveToRelative(0.38f, -0.07f, 0.78f, 0.09f, 1.0f, 0.41f)
                lineToRelative(5.57f, 7.96f)
                curveToRelative(0.06f, -0.68f, 0.11f, -1.49f, 0.11f, -2.38f)
                curveToRelative(0f, -2.82f, -0.47f, -4.74f, -0.47f, -4.76f)
                curveToRelative(-0.13f, -0.54f, 0.19f, -1.08f, 0.73f, -1.21f)
                curveToRelative(0.53f, -0.14f, 1.08f, 0.19f, 1.21f, 0.73f)
                close()
            }
        }.also { _CircleN = it}

package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleDown: ImageVector? = null

val Icons.Tr.AngleCircleDown: ImageVector
    get() = _AngleCircleDown ?: UXIcon(name = "AngleCircleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.65f, 11.12f)
                lineToRelative(-2.88f, 2.83f)
                curveToRelative(-0.19f, 0.19f, -0.47f, 0.45f, -0.77f, 0.71f)
                curveToRelative(-0.57f, 0.5f, -1.42f, 0.5f, -1.99f, 0f)
                curveToRelative(-0.3f, -0.27f, -0.59f, -0.53f, -0.78f, -0.72f)
                lineToRelative(-2.88f, -2.83f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                reflectiveCurveToRelative(-0.19f, 0.51f, 0.01f, 0.71f)
                lineToRelative(2.88f, 2.83f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.47f, 0.82f, 0.76f)
                curveToRelative(0.47f, 0.42f, 1.06f, 0.63f, 1.66f, 0.63f)
                reflectiveCurveToRelative(1.19f, -0.21f, 1.66f, -0.63f)
                curveToRelative(0.32f, -0.28f, 0.62f, -0.56f, 0.81f, -0.75f)
                lineToRelative(2.88f, -2.83f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                close()
            }
        }.also { _AngleCircleDown = it}

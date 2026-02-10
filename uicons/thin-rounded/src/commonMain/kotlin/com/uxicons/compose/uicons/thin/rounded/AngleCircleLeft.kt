package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleLeft: ImageVector? = null

val Icons.Tr.AngleCircleLeft: ImageVector
    get() = _AngleCircleLeft ?: UXIcon(name = "AngleCircleLeft") {
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
                moveTo(10.05f, 10.23f)
                lineToRelative(2.83f, -2.88f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.01f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.19f, -0.71f, 0.01f)
                lineToRelative(-2.83f, 2.88f)
                curveToRelative(-0.2f, 0.2f, -0.47f, 0.5f, -0.76f, 0.82f)
                curveToRelative(-0.84f, 0.94f, -0.84f, 2.37f, 0f, 3.31f)
                curveToRelative(0.28f, 0.32f, 0.56f, 0.62f, 0.75f, 0.81f)
                lineToRelative(2.83f, 2.88f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                curveToRelative(0.13f, 0f, 0.25f, -0.05f, 0.35f, -0.14f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                lineToRelative(-2.83f, -2.88f)
                curveToRelative(-0.19f, -0.19f, -0.45f, -0.47f, -0.71f, -0.77f)
                curveToRelative(-0.5f, -0.57f, -0.5f, -1.42f, 0f, -1.99f)
                curveToRelative(0.27f, -0.3f, 0.53f, -0.59f, 0.72f, -0.78f)
                close()
            }
        }.also { _AngleCircleLeft = it}

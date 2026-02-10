package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHalf: ImageVector? = null

val Icons.Br.CircleHalf: ImageVector
    get() = _CircleHalf ?: UXIcon(name = "CircleHalf") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.49f, 24f)
            curveToRelative(-0.25f, 0f, -0.51f, -0.03f, -0.76f, -0.08f)
            curveTo(4f, 22.67f, 0f, 17.77f, 0f, 12f)
            reflectiveCurveTo(4f, 1.33f, 9.73f, 0.08f)
            curveToRelative(1.05f, -0.23f, 2.13f, 0.03f, 2.97f, 0.7f)
            curveToRelative(0.83f, 0.67f, 1.3f, 1.66f, 1.3f, 2.72f)
            lineTo(14f, 20.5f)
            curveToRelative(0f, 1.06f, -0.47f, 2.05f, -1.3f, 2.72f)
            curveToRelative(-0.63f, 0.51f, -1.41f, 0.78f, -2.21f, 0.78f)
            close()
            moveTo(10.49f, 3f)
            reflectiveCurveToRelative(-0.08f, 0f, -0.12f, 0.01f)
            curveTo(6.03f, 3.96f, 3f, 7.65f, 3f, 12f)
            reflectiveCurveToRelative(3.03f, 8.04f, 7.37f, 8.99f)
            curveToRelative(0.22f, 0.05f, 0.38f, -0.04f, 0.45f, -0.1f)
            curveToRelative(0.08f, -0.07f, 0.18f, -0.19f, 0.18f, -0.39f)
            lineTo(11f, 3.5f)
            curveToRelative(0f, -0.2f, -0.1f, -0.32f, -0.18f, -0.39f)
            curveToRelative(-0.06f, -0.05f, -0.17f, -0.12f, -0.33f, -0.12f)
            close()
        }
    }.also { _CircleHalf = it }

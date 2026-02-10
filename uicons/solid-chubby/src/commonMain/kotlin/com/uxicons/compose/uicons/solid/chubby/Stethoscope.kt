package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stethoscope: ImageVector? = null

val Icons.Sc.Stethoscope: ImageVector
    get() = _Stethoscope ?: UXIcon(name = "Stethoscope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.85f, 10.86f)
                curveToRelative(0f, -2.2f, -1.25f, -3.46f, -3.42f, -3.46f)
                reflectiveCurveToRelative(-3.42f, 1.26f, -3.42f, 3.46f)
                curveToRelative(0f, 1.62f, 0.68f, 2.73f, 1.9f, 3.2f)
                curveToRelative(-0.02f, 0.66f, -0.05f, 1.33f, -0.1f, 2.0f)
                curveToRelative(-0.16f, 2.19f, -1.85f, 3.94f, -4.0f, 3.94f)
                curveToRelative(-2.11f, 0f, -3.85f, -1.72f, -4.01f, -3.88f)
                curveToRelative(-0.02f, -0.27f, -0.04f, -0.54f, -0.05f, -0.83f)
                curveToRelative(3.73f, -0.48f, 5.55f, -2.86f, 5.55f, -7.22f)
                curveToRelative(0f, -3.89f, -1.5f, -6.26f, -4.46f, -7.03f)
                curveToRelative(-0.8f, -0.21f, -1.62f, 0.27f, -1.83f, 1.08f)
                curveToRelative(-0.21f, 0.8f, 0.27f, 1.62f, 1.08f, 1.83f)
                curveToRelative(1.15f, 0.3f, 2.22f, 1.0f, 2.22f, 4.12f)
                curveToRelative(0f, 3.65f, -1.38f, 4.32f, -4.08f, 4.32f)
                reflectiveCurveToRelative(-4.08f, -0.67f, -4.08f, -4.32f)
                curveToRelative(0f, -3.11f, 1.07f, -3.82f, 2.22f, -4.12f)
                curveToRelative(0.8f, -0.21f, 1.28f, -1.03f, 1.07f, -1.83f)
                curveToRelative(-0.21f, -0.8f, -1.03f, -1.28f, -1.83f, -1.07f)
                curveTo(2.65f, 1.83f, 1.15f, 4.19f, 1.15f, 8.07f)
                curveToRelative(0f, 4.38f, 1.84f, 6.76f, 5.61f, 7.23f)
                curveToRelative(0.02f, 0.36f, 0.04f, 0.7f, 0.06f, 1.03f)
                curveToRelative(0.27f, 3.71f, 3.31f, 6.66f, 6.99f, 6.66f)
                curveToRelative(3.7f, 0f, 6.73f, -2.98f, 7.0f, -6.72f)
                curveToRelative(0.05f, -0.73f, 0.09f, -1.47f, 0.11f, -2.2f)
                curveToRelative(1.25f, -0.47f, 1.94f, -1.58f, 1.94f, -3.22f)
                close()
            }
        }.also { _Stethoscope = it}

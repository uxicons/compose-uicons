package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle2: ImageVector? = null

val Icons.Br.Circle2: ImageVector
    get() = _Circle2 ?: UXIcon(name = "Circle2") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
            close()
            moveTo(12f, 3f)
            curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            reflectiveCurveTo(16.96f, 3f, 12f, 3f)
            close()
            moveTo(16.5f, 16.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3.18f)
            curveToRelative(0.14f, -0.08f, 0.27f, -0.16f, 0.41f, -0.24f)
            curveToRelative(1.8f, -1.05f, 4.27f, -2.5f, 4.26f, -5.44f)
            curveToRelative(-0.0f, -2.38f, -2.02f, -4.32f, -4.5f, -4.32f)
            reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            curveToRelative(0.81f, 0f, 1.5f, 0.61f, 1.5f, 1.33f)
            curveToRelative(0.0f, 1.13f, -1.05f, 1.83f, -2.78f, 2.84f)
            curveToRelative(-0.97f, 0.57f, -1.97f, 1.15f, -2.65f, 1.96f)
            curveToRelative(-0.6f, 0.71f, -0.73f, 1.67f, -0.34f, 2.52f)
            curveToRelative(0.39f, 0.83f, 1.2f, 1.35f, 2.12f, 1.35f)
            horizontalLineToRelative(5.16f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _Circle2 = it }

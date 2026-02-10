package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MaskSnorkel: ImageVector? = null

val Icons.Br.MaskSnorkel: ImageVector
    get() = _MaskSnorkel ?: UXIcon(name = "MaskSnorkel") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(8.69f, 10.81f)
            curveToRelative(0.38f, -0.42f, 0.65f, -0.63f, 0.81f, -0.74f)
            curveToRelative(0.15f, 0.1f, 0.42f, 0.32f, 0.8f, 0.74f)
            curveToRelative(0.69f, 0.76f, 1.67f, 1.19f, 2.7f, 1.19f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(16.31f, 0f, 13f, 0f)
            horizontalLineToRelative(-7f)
            curveTo(2.69f, 0f, 0f, 2.69f, 0f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            curveToRelative(1.02f, 0f, 2.0f, -0.43f, 2.69f, -1.19f)
            close()
            moveTo(6.48f, 8.79f)
            curveToRelative(-0.12f, 0.14f, -0.3f, 0.21f, -0.48f, 0.21f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            horizontalLineToRelative(7f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            curveToRelative(-0.18f, 0f, -0.36f, -0.07f, -0.48f, -0.21f)
            curveToRelative(-1.12f, -1.22f, -2.08f, -1.78f, -3.02f, -1.78f)
            reflectiveCurveToRelative(-1.9f, 0.57f, -3.02f, 1.79f)
            close()
            moveTo(24f, 1.5f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
            lineTo(21f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _MaskSnorkel = it }

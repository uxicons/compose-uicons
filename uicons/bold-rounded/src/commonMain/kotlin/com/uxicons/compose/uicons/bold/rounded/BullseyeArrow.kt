package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BullseyeArrow: ImageVector? = null

val Icons.Br.BullseyeArrow: ImageVector
    get() = _BullseyeArrow ?: UXIcon(name = "BullseyeArrow") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 12f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveTo(0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            curveToRelative(0.19f, 0f, 0.38f, 0f, 0.57f, 0.01f)
            curveToRelative(0.83f, 0.04f, 1.47f, 0.74f, 1.43f, 1.57f)
            curveToRelative(-0.04f, 0.83f, -0.72f, 1.45f, -1.57f, 1.43f)
            curveToRelative(-0.14f, 0f, -0.29f, -0.01f, -0.43f, -0.01f)
            curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            curveToRelative(0f, -0.14f, 0f, -0.29f, -0.01f, -0.43f)
            curveToRelative(-0.04f, -0.83f, 0.6f, -1.53f, 1.43f, -1.57f)
            curveToRelative(0.85f, -0.03f, 1.53f, 0.6f, 1.57f, 1.43f)
            curveToRelative(0f, 0.19f, 0.01f, 0.38f, 0.01f, 0.57f)
            close()
            moveTo(10.91f, 8.15f)
            curveToRelative(0.8f, -0.23f, 1.26f, -1.05f, 1.04f, -1.85f)
            reflectiveCurveToRelative(-1.06f, -1.26f, -1.85f, -1.04f)
            curveToRelative(-3f, 0.85f, -5.09f, 3.62f, -5.09f, 6.74f)
            curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
            curveToRelative(3.12f, 0f, 5.89f, -2.09f, 6.74f, -5.09f)
            curveToRelative(0.23f, -0.8f, -0.24f, -1.63f, -1.04f, -1.85f)
            curveToRelative(-0.8f, -0.23f, -1.63f, 0.24f, -1.85f, 1.04f)
            curveToRelative(-0.48f, 1.71f, -2.07f, 2.91f, -3.85f, 2.91f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            curveToRelative(0f, -1.78f, 1.2f, -3.37f, 2.91f, -3.85f)
            close()
            moveTo(10.94f, 10.94f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(5.06f, -5.06f)
            horizontalLineToRelative(2.38f)
            curveToRelative(0.4f, 0f, 0.78f, -0.16f, 1.06f, -0.44f)
            lineToRelative(2f, -2f)
            curveToRelative(0.43f, -0.43f, 0.56f, -1.07f, 0.33f, -1.63f)
            curveToRelative(-0.23f, -0.56f, -0.78f, -0.93f, -1.39f, -0.93f)
            horizontalLineToRelative(-1.5f)
            lineTo(21f, 1.5f)
            curveToRelative(0f, -0.61f, -0.37f, -1.15f, -0.93f, -1.39f)
            curveToRelative(-0.56f, -0.23f, -1.21f, -0.1f, -1.63f, 0.33f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.28f, 0.28f, -0.44f, 0.66f, -0.44f, 1.06f)
            verticalLineToRelative(2.38f)
            lineToRelative(-5.06f, 5.06f)
            close()
        }
    }.also { _BullseyeArrow = it }

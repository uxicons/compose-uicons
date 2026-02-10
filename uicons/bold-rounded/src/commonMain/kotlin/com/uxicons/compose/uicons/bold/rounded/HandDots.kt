package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandDots: ImageVector? = null

val Icons.Br.HandDots: ImageVector
    get() = _HandDots ?: UXIcon(name = "HandDots") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 9.5f)
            lineTo(16f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            lineTo(19f, 9.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(12.5f, 11f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(14f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            lineTo(11f, 9.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(22.5f, 2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-6.16f)
            curveToRelative(-1.52f, 0f, -2.98f, -0.64f, -4.02f, -1.74f)
            lineToRelative(-0.45f, -0.48f)
            curveToRelative(0.06f, -0.02f, 0.12f, -0.04f, 0.17f, -0.07f)
            curveToRelative(1.18f, -0.49f, 1.95f, -1.64f, 1.95f, -2.92f)
            lineTo(9f, 3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            lineTo(6f, 15.79f)
            curveToRelative(0f, 0.04f, 0f, 0.1f, -0.1f, 0.14f)
            curveToRelative(-0.1f, 0.04f, -0.14f, -0.01f, -0.17f, -0.03f)
            curveToRelative(0f, 0f, -2.48f, -2.49f, -2.56f, -2.54f)
            curveToRelative(-0.7f, -0.48f, -1.81f, -0.56f, -2.6f, 0.23f)
            curveToRelative(-0.8f, 0.8f, -0.69f, 1.94f, -0.16f, 2.65f)
            curveToRelative(0.04f, 0.05f, 4.72f, 5.07f, 4.72f, 5.07f)
            curveToRelative(1.6f, 1.71f, 3.86f, 2.69f, 6.21f, 2.69f)
            horizontalLineToRelative(6.16f)
            curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
            lineTo(24.0f, 3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(12f, 14.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            close()
            moveTo(17f, 14.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            close()
            moveTo(16.5f, 20f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(11.5f, 20f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            close()
        }
    }.also { _HandDots = it }

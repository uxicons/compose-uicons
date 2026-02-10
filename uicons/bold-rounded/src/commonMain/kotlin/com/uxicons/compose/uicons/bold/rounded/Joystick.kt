package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Joystick: ImageVector? = null

val Icons.Br.Joystick: ImageVector
    get() = _Joystick ?: UXIcon(name = "Joystick") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20f, 16f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.09f, -0.01f, -0.17f, -0.03f, -0.25f)
            curveToRelative(2.04f, -0.63f, 3.52f, -2.51f, 3.52f, -4.75f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
            curveToRelative(0f, 2.24f, 1.49f, 4.12f, 3.52f, 4.75f)
            curveToRelative(-0.01f, 0.08f, -0.03f, 0.16f, -0.03f, 0.25f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-6.5f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(16f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveTo(12f, 3f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            close()
            moveTo(20f, 21f)
            lineTo(4f, 21f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(16f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            close()
        }
    }.also { _Joystick = it }

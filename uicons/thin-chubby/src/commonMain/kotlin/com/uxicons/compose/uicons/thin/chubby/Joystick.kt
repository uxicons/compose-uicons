package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Joystick: ImageVector? = null

val Icons.Tc.Joystick: ImageVector
    get() = _Joystick ?: UXIcon(name = "Joystick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.67f, 16.2f)
                curveToRelative(-0.09f, -0.03f, -1.54f, -0.55f, -4.67f, -0.9f)
                verticalLineToRelative(-0.8f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(0.7f)
                curveToRelative(-1.27f, -0.11f, -2.76f, -0.18f, -4.5f, -0.2f)
                verticalLineToRelative(-6.04f)
                curveToRelative(2.4f, -0.15f, 3.5f, -1.38f, 3.5f, -3.97f)
                curveToRelative(0f, -2.77f, -1.23f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.23f, -4f, 4f)
                curveToRelative(0f, 2.59f, 1.1f, 3.82f, 3.5f, 3.97f)
                verticalLineToRelative(6.04f)
                curveToRelative(-6.99f, 0.05f, -10.04f, 1.15f, -10.17f, 1.19f)
                curveToRelative(-0.2f, 0.07f, -0.33f, 0.26f, -0.33f, 0.47f)
                verticalLineToRelative(4.67f)
                curveToRelative(0f, 0.21f, 0.13f, 0.4f, 0.33f, 0.47f)
                curveToRelative(0.13f, 0.05f, 3.32f, 1.2f, 10.67f, 1.2f)
                reflectiveCurveToRelative(10.54f, -1.15f, 10.67f, -1.2f)
                curveToRelative(0.2f, -0.07f, 0.33f, -0.26f, 0.33f, -0.47f)
                verticalLineToRelative(-4.67f)
                curveToRelative(0f, -0.21f, -0.13f, -0.4f, -0.33f, -0.47f)
                close()
                moveTo(9f, 5f)
                curveToRelative(0f, -2.21f, 0.79f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 0.79f, 3f, 3f)
                reflectiveCurveToRelative(-0.79f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -0.79f, -3f, -3f)
                close()
                moveTo(22f, 20.97f)
                curveToRelative(-0.97f, 0.28f, -4.12f, 1.03f, -10f, 1.03f)
                reflectiveCurveToRelative(-9.03f, -0.76f, -10f, -1.03f)
                verticalLineToRelative(-3.93f)
                curveToRelative(0.97f, -0.28f, 4.12f, -1.03f, 10f, -1.03f)
                reflectiveCurveToRelative(9.03f, 0.76f, 10f, 1.03f)
                close()
            }
        }.also { _Joystick = it}

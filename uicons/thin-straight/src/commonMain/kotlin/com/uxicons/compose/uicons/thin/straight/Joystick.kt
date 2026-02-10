package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Joystick: ImageVector? = null

val Icons.Ts.Joystick: ImageVector
    get() = _Joystick ?: UXIcon(name = "Joystick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 18f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.5f)
                lineTo(12.5f, 7.97f)
                curveToRelative(1.97f, -0.25f, 3.5f, -1.93f, 3.5f, -3.97f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 2.04f, 1.53f, 3.72f, 3.5f, 3.97f)
                verticalLineToRelative(10.03f)
                lineTo(2.5f, 18f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(9f, 4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _Joystick = it}

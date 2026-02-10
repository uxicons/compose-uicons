package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Joystick: ImageVector? = null

val Icons.Sc.Joystick: ImageVector
    get() = _Joystick ?: UXIcon(name = "Joystick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 17f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.43f, -0.28f, 0.81f, -0.68f, 0.95f)
                curveToRelative(-0.13f, 0.04f, -3.23f, 1.05f, -10.32f, 1.05f)
                reflectiveCurveToRelative(-10.19f, -1.01f, -10.32f, -1.05f)
                curveToRelative(-0.41f, -0.14f, -0.68f, -0.52f, -0.68f, -0.95f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.43f, 0.28f, -0.81f, 0.68f, -0.95f)
                curveToRelative(0.12f, -0.04f, 2.8f, -0.91f, 8.82f, -1.03f)
                verticalLineToRelative(-6.21f)
                curveToRelative(-1.67f, -0.44f, -2.5f, -1.69f, -2.5f, -3.81f)
                curveToRelative(0f, -2.69f, 1.31f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.31f, 4f, 4f)
                curveToRelative(0f, 2.13f, -0.83f, 3.38f, -2.5f, 3.81f)
                verticalLineToRelative(6.21f)
                curveToRelative(0.71f, 0.01f, 1.38f, 0.04f, 2f, 0.07f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.84f)
                curveToRelative(2.54f, 0.3f, 3.74f, 0.68f, 3.82f, 0.71f)
                curveToRelative(0.41f, 0.14f, 0.68f, 0.52f, 0.68f, 0.95f)
                close()
            }
        }.also { _Joystick = it}

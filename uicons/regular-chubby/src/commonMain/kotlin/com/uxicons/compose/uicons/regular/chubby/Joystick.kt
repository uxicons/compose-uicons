package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Joystick: ImageVector? = null

val Icons.Rc.Joystick: ImageVector
    get() = _Joystick ?: UXIcon(name = "Joystick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.32f, 16.05f)
                curveToRelative(-0.08f, -0.03f, -1.44f, -0.46f, -4.32f, -0.77f)
                verticalLineToRelative(-1.29f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.12f)
                curveToRelative(-0.9f, -0.06f, -1.89f, -0.1f, -3f, -0.11f)
                verticalLineToRelative(-6.08f)
                curveToRelative(2.01f, -0.3f, 3f, -1.59f, 3f, -3.93f)
                curveToRelative(0f, -2.69f, -1.31f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.31f, -4f, 4f)
                curveToRelative(0f, 2.33f, 0.99f, 3.62f, 3f, 3.93f)
                verticalLineToRelative(6.08f)
                curveToRelative(-6.37f, 0.09f, -9.19f, 1.0f, -9.32f, 1.04f)
                curveToRelative(-0.41f, 0.14f, -0.68f, 0.52f, -0.68f, 0.95f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.43f, 0.28f, 0.81f, 0.68f, 0.95f)
                curveToRelative(0.13f, 0.04f, 3.23f, 1.05f, 10.32f, 1.05f)
                reflectiveCurveToRelative(10.19f, -1.01f, 10.32f, -1.05f)
                curveToRelative(0.41f, -0.14f, 0.68f, -0.52f, 0.68f, -0.95f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.43f, -0.28f, -0.81f, -0.68f, -0.95f)
                close()
                moveTo(10f, 5f)
                curveToRelative(0f, -1.59f, 0.41f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.41f, 2f, 2f)
                reflectiveCurveToRelative(-0.41f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.41f, -2f, -2f)
                close()
                moveTo(21f, 20.23f)
                curveToRelative(-1.22f, 0.27f, -4.12f, 0.77f, -9f, 0.77f)
                reflectiveCurveToRelative(-7.78f, -0.5f, -9f, -0.77f)
                verticalLineToRelative(-2.45f)
                curveToRelative(1.22f, -0.27f, 4.12f, -0.77f, 9f, -0.77f)
                reflectiveCurveToRelative(7.78f, 0.5f, 9f, 0.77f)
                close()
            }
        }.also { _Joystick = it}

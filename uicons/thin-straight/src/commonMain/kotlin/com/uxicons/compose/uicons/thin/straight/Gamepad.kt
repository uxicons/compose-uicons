package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gamepad: ImageVector? = null

val Icons.Ts.Gamepad: ImageVector
    get() = _Gamepad ?: UXIcon(name = "Gamepad") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                close()
                moveTo(15f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(17f, 9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(19f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(17f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 11.98f)
                curveToRelative(0f, 5.53f, -2.02f, 10.02f, -4.5f, 10.02f)
                curveToRelative(-2.11f, 0f, -3.47f, -3.73f, -3.87f, -5f)
                horizontalLineToRelative(-7.26f)
                curveToRelative(-0.4f, 1.27f, -1.76f, 5f, -3.87f, 5f)
                curveToRelative(-2.48f, 0f, -4.5f, -4.5f, -4.5f, -10.02f)
                curveTo(0f, 6.62f, 3.15f, 3.14f, 3.28f, 3f)
                horizontalLineToRelative(17.44f)
                curveToRelative(0.13f, 0.14f, 3.28f, 3.62f, 3.28f, 8.98f)
                close()
                moveTo(23f, 11.98f)
                curveToRelative(0f, -4.34f, -2.16f, -7.28f, -2.73f, -7.98f)
                lineTo(3.73f, 4f)
                curveToRelative(-0.57f, 0.7f, -2.73f, 3.65f, -2.73f, 7.98f)
                curveToRelative(0f, 5.16f, 1.85f, 9.02f, 3.5f, 9.02f)
                curveToRelative(1.25f, 0f, 2.51f, -2.84f, 3.02f, -4.64f)
                lineToRelative(0.1f, -0.36f)
                horizontalLineToRelative(8.76f)
                lineToRelative(0.1f, 0.36f)
                curveToRelative(0.51f, 1.79f, 1.77f, 4.64f, 3.02f, 4.64f)
                curveToRelative(1.65f, 0f, 3.5f, -3.86f, 3.5f, -9.02f)
                close()
            }
        }.also { _Gamepad = it}

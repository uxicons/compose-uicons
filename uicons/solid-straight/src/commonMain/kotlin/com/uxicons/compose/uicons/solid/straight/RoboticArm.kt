package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoboticArm: ImageVector? = null

val Icons.Ss.RoboticArm: ImageVector
    get() = _RoboticArm ?: UXIcon(name = "RoboticArm") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 10f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(15f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(22f, 22f)
                verticalLineToRelative(-6.7f)
                curveToRelative(-0.82f, 1.03f, -2.08f, 1.7f, -3.5f, 1.7f)
                reflectiveCurveToRelative(-2.67f, -0.67f, -3.5f, -1.7f)
                verticalLineToRelative(6.7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(9.57f, 4.02f)
                lineToRelative(-2.98f, 2.98f)
                lineTo(2.59f, 7f)
                lineTo(0.02f, 9.57f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.98f, -1.98f)
                horizontalLineToRelative(2.59f)
                verticalLineToRelative(2.59f)
                lineToRelative(-1.98f, 1.98f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.57f, -2.57f)
                verticalLineToRelative(-4f)
                lineToRelative(2.98f, -2.98f)
                curveToRelative(-0.58f, -0.34f, -1.07f, -0.83f, -1.41f, -1.41f)
                close()
                moveTo(18.46f, 8.0f)
                lineToRelative(-2.06f, -3.93f)
                curveToRelative(-0.71f, 1.17f, -2.0f, 1.93f, -3.45f, 1.91f)
                lineToRelative(2.01f, 3.77f)
                curveToRelative(0.82f, -1.05f, 2.07f, -1.74f, 3.5f, -1.75f)
                close()
            }
        }.also { _RoboticArm = it}

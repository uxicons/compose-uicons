package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoboticArm: ImageVector? = null

val Icons.Bs.RoboticArm: ImageVector
    get() = _RoboticArm ?: UXIcon(name = "RoboticArm") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 21f)
                verticalLineToRelative(-6.48f)
                curveToRelative(0.31f, -0.61f, 0.5f, -1.29f, 0.5f, -2.02f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-0.02f, 0f, -0.05f, 0.01f, -0.07f, 0.01f)
                lineToRelative(-1.8f, -3.6f)
                curveToRelative(0.23f, -0.42f, 0.37f, -0.9f, 0.37f, -1.41f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 0.01f, 0.0f, 0.03f, 0.0f, 0.04f)
                lineToRelative(-3.55f, 2.96f)
                lineTo(2.88f, 6f)
                lineTo(0.06f, 8.82f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.95f, -1.95f)
                horizontalLineToRelative(1.88f)
                verticalLineToRelative(1.88f)
                lineToRelative(-1.95f, 1.95f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.82f, -2.82f)
                verticalLineToRelative(-3.92f)
                lineToRelative(3.09f, -2.57f)
                curveToRelative(0.42f, 0.23f, 0.9f, 0.37f, 1.41f, 0.37f)
                curveToRelative(0.02f, 0f, 0.05f, -0.01f, 0.07f, -0.01f)
                lineToRelative(1.54f, 3.08f)
                curveToRelative(-0.98f, 0.83f, -1.61f, 2.04f, -1.61f, 3.42f)
                curveToRelative(0f, 0.73f, 0.19f, 1.41f, 0.5f, 2.02f)
                verticalLineToRelative(6.48f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(19.5f, 12.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(17f, 16.88f)
                curveToRelative(0.32f, 0.07f, 0.66f, 0.12f, 1f, 0.12f)
                reflectiveCurveToRelative(0.68f, -0.05f, 1f, -0.12f)
                verticalLineToRelative(4.12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.12f)
                close()
            }
        }.also { _RoboticArm = it}

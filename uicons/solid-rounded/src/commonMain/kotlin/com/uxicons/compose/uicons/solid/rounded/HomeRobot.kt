package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeRobot: ImageVector? = null

val Icons.Sr.HomeRobot: ImageVector
    get() = _HomeRobot ?: UXIcon(name = "HomeRobot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 11f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(9.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(14.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21.8f, 5.58f)
                lineTo(14.8f, 0.85f)
                curveToRelative(-1.7f, -1.15f, -3.9f, -1.15f, -5.59f, 0f)
                lineToRelative(-7.0f, 4.72f)
                curveToRelative(-1.38f, 0.93f, -2.2f, 2.48f, -2.2f, 4.14f)
                verticalLineToRelative(9.28f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-9.28f)
                curveToRelative(0f, -1.67f, -0.82f, -3.21f, -2.2f, -4.14f)
                close()
                moveTo(20f, 16f)
                curveToRelative(0.01f, 0.58f, -0.55f, 1.11f, -1.13f, 0.97f)
                curveToRelative(-0.44f, 1.74f, -2.0f, 3.03f, -3.87f, 3.03f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.87f, 0f, -3.43f, -1.29f, -3.87f, -3.03f)
                curveToRelative(-0.58f, 0.14f, -1.14f, -0.39f, -1.13f, -0.97f)
                verticalLineToRelative(-3f)
                curveToRelative(-0.01f, -0.58f, 0.55f, -1.11f, 1.13f, -0.97f)
                curveToRelative(0.44f, -1.73f, 2.0f, -3.03f, 3.87f, -3.03f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                curveToRelative(1.87f, 0f, 3.43f, 1.29f, 3.87f, 3.03f)
                curveToRelative(0.58f, -0.14f, 1.14f, 0.39f, 1.13f, 0.97f)
                close()
            }
        }.also { _HomeRobot = it}

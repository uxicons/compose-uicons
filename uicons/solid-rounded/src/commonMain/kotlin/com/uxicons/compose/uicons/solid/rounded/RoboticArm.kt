package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoboticArm: ImageVector? = null

val Icons.Sr.RoboticArm: ImageVector
    get() = _RoboticArm ?: UXIcon(name = "RoboticArm") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 10f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(9.57f, 4.02f)
                lineToRelative(-2.98f, 2.98f)
                horizontalLineToRelative(-1.93f)
                curveToRelative(-1.33f, 0f, -2.59f, 0.52f, -3.54f, 1.46f)
                lineToRelative(-0.83f, 0.83f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(0.83f, -0.83f)
                curveToRelative(0.56f, -0.56f, 1.33f, -0.88f, 2.12f, -0.88f)
                horizontalLineToRelative(1.34f)
                verticalLineToRelative(1.34f)
                curveToRelative(0f, 0.79f, -0.32f, 1.56f, -0.88f, 2.12f)
                lineToRelative(-0.83f, 0.83f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(0.83f, -0.83f)
                curveToRelative(0.94f, -0.94f, 1.46f, -2.2f, 1.46f, -3.54f)
                verticalLineToRelative(-1.93f)
                lineToRelative(2.98f, -2.98f)
                curveToRelative(-0.58f, -0.34f, -1.07f, -0.83f, -1.41f, -1.41f)
                close()
                moveTo(18.46f, 8.0f)
                lineToRelative(-2.06f, -3.93f)
                curveToRelative(-0.71f, 1.17f, -2.0f, 1.93f, -3.45f, 1.91f)
                lineToRelative(2.01f, 3.77f)
                curveToRelative(0.82f, -1.05f, 2.07f, -1.74f, 3.5f, -1.75f)
                close()
                moveTo(15f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(23f, 22f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6.7f)
                curveToRelative(-0.82f, 1.03f, -2.08f, 1.7f, -3.5f, 1.7f)
                reflectiveCurveToRelative(-2.67f, -0.67f, -3.5f, -1.7f)
                verticalLineToRelative(6.7f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _RoboticArm = it}

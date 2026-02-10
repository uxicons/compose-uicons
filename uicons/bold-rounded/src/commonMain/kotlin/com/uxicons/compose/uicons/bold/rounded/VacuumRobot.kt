package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VacuumRobot: ImageVector? = null

val Icons.Br.VacuumRobot: ImageVector
    get() = _VacuumRobot ?: UXIcon(name = "VacuumRobot") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 2.56f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-2.09f, 2.09f)
            curveToRelative(-0.87f, -0.68f, -3.45f, -2.53f, -7.35f, -2.53f)
            reflectiveCurveToRelative(-6.48f, 1.86f, -7.35f, 2.53f)
            lineTo(2.56f, 0.44f)
            curveTo(1.98f, -0.15f, 1.02f, -0.15f, 0.44f, 0.44f)
            curveTo(-0.15f, 1.02f, -0.15f, 1.98f, 0.44f, 2.56f)
            lineToRelative(2.09f, 2.09f)
            curveTo(0.95f, 6.69f, 0f, 9.23f, 0f, 12f)
            curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            curveToRelative(0f, -2.77f, -0.95f, -5.31f, -2.53f, -7.35f)
            lineToRelative(2.09f, -2.09f)
            close()
            moveTo(14f, 3.23f)
            verticalLineToRelative(2.19f)
            curveToRelative(-0.61f, -0.27f, -1.29f, -0.42f, -2f, -0.42f)
            reflectiveCurveToRelative(-1.39f, 0.15f, -2f, 0.42f)
            verticalLineToRelative(-2.19f)
            curveToRelative(0.64f, -0.15f, 1.31f, -0.23f, 2f, -0.23f)
            reflectiveCurveToRelative(1.36f, 0.09f, 2f, 0.23f)
            close()
            moveTo(14f, 10f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            curveToRelative(0f, -3.11f, 1.59f, -5.86f, 4f, -7.48f)
            verticalLineToRelative(5.48f)
            curveToRelative(0f, 2.76f, 2.35f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.03f, 5f, -5f)
            verticalLineToRelative(-5.48f)
            curveToRelative(2.41f, 1.62f, 4f, 4.37f, 4f, 7.48f)
            curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
            close()
        }
    }.also { _VacuumRobot = it }

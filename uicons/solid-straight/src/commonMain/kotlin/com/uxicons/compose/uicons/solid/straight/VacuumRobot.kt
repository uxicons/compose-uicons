package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VacuumRobot: ImageVector? = null

val Icons.Ss.VacuumRobot: ImageVector
    get() = _VacuumRobot ?: UXIcon(name = "VacuumRobot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                curveToRelative(0f, -2.9f, 1.03f, -5.56f, 2.75f, -7.64f)
                lineTo(0.1f, 1.71f)
                lineTo(1.51f, 0.29f)
                lineToRelative(2.64f, 2.64f)
                curveToRelative(0.85f, -0.74f, 1.81f, -1.35f, 2.84f, -1.83f)
                verticalLineToRelative(8.89f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                lineTo(17f, 1.1f)
                curveToRelative(0.99f, 0.46f, 1.92f, 1.04f, 2.74f, 1.74f)
                lineTo(22.48f, 0.1f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.75f, 2.75f)
                curveToRelative(1.77f, 2.09f, 2.85f, 4.79f, 2.85f, 7.74f)
                close()
                moveTo(9f, 6.03f)
                curveToRelative(0.84f, -0.64f, 1.87f, -1.03f, 3f, -1.03f)
                reflectiveCurveToRelative(2.16f, 0.39f, 3f, 1.03f)
                lineTo(15f, 0.39f)
                curveToRelative(-0.96f, -0.25f, -1.96f, -0.39f, -3f, -0.39f)
                reflectiveCurveToRelative(-2.04f, 0.14f, -3f, 0.39f)
                verticalLineToRelative(5.63f)
                close()
                moveTo(9f, 10f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                close()
            }
        }.also { _VacuumRobot = it}

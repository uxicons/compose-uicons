package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VacuumRobot: ImageVector? = null

val Icons.Sr.VacuumRobot: ImageVector
    get() = _VacuumRobot ?: UXIcon(name = "VacuumRobot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 0.39f)
                curveToRelative(0.96f, -0.25f, 1.96f, -0.39f, 3f, -0.39f)
                reflectiveCurveToRelative(2.04f, 0.14f, 3f, 0.39f)
                verticalLineToRelative(5.64f)
                curveToRelative(-0.84f, -0.64f, -1.87f, -1.03f, -3f, -1.03f)
                reflectiveCurveToRelative(-2.16f, 0.39f, -3f, 1.03f)
                lineTo(9f, 0.39f)
                close()
                moveTo(9f, 10f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                close()
                moveTo(23.71f, 1.71f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.55f, 2.55f)
                curveToRelative(-0.82f, -0.7f, -1.75f, -1.28f, -2.74f, -1.74f)
                verticalLineToRelative(8.9f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                lineTo(7f, 1.1f)
                curveToRelative(-0.99f, 0.46f, -1.92f, 1.04f, -2.74f, 1.74f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(2.55f, 2.55f)
                curveTo(1.07f, 6.35f, 0f, 9.05f, 0f, 12f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                curveToRelative(0f, -2.95f, -1.07f, -5.65f, -2.85f, -7.74f)
                lineToRelative(2.55f, -2.55f)
                close()
            }
        }.also { _VacuumRobot = it}

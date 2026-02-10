package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VacuumRobot: ImageVector? = null

val Icons.Rr.VacuumRobot: ImageVector
    get() = _VacuumRobot ?: UXIcon(name = "VacuumRobot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 1.71f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.55f, 2.55f)
                curveToRelative(-2.09f, -1.77f, -4.79f, -2.85f, -7.74f, -2.85f)
                reflectiveCurveToRelative(-5.65f, 1.07f, -7.74f, 2.85f)
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
                moveTo(15f, 2.46f)
                verticalLineToRelative(3.56f)
                curveToRelative(-0.84f, -0.64f, -1.87f, -1.03f, -3f, -1.03f)
                reflectiveCurveToRelative(-2.16f, 0.39f, -3f, 1.03f)
                verticalLineToRelative(-3.56f)
                curveToRelative(0.95f, -0.3f, 1.96f, -0.46f, 3f, -0.46f)
                reflectiveCurveToRelative(2.05f, 0.16f, 3f, 0.46f)
                close()
                moveTo(15f, 10f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                curveToRelative(0f, -3.69f, 2.02f, -6.92f, 5f, -8.65f)
                verticalLineToRelative(6.65f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                lineTo(17f, 3.35f)
                curveToRelative(2.98f, 1.73f, 5f, 4.96f, 5f, 8.65f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _VacuumRobot = it}

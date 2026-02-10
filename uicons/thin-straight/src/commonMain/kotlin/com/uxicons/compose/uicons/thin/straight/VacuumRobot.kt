package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VacuumRobot: ImageVector? = null

val Icons.Ts.VacuumRobot: ImageVector
    get() = _VacuumRobot ?: UXIcon(name = "VacuumRobot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.82f, 3.89f)
                lineToRelative(3.17f, -3.17f)
                lineTo(23.29f, 0.01f)
                lineToRelative(-3.17f, 3.17f)
                curveToRelative(-2.14f, -1.97f, -4.98f, -3.18f, -8.11f, -3.18f)
                reflectiveCurveTo(6.03f, 1.21f, 3.89f, 3.18f)
                lineTo(0.72f, 0.02f)
                lineTo(0.02f, 0.72f)
                lineToRelative(3.17f, 3.17f)
                curveTo(1.21f, 6.03f, 0f, 8.87f, 0f, 12f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                curveToRelative(0f, -3.13f, -1.21f, -5.97f, -3.18f, -8.11f)
                close()
                moveTo(16f, 1.76f)
                verticalLineToRelative(5.27f)
                curveToRelative(-0.91f, -1.23f, -2.36f, -2.03f, -4f, -2.03f)
                reflectiveCurveToRelative(-3.09f, 0.81f, -4f, 2.03f)
                lineTo(8f, 1.76f)
                curveToRelative(1.24f, -0.49f, 2.59f, -0.76f, 4f, -0.76f)
                reflectiveCurveToRelative(2.76f, 0.28f, 4f, 0.76f)
                close()
                moveTo(16f, 10f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                curveTo(1f, 7.74f, 3.44f, 4.04f, 7f, 2.21f)
                verticalLineToRelative(7.79f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                lineTo(17f, 2.21f)
                curveToRelative(3.56f, 1.82f, 6f, 5.52f, 6f, 9.79f)
                curveToRelative(0f, 6.07f, -4.93f, 11f, -11f, 11f)
                close()
            }
        }.also { _VacuumRobot = it}

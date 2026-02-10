package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VacuumRobot: ImageVector? = null

val Icons.Bs.VacuumRobot: ImageVector
    get() = _VacuumRobot ?: UXIcon(name = "VacuumRobot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.47f, 4.65f)
                lineToRelative(2.48f, -2.48f)
                lineTo(21.82f, 0.06f)
                lineToRelative(-2.48f, 2.48f)
                curveToRelative(-2.03f, -1.58f, -4.58f, -2.53f, -7.35f, -2.53f)
                reflectiveCurveToRelative(-5.31f, 0.95f, -7.35f, 2.53f)
                lineTo(2.18f, 0.06f)
                lineTo(0.06f, 2.18f)
                lineToRelative(2.48f, 2.48f)
                curveTo(0.95f, 6.69f, 0f, 9.23f, 0f, 12f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                curveToRelative(0f, -2.77f, -0.95f, -5.31f, -2.53f, -7.35f)
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
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-5.48f)
                curveToRelative(2.41f, 1.62f, 4f, 4.37f, 4f, 7.48f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                close()
            }
        }.also { _VacuumRobot = it}

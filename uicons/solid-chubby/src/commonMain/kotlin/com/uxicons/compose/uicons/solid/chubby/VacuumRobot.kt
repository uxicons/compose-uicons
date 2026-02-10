package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VacuumRobot: ImageVector? = null

val Icons.Sc.VacuumRobot: ImageVector
    get() = _VacuumRobot ?: UXIcon(name = "VacuumRobot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(-1.19f, 0f, -2.14f, 0.21f, -2.9f, 0.6f)
                curveToRelative(0.11f, -2.47f, 0.29f, -4.38f, 0.42f, -5.46f)
                curveToRelative(0.77f, -0.09f, 1.59f, -0.14f, 2.48f, -0.14f)
                reflectiveCurveToRelative(1.71f, 0.05f, 2.48f, 0.14f)
                curveToRelative(0.12f, 1.08f, 0.3f, 2.99f, 0.41f, 5.46f)
                curveToRelative(-0.76f, -0.4f, -1.71f, -0.6f, -2.9f, -0.6f)
                close()
                moveTo(21.5f, 5.06f)
                curveToRelative(0.42f, -0.44f, 0.89f, -1.03f, 1.33f, -1.86f)
                curveToRelative(0.39f, -0.73f, 0.11f, -1.64f, -0.62f, -2.03f)
                curveToRelative(-0.73f, -0.39f, -1.64f, -0.11f, -2.03f, 0.62f)
                curveToRelative(-0.26f, 0.48f, -0.5f, 0.82f, -0.71f, 1.05f)
                curveToRelative(-0.82f, -0.58f, -1.8f, -1.02f, -2.93f, -1.32f)
                curveToRelative(0.19f, 1.89f, 0.46f, 5.25f, 0.46f, 9.48f)
                curveToRelative(0f, 3.41f, -1.59f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -1.59f, -5f, -5f)
                curveToRelative(0f, -4.22f, 0.27f, -7.59f, 0.46f, -9.48f)
                curveToRelative(-1.13f, 0.3f, -2.11f, 0.74f, -2.93f, 1.32f)
                curveToRelative(-0.21f, -0.24f, -0.45f, -0.57f, -0.71f, -1.05f)
                curveToRelative(-0.39f, -0.73f, -1.29f, -1.01f, -2.03f, -0.62f)
                curveToRelative(-0.73f, 0.39f, -1.01f, 1.3f, -0.62f, 2.03f)
                curveToRelative(0.44f, 0.83f, 0.9f, 1.42f, 1.33f, 1.86f)
                curveToRelative(-1.02f, 1.71f, -1.5f, 4.0f, -1.5f, 6.94f)
                curveToRelative(0f, 7.71f, 3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                curveToRelative(0f, -2.93f, -0.48f, -5.22f, -1.5f, -6.94f)
                close()
                moveTo(12f, 14f)
                curveToRelative(2.3f, 0f, 3f, -0.7f, 3f, -3f)
                reflectiveCurveToRelative(-0.7f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 0.7f, -3f, 3f)
                reflectiveCurveToRelative(0.7f, 3f, 3f, 3f)
                close()
            }
        }.also { _VacuumRobot = it}

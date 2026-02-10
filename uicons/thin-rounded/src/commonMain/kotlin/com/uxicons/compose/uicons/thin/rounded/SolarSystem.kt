package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SolarSystem: ImageVector? = null

val Icons.Tr.SolarSystem: ImageVector
    get() = _SolarSystem ?: UXIcon(name = "SolarSystem") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 12f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(11f, 12f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(7f, 10f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(7f, 7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(20f, 7f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                close()
                moveTo(20f, 2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                curveToRelative(1.25f, 0f, 2.47f, 0.19f, 3.65f, 0.56f)
                curveToRelative(0.26f, 0.08f, 0.41f, 0.36f, 0.33f, 0.63f)
                reflectiveCurveToRelative(-0.36f, 0.41f, -0.63f, 0.33f)
                curveToRelative(-1.08f, -0.34f, -2.21f, -0.52f, -3.35f, -0.52f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                curveToRelative(0f, -1.14f, -0.17f, -2.27f, -0.52f, -3.35f)
                curveToRelative(-0.08f, -0.26f, 0.06f, -0.54f, 0.33f, -0.63f)
                curveToRelative(0.26f, -0.08f, 0.54f, 0.06f, 0.63f, 0.33f)
                curveToRelative(0.38f, 1.18f, 0.56f, 2.41f, 0.56f, 3.65f)
                close()
                moveTo(12f, 5f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                curveToRelative(-3.64f, 0f, -6.7f, -2.84f, -6.98f, -6.46f)
                curveToRelative(-0.02f, -0.28f, 0.19f, -0.52f, 0.46f, -0.54f)
                curveToRelative(0.24f, -0.03f, 0.52f, 0.18f, 0.54f, 0.46f)
                curveToRelative(0.24f, 3.1f, 2.86f, 5.54f, 5.98f, 5.54f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                curveToRelative(-0.16f, 0f, -0.31f, 0.01f, -0.47f, 0.02f)
                curveToRelative(-0.25f, 0.02f, -0.52f, -0.19f, -0.53f, -0.46f)
                curveToRelative(-0.02f, -0.28f, 0.19f, -0.52f, 0.46f, -0.53f)
                curveToRelative(0.18f, -0.01f, 0.35f, -0.02f, 0.54f, -0.02f)
                close()
            }
        }.also { _SolarSystem = it}

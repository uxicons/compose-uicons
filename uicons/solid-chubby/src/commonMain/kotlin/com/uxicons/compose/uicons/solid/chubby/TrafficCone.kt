package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrafficCone: ImageVector? = null

val Icons.Sc.TrafficCone: ImageVector
    get() = _TrafficCone ?: UXIcon(name = "TrafficCone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.82f, 21.91f)
                curveToRelative(-0.2f, 0.04f, -5.02f, 1.09f, -9.82f, 1.09f)
                reflectiveCurveToRelative(-9.62f, -1.05f, -9.82f, -1.09f)
                curveToRelative(-0.81f, -0.18f, -1.32f, -0.98f, -1.14f, -1.79f)
                curveToRelative(0.18f, -0.81f, 0.98f, -1.33f, 1.79f, -1.14f)
                curveToRelative(0.01f, 0.0f, 0.19f, 0.04f, 0.51f, 0.1f)
                curveToRelative(0.17f, -0.89f, 0.38f, -1.79f, 0.63f, -2.67f)
                curveToRelative(2.91f, 0.39f, 5.62f, 0.59f, 8.05f, 0.59f)
                reflectiveCurveToRelative(5.14f, -0.2f, 8.05f, -0.59f)
                curveToRelative(0.25f, 0.89f, 0.46f, 1.78f, 0.63f, 2.67f)
                curveToRelative(0.32f, -0.06f, 0.5f, -0.1f, 0.51f, -0.1f)
                curveToRelative(0.81f, -0.18f, 1.61f, 0.33f, 1.79f, 1.14f)
                curveToRelative(0.18f, 0.81f, -0.33f, 1.61f, -1.14f, 1.79f)
                close()
                moveTo(17.07f, 8.77f)
                curveToRelative(-2.02f, -4.13f, -4.09f, -7.12f, -4.25f, -7.34f)
                curveToRelative(-0.38f, -0.54f, -1.26f, -0.54f, -1.64f, 0f)
                curveToRelative(-0.16f, 0.23f, -2.22f, 3.21f, -4.25f, 7.34f)
                curveToRelative(1.79f, 0.15f, 3.49f, 0.23f, 5.07f, 0.23f)
                reflectiveCurveToRelative(3.28f, -0.08f, 5.07f, -0.23f)
                close()
                moveTo(19.45f, 14.47f)
                curveToRelative(-0.44f, -1.3f, -0.95f, -2.57f, -1.48f, -3.77f)
                curveToRelative(-2.12f, 0.2f, -4.12f, 0.3f, -5.97f, 0.3f)
                reflectiveCurveToRelative(-3.85f, -0.1f, -5.97f, -0.3f)
                curveToRelative(-0.53f, 1.2f, -1.03f, 2.47f, -1.48f, 3.77f)
                curveToRelative(2.69f, 0.35f, 5.2f, 0.53f, 7.45f, 0.53f)
                reflectiveCurveToRelative(4.76f, -0.18f, 7.45f, -0.53f)
                close()
            }
        }.also { _TrafficCone = it}

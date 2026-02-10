package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrafficCone: ImageVector? = null

val Icons.Rc.TrafficCone: ImageVector
    get() = _TrafficCone ?: UXIcon(name = "TrafficCone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.98f, 20.68f)
                curveToRelative(-0.12f, -0.54f, -0.66f, -0.88f, -1.19f, -0.76f)
                curveToRelative(-0.01f, 0.0f, -0.36f, 0.08f, -0.95f, 0.19f)
                curveToRelative(-1.26f, -8.92f, -7.73f, -18.27f, -8.02f, -18.67f)
                curveToRelative(-0.38f, -0.54f, -1.26f, -0.54f, -1.64f, 0f)
                curveToRelative(-0.28f, 0.41f, -6.75f, 9.75f, -8.02f, 18.67f)
                curveToRelative(-0.59f, -0.11f, -0.94f, -0.18f, -0.95f, -0.19f)
                curveToRelative(-0.53f, -0.12f, -1.07f, 0.22f, -1.19f, 0.76f)
                curveToRelative(-0.12f, 0.54f, 0.22f, 1.07f, 0.76f, 1.19f)
                curveToRelative(0.21f, 0.05f, 5.23f, 1.14f, 10.21f, 1.14f)
                reflectiveCurveToRelative(10.0f, -1.09f, 10.21f, -1.14f)
                curveToRelative(0.54f, -0.12f, 0.88f, -0.65f, 0.76f, -1.19f)
                close()
                moveTo(12f, 3.82f)
                curveToRelative(0.7f, 1.11f, 1.78f, 2.9f, 2.87f, 5.05f)
                curveToRelative(-1.01f, 0.07f, -1.98f, 0.12f, -2.87f, 0.12f)
                reflectiveCurveToRelative(-1.87f, -0.05f, -2.87f, -0.12f)
                curveToRelative(1.1f, -2.16f, 2.17f, -3.94f, 2.87f, -5.05f)
                close()
                moveTo(8.19f, 10.81f)
                curveToRelative(1.35f, 0.12f, 2.63f, 0.19f, 3.81f, 0.19f)
                reflectiveCurveToRelative(2.46f, -0.07f, 3.81f, -0.19f)
                curveToRelative(0.56f, 1.21f, 1.1f, 2.49f, 1.57f, 3.82f)
                curveToRelative(-1.95f, 0.24f, -3.76f, 0.37f, -5.38f, 0.37f)
                reflectiveCurveToRelative(-3.44f, -0.13f, -5.38f, -0.37f)
                curveToRelative(0.47f, -1.32f, 1.01f, -2.61f, 1.57f, -3.82f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-2.48f, 0f, -5.0f, -0.29f, -6.87f, -0.57f)
                curveToRelative(0.18f, -1.28f, 0.47f, -2.58f, 0.85f, -3.86f)
                curveToRelative(2.17f, 0.28f, 4.2f, 0.43f, 6.01f, 0.43f)
                reflectiveCurveToRelative(3.84f, -0.15f, 6.01f, -0.43f)
                curveToRelative(0.38f, 1.28f, 0.68f, 2.58f, 0.85f, 3.86f)
                curveToRelative(-1.87f, 0.28f, -4.39f, 0.57f, -6.87f, 0.57f)
                close()
            }
        }.also { _TrafficCone = it}
